import java.util.Arrays;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;

public class HW2 {
    public static boolean duplicateChars(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k))
                    return true;
            }
        }
        return false;
    }

    public static String getInitials(String init) {
        String a = "" + init.charAt(0);
        for (int i = 0; i < init.length(); i++) {
            if (init.charAt(i) == ' ') {
                a += init.charAt(i + 1);
            }
        }
        return a;
    }

    public static int differenceEvenOdd(int[] a) {
        int sum = 0, i;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sum += a[i]; // sum = sum + a[i]
            else
                sum -= a[i]; // sum = sum - a[i]
        }
        return Math.abs(sum);
    }

    public static String equalToAvg(int[] arr) {
        float avg = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;
        for (i = 0; i < arr.length; i++) {
            if (avg == arr[i]) {
                return "true";
            }
        }
        return "false";
    }

    public static int[] indexMult(int[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] *= i;
        }
        return d;
    }

    public static String reverse(String r) {
        String j = "";
        for (int i = r.length() - 1; i >= 0; i--) {
            j += r.charAt(i);
        }
        return j;
    }

    public static int Tribonacci(int t) {
        int t1 = 0, t2 = 0, t3 = 1, i = 3, y = 0;
        if (t <= 2)
            return 0;
        else if (t == 3)
            return 1;
        else {
            while (i != t) {
                y = t1 + t2 + t3;
                t1 = t2;
                t2 = t3;
                t3 = y;
                i++;
            }
        }
        return y;
    }

    public static StringBuilder pseudoHash(int ph) {
        StringBuilder h = new StringBuilder();
        for (int i = 0; i < ph; i++) {
            int random = (int) (Math.random() * 16);
            switch (random) {
                case 0:
                    h.append("0");
                    break;
                case 1:
                    h.append("1");
                    break;
                case 2:
                    h.append("2");
                    break;
                case 3:
                    h.append("3");
                    break;
                case 4:
                    h.append("4");
                    break;
                case 5:
                    h.append("5");
                    break;
                case 6:
                    h.append("6");
                    break;
                case 7:
                    h.append("7");
                    break;
                case 8:
                    h.append("8");
                    break;
                case 9:
                    h.append("9");
                    break;
                case 10:
                    h.append("a");
                    break;
                case 11:
                    h.append("b");
                    break;
                case 12:
                    h.append("c");
                    break;
                case 13:
                    h.append("d");
                    break;
                case 14:
                    h.append("e");
                    break;
                case 15:
                    h.append("f");
                    break;
            }
        }
        return h;
    }

    public static String botHelper(String help) {

        String[] words = help.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("help")) {
                return "Calling!";
            }
        }
        return "Keep waiting";
    }

    public static String isAnagram(String o1, String o2) {
        char[] oo1 = o1.toCharArray();
        char[] oo2 = o2.toCharArray();
        Arrays.sort(oo1);
        Arrays.sort(oo2);
        for (int i = 0; i < oo1.length; i++) {
            if (oo1[i] != oo2[i])
                return "false";
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));
        System.out.println();

        System.out.println(getInitials("Ryan Gosling"));
        System.out.println(getInitials("Barack Obama"));
        System.out.println();

        int[] a = new int[] { 44, 32, 86, 19 };
        int[] a1 = new int[] { 22, 50, 16, 63, 31, 55 };
        System.out.println(differenceEvenOdd(a));
        System.out.println(differenceEvenOdd(a1));
        System.out.println();

        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] arr1 = new int[] { 22, 50, 16, 63, 31, 55 };
        System.out.println(equalToAvg(arr));
        System.out.println(equalToAvg(arr1));

        System.out.println();

        int[] d = new int[] { 1, 2, 3 };
        // int[] w = indexMult(d);
        // for (int i = 0; i < w.length; i++) {
        // System.out.print(w[i] + " ");
        // }
        System.out.println(Arrays.toString(indexMult(d)));
        System.out.println();
        System.out.println();

        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));
        System.out.println();

        System.out.println(Tribonacci(7));
        System.out.println(Tribonacci(11));
        System.out.println();

        System.out.println(pseudoHash(5));
        System.out.println(pseudoHash(10));
        System.out.println();

        System.out.println(botHelper("Hello, Im under the water, please help me"));
        System.out.println(botHelper("Help"));
        System.out.println();

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
        System.out.println(isAnagram("hello", "world"));
    }
}