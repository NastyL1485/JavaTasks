import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ITP\\Lab4\\src\\liner");

        try {
            FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream("D:\\ITP\\Lab4\\src\\empty");

            while (in.available() > 0) {
                int files = in.read();
                out.write(files);
                out.close();
            }
            in.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        catch (IOException e){
            System.out.println("Файл открыт!");
        }
    }
}
