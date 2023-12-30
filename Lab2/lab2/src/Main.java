public class Main {
    public static void main(String[] args){
        Parallelepiped P1 = new Parallelepiped();
        P1.BaseSquare();
        P1.Volume();
        P1.shape();
        Cylinder C1 = new Cylinder("green", "plastic", 10, 2, "Kirill");
        Cylinder C2 = new Cylinder();
        Cylinder C3 = new Cylinder("red", "plastic", 10, 1, "Kirill");
        Cylinder C4 = new Cylinder();
        System.out.println(Cylinder.getCountCylinders());
        System.out.println(C1.getColor());
        System.out.println(C2.getColor());
        System.out.println(C3.getColor());
        C4.mod(5);
        C4.mod("Kate");
    }
}