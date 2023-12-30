public class Main {

    public static float convert(int x) {
        return x * 3.785f;
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
    }
}