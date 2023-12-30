abstract class GeometryFigure {
    private String color;
    private int number;
    private String material;
    private int weight;
    private static int count;

    public GeometryFigure(String color, String material, int number) {
        count++;
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public void GeomeryFigure(){
        count++;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMaterial(){
        return this.material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getCount(){
        return count;
    }

    public abstract void shape();
}
