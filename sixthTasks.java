import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class sixthTasks {
        public static void main(String[] args) {
            //1
            System.out.println("Задание 1");
            System.out.println(hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived"));
            System.out.println(hiddenAnagram("An old west action hero actor", "Clint Eastwood"));
            System.out.println(hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
            System.out.println(hiddenAnagram("Banana? margaritas", "ANAGRAM"));
            System.out.println(hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
            System.out.println(hiddenAnagram("Bright is the moon", "Bongo mirth"));

            System.out.println("-----");

            //2
            System.out.println("Задание 2");
            System.out.println(Arrays.toString(collect("intercontinentalisationalism", 6)));
            System.out.println(Arrays.toString(collect("strengths", 3)));
            System.out.println(Arrays.toString(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)));
            System.out.println(Arrays.toString(collect("strengths", 333)));

            System.out.println("-----");

            //3
            System.out.println("Задание 3");
            System.out.println(nicoCipher("myworldevolvesinhers", "tesh"));
            System.out.println(nicoCipher("andiloveherso", "tesha"));
            System.out.println(nicoCipher("mubashirhassan", "crazy"));
            System.out.println(nicoCipher("edabitisamazing", "matt"));
            System.out.println(nicoCipher("iloveher", "612345"));

            System.out.println("-----");

            //4
            System.out.println("Задание 4");
            int[] x = {1, 2, 3, 9, 4, 5, 15};
            int[] x2 = {1, 2, 3, 9, 4, 15, 3, 5};
            int[] x3 = {1,  2, -1,  4,  5,  6,  10, 7};
            int[] x4 = {1, 2, 3, 4, 5,  6, 7, 8, 9, 10};
            int[] x5 = {100, 12, 4, 1, 2};
            System.out.println(Arrays.toString(twoProduct(x, 45)));
            System.out.println(Arrays.toString(twoProduct(x2, 45)));
            System.out.println(Arrays.toString(twoProduct(x3, 20)));
            System.out.println(Arrays.toString(twoProduct(x4, 10)));
            System.out.println(Arrays.toString(twoProduct(x5, 15)));

            System.out.println("-----");

            //5
            System.out.println("Задание 5");
            System.out.println(Arrays.toString(isExact(6)));
            System.out.println(Arrays.toString(isExact(24)));
            System.out.println(Arrays.toString(isExact(125)));
            System.out.println(Arrays.toString(isExact(720)));
            System.out.println(Arrays.toString(isExact(1024)));
            System.out.println(Arrays.toString(isExact(40320)));

            System.out.println("-----");

            //6
            System.out.println("Задание 6");
            System.out.println(fractions("0.(6)"));
            System.out.println(fractions("1.(1)"));
            System.out.println(fractions("3.(142857)"));
            System.out.println(fractions("0.19(2367)"));
            System.out.println(fractions("0.1097(3)"));

            System.out.println("-----");

            //7
            System.out.println("Задание 7");
            System.out.println(pilish_string("3331444"));
            System.out.println(pilish_string("TOP"));
            System.out.println(pilish_string("X"));
            System.out.println(pilish_string(""));


            System.out.println("-----");

            //8
            System.out.println("Задание 8");
            System.out.println(generateNonconsecutive("3 + 5 * (2 - 6)"));
            System.out.println(generateNonconsecutive("6 - 18 / (-1 + 4)"));
            System.out.println(generateNonconsecutive("-(-5)"));

            System.out.println("-----");

            //9
            System.out.println("Задание 9");
            System.out.println(isValid("aabbcd"));
            System.out.println(isValid("aabbccddeefghi"));
            System.out.println(isValid("abcdefghhgfedecba"));

            System.out.println("-----");

            //10
            System.out.println("Задание 10");
            System.out.println(findLCS("abcd", "bd"));
            System.out.println(findLCS("aggtab", "gxtxamb"));




        }

        //задание 1
        public static Boolean isAnagram(String o1, String o2) {
            char[] oo1 = o1.toCharArray();
            char[] oo2 = o2.toCharArray();
            Arrays.sort(oo1);
            Arrays.sort(oo2);
            for (int i = 0; i < oo1.length; i++) {
                if (oo1[i] != oo2[i])
                    return false;
            }
            return true;
        }
        public static String hiddenAnagram(String str1, String str2){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            str1 = str1.replaceAll("[^a-z]", "");
            str2 = str2.replaceAll("[^a-z]", "");
            for (int i = 0; i<= str1.length()-str2.length(); i++){
                String otv = str1.substring(i, i + str2.length());
                if(isAnagram(str2, otv)) {
                    return otv;
                }
            }
            return "notfound";
        }

        //задание 2
        public static  String[] collect(String str, int x){
            String[] no = {};
            if (str.length() < x){
                return no;
            }
            int cnt = str.length() / x;
            char[] chars = str.toCharArray();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < cnt; i++){
                list.add(String.valueOf(Arrays.copyOfRange(chars, i*x, i*x + x)));
            }
            Collections.sort(list);
            String[] otv = new String[list.size()];
            otv = list.toArray(otv);
            return otv;

        }

        //задание 3
        public static String nicoCipher(String message, String key) {
            int mesLen = message.length();
            int keyLen = key.length();
            char[][] chars = new char[mesLen / keyLen + 2][keyLen];
            for (int i = 0; i < keyLen; i++) {
                chars[0][i] = key.charAt(i);
            }

            int k = 0;
            for (int i = 1; i < mesLen / keyLen + 2; i++) {
                for (int j = 0; j < keyLen; j++) {
                    if (k >= mesLen) {
                        break;
                    }
                    chars[i][j] = message.charAt(k);
                    k++;
                }
            }
            sortColumns(chars);

            String result = "";

            for (int i = 1; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    if (chars[i][j] != Character.MIN_VALUE) {
                        result += chars[i][j];
                    } else {
                        result += " ";
                    }
                }
            }
            return result;
        }

        private static void sortColumns(char[][] matrix) {
            for (int a = 0; a < matrix.length; a++) {
                for (int i = 1; i < matrix[a].length; i++) {
                    if (matrix[0][i - 1] > matrix[0][i]) {
                        for (int j = 0; j < matrix.length; j++) {
                            char tmp = matrix[j][i - 1];
                            matrix[j][i - 1] = matrix[j][i];
                            matrix[j][i] = tmp;
                        }
                    }
                }
            }
        }

        //задание 4
        public static int[] twoProduct(int[] arr, int n){
            int[] otv = new int[2];
            for (int i=0; i < arr.length; i++){
                for (int j=i+1; j< arr.length; j++){
                    if(arr[i]*arr[j] == n){
                        otv[1] = arr[j];
                        otv[0] = arr[i];
                        break;
                    }
                }
            }
            if(otv == null){
                return new int[0];
            }
            else{
                return otv;
            }

        }

        //задание 5
        public static int[] isExact(int num) {
            int result = factorial(1, 2, num);
            if (result != -1) {
                return new int[]{ num, result };
            } else {
                return new int[0];
            }
        }

        public static int factorial(int num, int next, int target) {
            if (num * next < target) {
                return factorial(num * next, ++next, target);
            } else if (num * next > target) {
                return -1;
            } else {
                return next;
            }
        }

        //задание 6
        public static String fractions(String decimalStr) {
            String repeatingPart = decimalStr.substring(decimalStr.indexOf('(') + 1, decimalStr.indexOf(')'));

            String nonRepeatingPart = decimalStr.substring(0, decimalStr.indexOf('('));

            String beforedot = decimalStr.substring(decimalStr.indexOf('.') + 1, decimalStr.indexOf('('));

            int denominator = Integer.parseInt(makeDenomOfNumer(repeatingPart.length(), beforedot.length()));

            int numerator = Integer.parseInt(decimalStr.replace(".", "").replace("(", "").replace(")", ""))
                    - Integer.parseInt(nonRepeatingPart.replace(".", ""));


            int nod = findNOD(numerator, denominator);
            numerator /= nod;
            denominator /= nod;

            return numerator + "/" + denominator;
        }

        public static String makeDenomOfNumer(int firstl, int secondl) {
            String res = "";
            for (int i=0; i<firstl; i++) {
                res += "9";
            }
            for (int i=0; i<secondl; i++) {
                res += "0";
            }
            return res;
        }

        private static int findNOD(int num1, int num2) {
            int max = Integer.max(num1, num2);
            for (int i = max; i > 1; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    return i;
                }
            }
            return 1;
        }

        //задание 7
        public static String pilish_string (String str) {
            if(str.equals("")){
                return str;

            }
            ArrayList<String> list = new ArrayList<>();
            double pi = Math.PI;
            String strPi = String.valueOf(pi);
            char[] chars = strPi.toCharArray();
            char[] chars2 = str.toCharArray();
            int startInd = 0;
            for (char i : chars) {
                if (i != '.') {
                    int length = Integer.parseInt(String.valueOf(i));
                    int counter = 0;
                    StringBuilder stB = new StringBuilder();
                    if (startInd >= chars2.length) {
                        break;
                    }
                    for (int j = startInd; j < startInd + length; j++) {
                        if (j < chars2.length) {
                            stB.append(chars2[j]);
                        } else {
                            int lenRep = length - counter;
                            stB.append(stB.substring(stB.length() - 1).repeat(lenRep));
                            break;
                        }
                        counter += 1;
                        if (counter == length) {
                            break;
                        }
                    }
                    list.add(stB.toString());
                    startInd += Integer.parseInt(String.valueOf(i));
                }
            }
            StringBuilder out = new StringBuilder();
            for (String i : list) {
                out.append(" ").append(i);
            }
            return out.substring(1);
        }

        //задание 8
        public static String generateNonconsecutive(String str) {
            str = str.replaceAll("\\(", " ( ").replaceAll("\\)", " ) ");
            String[] array = str.split(" ");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
            while (list.contains("")) {
                list.remove("");
            }
            list = evaluateExpression(list);

            return String.valueOf(list.get(0));
        }

    private static ArrayList<String> evaluateExpression(ArrayList<String> list) {
        while (list.contains("(")) {
            int openIndex = list.lastIndexOf("(");
            int closeIndex = 0;
            for (int i = openIndex + 1; i < list.size(); i++) {
                if (list.get(i).equals(")")) {
                    closeIndex = i;
                    break;
                }
            }
            ArrayList<String> subList = new ArrayList<>(list.subList(openIndex + 1, closeIndex));

            String result = evaluateExpression(subList).get(0);
            replaceSubList(list, result, openIndex, closeIndex);
        }

        while(list.size() > 1){
            for(int i = 0; i < list.size(); i++){
                if (list.get(i).equals("*") || list.get(i).equals("/")){
                    evaluateOperation(list, list.get(i));
                    i = 0;
                }
            }

            for(int j = 0; j < list.size(); j++){
                if (list.get(j).equals("+") || list.get(j).equals("-")){
                    evaluateOperation(list, list.get(j));
                    j = 0;

                }
            }
        }

        return list;
    }

    private static void replaceSubList(ArrayList<String> list, String replaceStr, int firstInd, int lastInd) {
        list.subList(firstInd, lastInd + 1).clear();
        list.add(firstInd, replaceStr);
    }

    private static void evaluateOperation(ArrayList<String> list, String operator) {
        while (list.contains(operator)) {
            int index = list.indexOf(operator);

            //минусы
            if (operator.equals("-") && (index == 0)) {
                double operand = Double.parseDouble(list.get(index + 1));
                double result = -operand;
                list.remove(index);
                list.remove(index);
                list.add(index, String.valueOf(result));
            } else {
                double first = Double.parseDouble(list.get(index - 1));
                double second = Double.parseDouble(list.get(index + 1));
                double result = 0;

                switch (operator) {
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        if (second != 0) {
                            result = first / second;
                        } else {
                            throw new ArithmeticException("Деление на ноль!");
                        }
                        break;
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                }
                replaceSubList(list, String.valueOf(result), index - 1, index + 1);
            }
        }
    }

        //задание 9
        public static String isValid(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = str.toCharArray();
            for (char i : chars) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            Integer[] nums = map.values().toArray(new Integer[0]);
            Arrays.sort(nums);
            boolean flag = true;
            Integer first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                if (!first.equals(nums[i])) {
                    flag = false;
                    break;
                }
            }
            if (!nums[nums.length - 1].equals(first + 1) && !nums[nums.length - 1].equals(first)) {
                flag = false;
            }
            return flag ? "YES" : "NO";
        }

        //задание 10
        public static String findLCS(String str1, String str2)
        {
            String[][] matrix = new String[str1.length() + 1][str2.length() + 1];
            for (String[] arr: matrix) {
                Arrays.fill(arr, "");
            }

            for (int i = matrix.length - 2; i >= 0; i--) {
                for(int j = matrix[i].length - 2; j >= 0; j--) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        matrix[i][j] = str1.charAt(i) + matrix[i + 1][j + 1];
                    } else {
                        if (matrix[i][j + 1].length() > matrix[i + 1][j].length()) {
                            matrix[i][j] = matrix[i][j + 1];
                        } else {
                            matrix[i][j] = matrix[i + 1][j];
                        }
                    }
                }
            }
            return matrix[0][0];
        }
}
