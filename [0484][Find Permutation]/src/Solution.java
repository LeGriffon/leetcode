class Solution {
    public int[] findPermutation(String s) {
        int[] result = new int[s.length() + 1];
        for(int i = 0; i <= s.length(); i++) {
            result[i] = i + 1;
        }
        int i = 0;
        while(i < s.length()) {
            int j = i;
            while(i < s.length() && s.charAt(i) == 'D') {
                i++;
            }
            if(i != j) {
                reverse(result, j, i);
            }
            i++;
        }
        return result;
    }

    private void reverse(int[] result, int left, int right) {
        while(left < right) {
            int temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            left++;
            right--;
        }
    }
}