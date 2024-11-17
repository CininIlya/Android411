package lesson5;

import java.util.Scanner;

public class les5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//int a = 20, b = 30;
//        System.out.println (a == b ? " a==b" : (a > b ? " a > b" : " b > a"));


//        int n = true ? false ? 10 : 20 : 30;
//        System.out.println(n); // 20

//        int a = 20, b = 0 ;
//        System.out.println ( b == 0 ? " на ноль делить нельзя" : (float) a / b);


//        System.out.print("\tВыбор цвета светофора\n1 (11)- красный, 2 (22)- желтый, 3 (33)- зеленый");
//        n = input.nextInt();
//        switch (n){
//
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета нет");
//
//
//        }
//        System.out.println("Код далее");

//        int month;
//        int numDay = 0;
//        int year;
//        System.out.println("Введите месяц числом");
//        month = input.nextInt();
//
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDay = 31;
//                break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDay = 30;
//                break;
//            case 2:
//                System.out.println("Введите год");
//                year = input.nextInt();
//                if (year % 4 == 0) {
//                    numDay = 29;
//                }else {
//                    numDay = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не сущ");
//        }
//if (month >=1 && month <= 12){
//            System.out.println("Количество дней:" + numDay);
//        }
//        int n = 0;
//        System.out.print("\tВведите номер месяца: ");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.print("Зима...");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.print("Весна...");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.print("Лето...");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Оень...");
//                break;
//            default:
//                System.out.println("Такого месяца не существует.");
//                break;
//        }
//        input.close();

//        int n = 0;
//        System.out.print("\tВведите номер месяца: ");
//        n = input.nextInt();
//        String s =switch (n) {
//
//            case 1, 2, 12 -> ("Зима...");
//            case 3, 4, 5 ->  ("Весна...");
//            case 6, 7, 8 ->  ("Лето...");
//            case 9, 10, 11 ->  ("Осень...");
//            default ->  ("Такого месяца не существует.");
//        };
//        System.out.print(s);
//        System.out.println("Введите бал по 12 бальной системе");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5 бальной системе");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                        (num >= 7 && num <= 9) ? 4 :
//                                (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> System.out.println("2");
//            case 3 -> System.out.println("3");
//            case 4 -> System.out.println("4");
//            case 5 -> System.out.println("5");
//            case 0 -> System.out.println("Такого нет");
//        }
//        int i = 0; // переменная счетчик
//        while (i < 5) { // условие
//            System.out.println(i);
//            i++; // шаг цикла
//        }
//        int i = 5;
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }

//        int i = 20;
//        while (i > 0) {
//            System.out.println(i);
//            i = i / 5;
//        }
//        int n, sum = 0;
//
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("Сумма введеных чисел: " + sum);
//        int start, finish, sum = 0;
//        System.out.print("Введите начало диапозонаж: ");
//        start = input.nextInt();
//        System.out.print("Введите конец диапозонаж: ");
//        finish = input.nextInt();
//        while (start <= finish){
//            if (start % 2 != 0)
//            sum += start;
//            start++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите чило: " );
//            num = input.nextInt();
//if (num <0){
//            sum += num; //sum = sum + num
//            count++; // count = count + 1
//            }
//        } while (num != 0);
//       average = (float) sum / count;
//        System.out.printf("Среднее арифметическое: %.2f", average );

//
//        int i = 0;
//        while (i < 10){
//            if (i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикд завершен");
//        int i= 0;
//        while (true){
//            System.out.println(i);
//            if (i ==5 ){
//                break;
//            }
//            i++;
//        int n;
//        while (true){
//            System.out.println("Введите полож число: ");
//            n = input.nextInt();
//            if ( n < 0 ){
//                break;
//        int n = 0, proizv = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (proizv == 0) proizv++;
//            proizv *= n;
//        }
//        System.out.println("Произведение чисел : " + proizv);
//        input.close();
//        int i =1;
//        while (i<5){
//            System.out.println("Внешнии цикл: i= " + i);
//            int j =1;
//            while (j<4){
//                System.out.println("\t Внутренний цикл: j =" +j );
//                j++; // j == 4
//
//            }
//            i++; // i == 2
//        }
//        int i= 1;
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
//        }

    }
}

