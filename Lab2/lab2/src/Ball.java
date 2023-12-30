public class Ball extends GeometryFigure {
    int r;
    private static int countBalls;
    private boolean isStickerOn;
    public Ball(){
        super("blue", "wood", 19);
        countBalls++;
        this.r = 2;
        this.isStickerOn = true;
    }
    public Ball(String color, String material, int number, int r, boolean isStickerOn) {
        super(color, material, number);
        countBalls++;
        this.r = r;
        this.isStickerOn = isStickerOn;
    }
    public double Diameter () {
        double d;
        d = 2*r;
        System.out.println(d);
        return  d;
    }
    public double Parameter () {
        double c;
        c = 2*Math.PI*r;
        System.out.println(c);
        return c;
    }

    public boolean getIsStickerOn(){
        return this.isStickerOn;
    }

    public void setIsStickeron(boolean isStickerOn){
        this.isStickerOn = isStickerOn;
    }

    public int getR(){
        return this.r;
    }

    public void setR(int r){
        this.r = r;
    }
    @Override
    public void shape() {
        System.out.println("Ball");
    }
    public int getCountBalls(){
        return countBalls;
    }
}
