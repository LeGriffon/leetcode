import java.util.*;

class Solution {
    public int kSimilarity(String A, String B) {
        if(A.equals(B)) return 0;
        Deque<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.addLast(A);
        visited.add(A);
        int result = 0;
        
        while(!queue.isEmpty()) {
            result++;
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                String str = queue.removeFirst();
                int i = 0;
                while(str.charAt(i) == B.charAt(i)) i++;
                for(int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(j) == B.charAt(j) || str.charAt(j) != B.charAt(i)) continue;
                    String temp = swap(str, i, j);
                    if(temp.equals(B)) return result;
                    queue.addLast(temp);
                    visited.add(temp);
                }
            }
        }
        
        return result;
    }
    
    private String swap(String str, int i, int j) {
        char[] strArr = str.toCharArray();
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
        return String.valueOf(strArr);
    }
}