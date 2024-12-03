package praktik;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Practicinklass {
    public static void main(String[] args) {
        try {
//            String s = "Час в 24- часовом формате от 00 до 23. 2021-06-15T21:45. Минут, в диапозоне от 00 до 59. 2021-06-15T01:09.";
//            String s = "Цифры: 7, +17, -42,0013, 0.3";
//            String s = "autor=Пушкин А.С.; title = Евгений Онегин; price =200; year= 1831";"\\w+\\s*=[^;]+";
//            String s = "+7 499 456-45-78, +74994564578, +7 (499) 456 45 78, 74994564578";"\\+?7\\d{10}";
//            String s = "I learning Java Hello";"^\\w+\\s\\w+\\s\\w+\s\\w+$";
            String s = "Java master";
//            String pattern = "\\w+\\s\\w+";
            String pattern = "^[\\w-]{3,16}$";// [A-Za-z0-9_-]- это под значение \\w
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse) {
            System.out.println("не правильное регулярное выражение:" + pse.getMessage());
            System.out.println("Описание" + pse.getDescription());
            System.out.println("Позиция" + pse.getIndex());
            System.out.println("Не правильный шаблон" + pse.getPattern());
        }
    }
}
