class Solution {
    public boolean isArmstrong(int N) {
        int sum = 0;
        int temp = N;
        int length = String.valueOf(N).length();
        while(temp != 0) {
            int lsd = temp % 10;
            sum += Math.pow(lsd, length);
            temp = temp / 10;
        }
        return sum == N;
    }
}