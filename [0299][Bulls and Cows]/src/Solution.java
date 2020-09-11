import java.util.*;

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        Map<Character, Integer> map = new HashMap<>();
        int length = secret.length();
        for(int i = 0; i < length; i++) {
            char sCh = secret.charAt(i);
            char gCh = guess.charAt(i);
            if(sCh == gCh) {
                bulls++;
            }
            else {
                if(map.getOrDefault(sCh, 0) < 0) {
                    cows++;
                }
                if(map.getOrDefault(gCh, 0) > 0) {
                    cows++;
                }
                map.put(sCh, map.getOrDefault(sCh, 0) + 1);
                map.put(gCh, map.getOrDefault(gCh, 0) - 1);
            }
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}