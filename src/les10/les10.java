package les10;

import java.util.Scanner;

public class les10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Выедите рад окр: ");
//        int radius = input.nextInt();
//        System.out.printf("Длин окр %.2f",2 * Math.PI *radius);

//        System.out.print("Введите кат 1: ");
//        int cat1 = input.nextInt();
//        System.out.print("Введите кат 2: ");
//        int cat2 = input.nextInt();
//        System.out.printf("gip :%.1f  ", Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));

//        getSum(a:2, b:5);
//    }
//public static void getSum(int a,int b){
//    System.out.println(a+b);
//
//}
//
//
//
//    public static void hello(String name) {
//        System.out.println("Hello" + name + "!");

//        symbolDraw(9,'+','-');
//        symbolDraw(7,'x','0');
//        int a=11;
//        int b=6;
//        int c = min (a,b);
//        System.out.println("Миним знач: " + c);

//        System.out.println("Перед вызова метода:\ma = " + a + "\nb = " + b);
//        swapFunc(a,b);
//        System.out.println("После вызова метода:\n a = " + a + "\nb ="+ b);
//        System.out.print("a = ");
//        int a = input.nextInt();
//        System.out.print("b = ");
//        int b = input.nextInt();
//        System.out.println("Результат " + min(a, b));
//    }
//
//    public static int min(int a, int b) {
//        if (a > b)
//            return a - b;
//        else return a + b;
//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n-1; i > 0; i--) {
//            printLine(1, i);
//        }
//    }
//    public static void printLine(int start, int end) {
//        for (int i = start; i <=end; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//    public static int min (int n1,int n2 ){
//        int minCh;
//        if (n1 > n2) {
//            minCh = n2;
//        }else {
//            minCh =n1;
//
//        }
//        System.out.println("Hello");
//        return minCh;
//        find_num(2, 7, 0, 3, 1, 5, -13);
//        find_num(2, 7, 0, 3, 1, 5, -13, 13);
//        find_num(26);
//        find_num(99, 99, 100, 34, -39);
//        find_num(99, 39, 99, 100, 34);
//    }
//
//    public static void find_num(int... v) {
//        int max = 0;
//        for (int j : v) {
//            if (j % 13 == 0 && j > 0) {
//                if (max < j) max = j;
//            }
//        }
//        System.out.println(max == 0 ? "Число не найдено" : max);
        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
        int[] num2 = {1, 2, 5};


        System.out.println(max(num1));
        System.out.println(max(num2));

    }

    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i <mas.length ; i++) {
            if (mx < mas[i]){
                mx = mas[i];
            }
        }
        return mx;
    }
}
//    public static void symbolDraw(int count, char a, char b) {
//        for (int i = 0; i <count ; i++) {
//            if(i%2==0)
//            System.out.print(a);
//            else
//                System.out.print(b);
//        }
//        System.out.println();

