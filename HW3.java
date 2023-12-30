import java.util.Arrays;
import java.lang.Character;
import java.lang.Math;
import java.lang.String;

public class HW3 {
    public static String replaceVovels(String str) {
        str = str.toLowerCase();
        str = str.replace("a", "*");
        str = str.replace("e", "*");
        str = str.replace("i", "*");
        str = str.replace("o", "*");
        str = str.replace("u", "*");
        str = str.replace("y", "*");
        return str;
    }

    public static String gTransform(String str) {
        String a = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                a += "Double" + Character.toUpperCase(str.charAt(i));
                i += 1;
            } else {
                a += str.charAt(i);
            }
        }
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            a += str.charAt(str.length() - 1);
        }
        return a;
    }

    public static boolean doesBlockFit(int a, int b, int c, int w, int h) {
        if (a <= w && b <= h || b <= w && c <= h || c <= w && a <= h || a <= h && b <= w || b <= h && c <= w
                || c <= h && a <= w) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numCheck(int q) {
        int w = 0;
        int res = q;
        while (res > 0) {
            int qq = res % 10;
            w += qq * qq;
            res /= 10;
        }
        if (q % 2 == w % 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int countRoots(int[] arr) {
        if (arr.length < 3) {
            System.out.println("The array contains insufficient data. Please enter an array of three elements!");
            return -0;
        }
        if (arr.length > 3) {
            System.out.println("The array contains too much data. Please enter an array of three elements!");
            return +0;
        }

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int discriminant = b * b - (4 * a * c);

        double sqrtDiscriminant = Math.sqrt(discriminant);
        double x1 = (-b + sqrtDiscriminant) / (2 * a);
        double x2 = (-b - sqrtDiscriminant) / (2 * a);

        if (discriminant < 0) {
            return 0;
        }
        if (discriminant == 0) {
            return 1;
        }
        if (x1 % 1 == 0 && x2 % 1 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static String[] saleDate(String[][] arrOfArr) {
        String r = "";

        for (int i = 0; i < arrOfArr.length; i++) {
            String[] qq = arrOfArr[i];
            if (qq.length == 5) {
                r += qq[0] + " ";
            }
        }
        String[] h = r.split(" ");
        return h;
    }

    public static boolean validSplit(String str) {
        String[] arrStr = str.split(" ");

        for (int i = 0; i < arrStr.length; i++) {
            char[] c = arrStr[i].toCharArray();
            char[] d = arrStr[i + 1].toCharArray();
            if (c[c.length - 1] == d[0]) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean waveForm(int[] arr) {

        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i + 1] > arr[i]) {
                if (arr[i + 1] > arr[i + 2]) {
                    return true;
                }
                return false;
            } else if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > arr[i + 2]) {
                    return false;
                }
                return false;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static char commonVovel(String s) {
        String vowels = "aeiouy";
        int[] counts = new int[100];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if (vowels.contains(String.valueOf(c))) {
                int index = vowels.indexOf(c);
                counts[index]++;
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return vowels.charAt(maxIndex);
    }

    public static int[][] dataScience(int[][] arr) {
        double a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    a = a + arr[j][i];
                }
            }
            arr[i][i] = (int) Math.round(a / 4);
            a = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("==1 TASK==");
        System.out.println(replaceVovels("apple"));
        System.out.println(replaceVovels(
                "Even if you did this task not by yourself, you have to understand every single line of code."));
        System.out.println();

        System.out.println("==2 TASK==");
        System.out.println(gTransform("hello"));
        System.out.println(gTransform("bookkeeper"));
        System.out.println();

        System.out.println("==3 TASK==");
        System.out.println(doesBlockFit(1, 3, 5, 4, 5));
        System.out.println(doesBlockFit(1, 8, 1, 1, 1));
        System.out.println(doesBlockFit(1, 2, 2, 1, 1));
        System.out.println();

        System.out.println("==4 TASK==");
        System.out.println(numCheck(243));
        System.out.println(numCheck(52));
        System.out.println();

        System.out.println("==5 TASK==");
        System.out.println(countRoots(new int[] { 1, -3, 2 }));
        System.out.println(countRoots(new int[] { 2, 5, 2 }));
        System.out.println(countRoots(new int[] { 1, -6, 9 }));
        System.out.println();

        System.out.println("==6 TASK==");
        String[][] ar = { { "Apple", "Shop1", "Shop2", "Shop3", "Shop4" }, { "Banan", "Shop2", "Shop3", "Shop4" },
                { "Orange", "Shop1", "Shop3", "Shop4" }, { "Pear", "Shop2", "Shop4" } };
        String[][] ar1 = { { "Fridge", "Shop2", "Shop3" }, { "Microwave", "Shop1", "Shop2", "Shop3", "Shop4" },
                { "Laptop", "Shop3", "Shop4" }, { "Phone", "Shop1", "Shop2", "Shop3", "Shop4" } };
        System.out.println(Arrays.toString(saleDate(ar)));
        System.out.println(Arrays.toString(saleDate(ar1)));
        System.out.println();

        System.out.println("==7 TASK==");
        System.out.println(validSplit("apple eagle egg goat"));
        System.out.println(validSplit("cat dog goose fish"));
        System.out.println();

        System.out.println("==8 TASK==");
        System.out.println(waveForm(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(waveForm(new int[] { 1, 2, -6, 10, 3 }));
        System.out.println();

        System.out.println("==9 TASK==");
        System.out.println(commonVovel("Hello word"));
        System.out.println(commonVovel("Actions speak louder than words"));
        System.out.println();

        System.out.println("==10 TASK==");
        int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 5, 5, 5, 5, 5 }, { 7, 4, 3, 14, 2 },
                { 1, 0, 11, 10, 1 } };
        int[][] a1 = { { 6, 4, 19, 0, 0 }, { 81, 25, 3, 1, 17 }, { 48, 12, 60, 32, 14 }, { 91, 47, 16, 65, 217 },
                { 5, 73, 0, 4, 21 } };
        System.out.println(Arrays.deepToString(dataScience(a)));
        System.out.println(Arrays.deepToString(dataScience(a1)));
    }
}