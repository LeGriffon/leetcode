
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        while(aLength >=0 || bLength >=0) {
            int sum = carry;
            if(bLength >= 0) {
                sum += b.charAt(bLength--) - '0';
            }
            if(aLength >= 0) {
                sum += a.charAt(aLength--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
