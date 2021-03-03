import java.util.*;

class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        for(char ch : keyboard.toCharArray()) {
            map.put(ch, index++);
        }
        
        int result = map.get(word.charAt(0));
        for(int i = 1; i < word.length(); i++) {
            result += Math.abs(map.get(word.charAt(i)) - map.get(word.charAt(i - 1)));
        }
        return result;
    }
}