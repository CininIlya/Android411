package praktik;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class les17 {
    public static void main(String[] args) {
//String s = "Я ищу чрвпадения ы 2024 году. И я их найду. Hello workd";
//String s = "Суворова Виктория, Россия, г.Сочи, +7 999 555-77-33";
String s = "05-03-1987 // Дата рождения";
String s2 = s.replaceAll("\\s//.*", "").replaceAll("-",".");
        System.out.println("Дата рождения: " + s2);
//String []arr =s.split("\\.");
//String []arr =s.split(",\\s*");
//        System.out.println(Arrays.toString(arr));
//for(String temp:arr){
//    System.out.println(temp);
}

    }


