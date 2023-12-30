public class TaskNine {
    public static float ticketSaler( int x, int y){
        return x*y*0.72f;
    }

    public static void main(String[] args){
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
    }
}
