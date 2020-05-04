package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Solution obj = new Solution();
        int result = obj.numUniqueEmails(emails);
        System.out.println(result);
    }
}