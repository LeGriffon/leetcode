class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) zeroCount++;
        }
        int totalLength = arr.length + zeroCount;
        for(int i = arr.length - 1, j = totalLength - 1; i >= 0 && j >= 0; i--, j--) {
            if(arr[i] != 0) {
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
            }
            else {
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
            }
        }
    }
}