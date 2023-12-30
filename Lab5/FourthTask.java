import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourthTask {

    public static void main(String[] args) {
        try {
            String ipAddress = "254.138.50";
            Pattern pattern = Pattern.compile("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$");

            Matcher matcher = pattern.matcher(ipAddress);
            if (matcher.matches()) {
                System.out.println("IP-адрес корректен.");
            } else {
                System.out.println("IP-адрес некорректен.");
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
    
}
