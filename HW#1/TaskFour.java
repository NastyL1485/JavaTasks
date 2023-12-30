public class TaskFour {

    public static String triangleType(int x, int y, int z) {
        boolean triangle = ((x + y) > z) && ((x + z) > y) && ((z + y) > x);
        if (triangle && x == y && y == z && z == x) {
            return "equilateral";
        }
        if (triangle && ((x == y && x != z) || (x == z && x != y) || (z == y && z != x))) {
            return "isosceles";
        }
        if (triangle && x != y && x != z && z != y) {
            return "different-sided";
        } else {
            return "not a triangle";
        }
    }

    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
    }
}