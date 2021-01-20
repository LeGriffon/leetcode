import java.util.*;

public class FileSystem {
    private Dir root;
    public FileSystem() {
        root = new Dir();
    }
    
    public List<String> ls(String path) {
        Dir r = root;
        List<String> output = new ArrayList<>();
        if(!path.equals("/")) {
            String[] pathArr = path.split("/");
            for(int i = 1; i < pathArr.length - 1; i++) {
                r = r.dirs.get(pathArr[i]);
            }
            if(r.files.containsKey(pathArr[pathArr.length - 1])) {
                output.add(pathArr[pathArr.length - 1]);
                return output;
            }
            else {
                r = r.dirs.get(pathArr[pathArr.length - 1]);
            }
        }
        output.addAll(r.dirs.keySet());
        output.addAll(r.files.keySet());
        Collections.sort(output);
        return output;
    }
    
    public void mkdir(String path) {
        Dir r = root;
        String[] pathArr = path.split("/");
        for(int i = 1; i < pathArr.length; i++) {
            if(!r.dirs.containsKey(pathArr[i])) {
                r.dirs.put(pathArr[i], new Dir());
            }
            r = r.dirs.get(pathArr[i]);
        }
    }
    
    public void addContentToFile(String filePath, String content) {
        Dir r = root;
        String[] pathArr = filePath.split("/");
        for(int i = 1; i < pathArr.length - 1; i++) {
            r = r.dirs.get(pathArr[i]);
        }
        r.files.put(pathArr[pathArr.length - 1], r.files.getOrDefault(pathArr[pathArr.length - 1], "") + content);
    }
    
    public String readContentFromFile(String filePath) {
                Dir r = root;
        String[] pathArr = filePath.split("/");
        for(int i = 1; i < pathArr.length - 1; i++) {
            r = r.dirs.get(pathArr[i]);
        }
        return r.files.get(pathArr[pathArr.length - 1]);
    }
}

class Dir {
    Map<String, Dir> dirs = new HashMap<>();
    Map<String, String> files = new HashMap<>();
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */