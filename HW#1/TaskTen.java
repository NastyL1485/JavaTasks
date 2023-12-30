public class TaskTen {
    public static float tables(float x, float y) {
        float sits = y * 2;
        if (x - sits <= 0) {
            return 0;
        } else {
            if (x - sits == 1) {
                return 1;
            }
            if ((x - sits) > 1 && (x - sits) % 2 == 0) {
                return (x - sits) / 2;
            }
            if ((x - sits) > 1 && (x - sits) % 2 != 0) {
                return (x - sits + 1) / 2;
            }
        }
        return sits;
    }

    public static void main(String[] args) {

        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
}
