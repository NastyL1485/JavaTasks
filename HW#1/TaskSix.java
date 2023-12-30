public class TaskSix {
    public static float howManyItems(int l, float w, float h) {
        return (l / (2 * w * h));
    }

    public static void main(String[] args) {
        System.out.println(Math.floor(howManyItems(22, 1.4f, 2)));
        System.out.println(Math.floor(howManyItems(45, 1.8f, 1.9f)));
        System.out.println(Math.floor(howManyItems(100, 2, 2)));
    }
}
