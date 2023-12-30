public class Cube extends Parallelepiped{
    int countCube;
    public Cube(String color, String material, int number, int height, int side1, int side2){
        super(color, material, number, height, side1, side2);
        countCube++;
    }
    @Override
    public void shape(){
        System.out.println("Cube");
    }
    public int getCountCube(){
        return countCube;
    }
}
