public class TaskThree {

    public static float containers(int x, int y, int z) {
        return x * 20 + y * 50 + z * 100;
    }

    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
    }
}