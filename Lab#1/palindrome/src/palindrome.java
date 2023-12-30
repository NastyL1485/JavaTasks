public class palindrome {

        public static String revString(String s) {
            String arr = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                arr += s.charAt(i);
            }
            return arr;
        }

        public static boolean isPalindrome(String s) {
            return revString(s).equals(s);}

        public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + revString(s) + " " + isPalindrome(s));
        }
    }

}