class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null || s.length() == 0) return s;
        int openSeen = 0;
        int balance = 0;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                balance++;
                openSeen++;
            }
            if(ch == ')') {
                if(balance == 0) continue;
                balance--;
            }
            sb.append(ch);
        }

        int openToKeep = openSeen - balance;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == '(') {
                if(openToKeep == 0) continue;
                openToKeep--;
            }
            result.append(ch);
        }
        return result.toString();
    }
}