import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dzstroka {
    public static void main(String[] args) {

//        String str = " текст с повторяющимися символами ";
//        String result = removeDuplicates(str);
//        System.out.println("Исходная строка: " + str);
//        System.out.println("Измененная строка: " + result);
//    }
//
//    private static String removeDuplicates(String input) {
//
//        String regex = "(.)(?=.*\\1)";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        return matcher.replaceAll("");

        // задача Найти адрес эл.почты

        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";

        String pattern = "(\\w+@+?(.+){2,7})";
//        String pattern = "^(.+)@(.+)$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}



