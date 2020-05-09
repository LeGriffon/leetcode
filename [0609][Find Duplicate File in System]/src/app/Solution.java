package app;

import java.util.*;

public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String path : paths) {
            String[] splits = path.split(" ");
            for(int i = 1; i < splits.length; i++) {
                String[] file = splits[i].split("\\(");
                file[1].replace(")", "");
                map.computeIfAbsent(file[1], k -> new ArrayList<>()).add(splits[0] + "/" + file[0]);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }
        return result;
    }
}