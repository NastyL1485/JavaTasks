public class TaskFour2 {

    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
    }

    public static String triangleType(int x, float y, float z) {
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z && x == z) {
                return "isosceles";
            } else if ((x == y && y != z) || (y == z && z != x) || (x == z && z != y)) {
                return "equilateral";
            } else {
                return "different-sided";
            }
        } else {
            return "not a triangle";
        }
    }
}