public class TaskFive {
    public static float ternaryEvaluation(int x, int y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
    }
}
