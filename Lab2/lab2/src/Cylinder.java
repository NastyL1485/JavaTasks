public class Cylinder extends GeometryFigure {
    private int r;
    private String owner;
    private static int countCylinders = 0;

    public Cylinder() {
        super("blue", "plastic", 14);
        countCylinders++;
        this.r = 3;
        this.owner = "Kate";
    }

    public Cylinder(String color, String material, int number, int r, String owner) {
        super(color, material, number);
        countCylinders++;
        this.r = r;
        this.owner = owner;
    }

    public double BasePerimeter() {
        double bp;
        bp = 2 * Math.PI * r;
        System.out.println(bp);
        return bp;
    }

    public void mod(int r){
        int radius = r*r; 
        System.out.println(radius);
    } 

    public void mod(String owner){
        String str = owner + " is owner";
        System.out.println(str);
    }

    public static int getCountCylinders() {
        return countCylinders;
    }

    @Override
    public void shape() {
        System.out.println("Cylinder");
    }
}
