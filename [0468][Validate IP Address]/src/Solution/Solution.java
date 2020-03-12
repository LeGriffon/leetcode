package Solution;

import java.util.regex.*;

public class Solution {
    private String chunckIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private Pattern patternIPv4 = Pattern.compile("^(" + chunckIPv4 + "\\.){3}" + chunckIPv4 + "$");

    private String chunckIPv6 = "([0-9a-fA-F]{1,4})";
    private Pattern patternIPv6 = Pattern.compile("^(" + chunckIPv6 + "\\:){7}" + chunckIPv6 + "$");

    public String validaIPAddress(String IP) {
        if(patternIPv4.matcher(IP).matches()) return "IPv4";
        else return (patternIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }
}