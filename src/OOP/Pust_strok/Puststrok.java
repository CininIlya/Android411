package OOP.Pust_strok;

import java.util.function.Predicate;

public class Puststrok {
    public static void main(String[] args) {

        Predicate<String> isEmptyString = String -> String.isEmpty();


        String str1 = "";
        String str2 = "Текст";
        System.out.println("Строка 1: " + str1);
        System.out.println("Строка 1 пустая: " + isEmptyString.test(str1));
        System.out.println("\nСтрока 2: " + str2);
        System.out.println("Строка 2 пустая: " + isEmptyString.test(str2));

    }
}