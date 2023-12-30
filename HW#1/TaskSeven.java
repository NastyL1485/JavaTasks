public class TaskSeven {
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
}
