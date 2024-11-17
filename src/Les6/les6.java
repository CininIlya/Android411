package Les6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class les6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//int i= 1;
//        while (i <10){
//            int j =1;
//           while (j < 10){
//
//               System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//               j++;
//           }
//            System.out.println();
//            i++;
//        }
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0){
//                    System.out.print("+");
//                }else {
//                    System.out.println("-");
//                }
//
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 5) {
//                System.out.print(i == j ? "*" : " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//        for (int i= 0; i <5; i++){
//            System.out.println(i);
//        }
//       int count = 0;
//       for (int i =0; i < 6; i++){
//           System.out.print(" -> ");
//           if (input.hasNextInt()){
//               count++;
//           }
//           input.nextLine();
//       }
//        System.out.println("Вы ввели чисел: " + count);
//int n;
//        System.out.println("Количество символов: ");
//        n = input.nextInt();
//        for (int i=0; i < n ; i++){
//            System.out.print("*");
//        int n, orient;
//        String symbol;
//        System.out.print("Кол-во символов: ");
//        n = input.nextInt();
//        System.out.print("Тип символов?: ");
//        symbol = input.next();
//        System.out.print("0 - горизон\n1 - верти\nОриент линии: ");
//        orient = input.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if (orient == 1) {
//                System.out.println(symbol);
//            } else {
//                System.out.print(symbol + " ");
//
//            }
//int n;
//        System.out.print("Введите целок число: ");
//        n = input.nextInt();
//
//        for (int i = 1; i <= n; i++){
//            if (n % i == 0) // 7 % 0 == 0
//            System.out.print(i+ " ");
//        }
//        for (int i = 10; i <100 ; i++) {
//            if (i /10 == i % 10) // 10 1 == 0
//                System.out.print(i + " ");
//        }
//        int a  = 0;
//        for (int i = 5; i > 0; i--, a++) {
//            System.out.print("Шаг: " + a + " Значение: ");
//            System.out.println(i);
//        }

        int w, h;
        System.out.print("Введите ширину прям-ка: ");
        w = input.nextInt();
        System.out.print("Введите высоту прм-ка: ");
        h= input.nextInt();


//        for (int i = 0; i < h ; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
//                System.out.print("*");
//                else
//                    System.out.print(" ");
//
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 7 ; i++) {// i= 0
            for (int j = 0; j < 7; j++) { // j =0
                if (i >= j) // 0 >= 0
                    System.out.print("*");
            }
                    System.out.println();

            }
//        for (int i = 8; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}


