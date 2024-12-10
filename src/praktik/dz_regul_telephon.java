import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dz_regul_telephon {
    public static void main(String[] args) {
        String s = "+ 7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78, +755555555, +7 (399) 555-55-99 ,+7 777 77 77777";

        String pattern = ".+\\+?7\\s*\\(?[4-9]{3}\\)?\\s*\\-*[0-9]{3}\\s*\\-*[0-9]{2}\\s*\\-*[0-9]{2}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}
