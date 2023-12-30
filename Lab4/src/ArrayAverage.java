public class ArrayAverage {
    public static void main(String[] args){
        int[] arr = {1, 5, 9};
        int sum = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                arr[i]= new Integer("One");
                sum += arr[i];
            }
            System.out.println(sum/arr.length);
        }
        catch(NullPointerException e){//int[] arr = null;
            System.err.println("Массив пустой");
        }
        catch (ArrayIndexOutOfBoundsException e) {//for (int i = 0; i <= arr.length; i++)
            System.err.println("Выход за границы массива");
        }
        catch (NumberFormatException e){ // arr[i]= new Integer("One");
            System.err.println("Введены неверные данные!");
        }
    }
}
