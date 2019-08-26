import java.util.*;
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtracking(list, new ArrayList<String>(), s, 0);
        return list;
    }
    private void backtracking(List<List<String>> list, ArrayList<String> tempList, String s, int index) {
        if(index == s.length()) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                tempList.add(s.substring(index, i + 1));
                backtracking(list, tempList, s, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
