import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SecondTask {
    public static void main(String[] args) {
        String password = "AAAAAAAAAAAA1";
        Pattern compiledPattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$");

        Matcher matcher = compiledPattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Пароль корректен.");
        } else {
            System.out.println("Пароль некорректен.");
        }
    }
}