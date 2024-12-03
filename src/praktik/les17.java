package praktik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class les17 {
    public static void main(String[] args) {

        String s= "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 5910.Hel_lo. Ели [-ели]";
//        String pattern = "[50][0-9][0-9][0-9]";
//        String pattern = "[А-Яа-яЁё]";//[А-Яа-яЁё]
//        String pattern = "[A-Za-z]";//[А-Яа-яЁё]
//        String pattern = "[А-Яа-яЁё\\[\\]-]";
//        String pattern = "[^0-9]";
//        String pattern = "Ели\\[-ели\\].\\z"; // поиск в конце строки
        String pattern = "\\w+"; // поиск в конце строки
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
        while (matcher.find()){
//            System.out.println("Шаблон совпадении найден с " + matcher.start()+ " по " + (matcher.end()-1));
//            System.out.println(s.substring(matcher.start(),matcher.end()));
            System.out.print(matcher.group()+ " ");

        }
    }
}
