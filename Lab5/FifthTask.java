import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FifthTask {
    public static void main(String[] args) {
        String text = "Agony on my mind Apea ";
        String startLetter = "A";
        String patternString = "\\b" + startLetter + "[a-zA-z]*\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Слова, начинающиеся с буквы '" + startLetter + "':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    

}
