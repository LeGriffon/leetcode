class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            char ch = (char) ('A' + (--n % 26));
            n /= 26;
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}