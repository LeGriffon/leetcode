import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
        char[] array = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while(left < right && !set.contains(array[left])) left++;
            while(left < right && !set.contains(array[right])) right--;
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(array);
    }
}