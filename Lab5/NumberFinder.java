import java.io.IOError;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of the product is 1 -2,1 123, 0  0,124, asf1";
        Pattern pattern = Pattern.compile("-?\\d+([.,]\\d+)?");
        Matcher matcher = pattern.matcher(text);
        try{
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }catch(IOError e){
            System.out.println("Ошибка: "+ e);
        }
        
    }
}