public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + reverseString(s) + " " + isPalindrome(s));
        }
    }

    public static String reverseString(String s) {
        String q = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            q = q + s.charAt(i);
        }
        return q;
    }

    public static boolean isPalindrome(String s) {
        return reverseString(s).equals(s);
    }
}