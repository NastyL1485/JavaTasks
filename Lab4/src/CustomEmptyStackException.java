import java.io.FileWriter;
import java.io.*;

public class CustomEmptyStackException extends Throwable {
    public CustomEmptyStackException(String errorMessage) {
        super(errorMessage);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try{
            stack.addElement(3);
            stack.addElement(6);
            System.out.println(stack.readTop());
            stack.deleteElement();
            stack.deleteElement();
            System.out.println(stack.readTop());
        }
        catch (CustomEmptyStackException e){
            logException(e);
        }
    }
    public static void logException (CustomEmptyStackException e){
        try (FileWriter writer = new FileWriter("D:\\ITP\\Lab4\\src\\logs", true)){
            writer.write("Ошибка: " + e.getMessage() + "\n");

        }
        catch(IOException ioException){
            System.out.println("Ошибка записи в файл: " + ioException.getMessage());
        }
    }
}