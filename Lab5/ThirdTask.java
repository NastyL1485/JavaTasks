import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {
    public static void main(String[] args) {
        try {
            String inputText = "У нас есть две ссылки https://www.mtuci.com и https://www.example.com";
            Pattern pattern = Pattern.compile("(https?://\\S+)");
            Matcher matcher = pattern.matcher(inputText);
            StringBuffer result = new StringBuffer();
            while (matcher.find()) {
                String link = matcher.group(1);
                String hyperlink = "<a href=\"" + link + "\">" + link + "</a>";
                matcher.appendReplacement(result, hyperlink);
            }
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
