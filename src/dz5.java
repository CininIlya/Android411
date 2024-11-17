import java.util.Scanner;

public class dz5{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Введите количество часов: ");
        int chas = input.nextInt();
        switch ((chas >= 0 && chas <= 5) ? 2 :
                (chas >= 6 && chas <= 12) ? 3 :
                (chas >= 13 && chas <= 16) ? 4 :
                (chas >= 17 && chas <= 23) ? 5 : 13) {
            case 2 -> System.out.println("Доброй ночи...");
            case 3 -> System.out.println("Доброе утро!");
            case 4 -> System.out.println("Добрый день!");
            case 5 -> System.out.println("Добрый вечер!");
            case 13 -> System.out.println("Такого время суток нет : ");
        }
}

}