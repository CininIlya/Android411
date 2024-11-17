package lesson5;

import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, orient;
        String symbol;
        System.out.print("Количество символов: ");
        n = input.nextInt();
        System.out.print("Тип символа: ");
        symbol = input.next();
        System.out.print("0 - горизонтальная\n1 - вертикальная\nориентация линии: ");
        orient = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (orient == 1) {
                System.out.println(symbol);
            } else {
                System.out.print(symbol + " ");
            }

        }

    }
}