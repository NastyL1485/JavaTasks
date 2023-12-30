public class Parallelepiped extends GeometryFigure {
    public int height = 0;
    public int side1 = 0;
    public int side2 = 0;
    private static int countParallelepiped = 0;

    public Parallelepiped(){
        super("red", "metal", 7);
        countParallelepiped++;
        this.height = 1;
        this.side1 = 2;
        this.side2 = 3;
    }

    public Parallelepiped(String color, String material, int number, int height, int side1, int side2){
        super(color, material, number);
        countParallelepiped++;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public int BaseSquare() {
        int bs;
        bs = side1 * side2;
        System.out.println(bs);
        return bs;
    }

    public int Volume() {
        int v;
        v = side1*side2*height;
        System.out.println(v);
        return v;
    }

    public int getSide1(){
        return this.side1;
    }

    public void setSide1(int side1){
        this.side1 = side1;
    }

    public int getSide2(){
        return this.side2;
    }

    public void setSide2(int side2){
        this.side2 = side2;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public void shape(){
        System.out.println("Parallelepiped");
    }


    public int getCountParallelepiped(){
        return countParallelepiped;
    }
}
