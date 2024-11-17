package lesson11;

import java.util.Scanner;

public class les11 {
    public static void main(String[] args) {
        //Перегрузка методов

//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a, b);
//        double res2 = min(c, d);
//        System.out.println(res1);
//        System.out.println(res2);

//        int num = 4;
//        String str = "2 X 2=";
//        print (str);
//        print (num);
//        print (str,num);
//
//    }
//public static void print(String text){
//    System.out.println(text);
////    public static int min(int n1, int n2) {
////int min;
////if(n1 >n2)
////    min = n2;
////else
////    min =n1;
////return min;
////    }
////
////    public static double min(double n1, double n2) {
////        double min;
////        if(n1 >n2)
////            min = n2;
////        else
////            min =n1;
////        return min;
//    }
//public static void print (int number){
//    System.out.println(number);
//}
//public static void print (String text, int number){
//    System.out.println(text + " " + number);

//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма 2 чисел: " + res1);
//        System.out.println("Сумма 3 чисел: " + res2);
//
//    }
//
//    public static int sum(int n1, int n2) {
//        return n1 + n2;
//    }
//
//    public static int sum(int n1, int n2, int n3) {
//        return n1 + n2 + n3;
        Scanner input = new Scanner(System.in);
//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(0,mas));
//    }
//
//    public static int sumList(int i, int[] arr) {
//        if (i == (arr.length - 1))
//            return arr[i];
//        return arr[i] + sumList(i + 1, arr);
        System.out.println(toStr(254,16));
    }
    public static String  toStr(int n,int base){
        String[] convert = {"0","1","2","3","4","5","6","7","8","8","A","B","C","D","E","F"};
        if (n < base)
        return convert[n];
        else
        return toStr(n/base, base)+ convert[n% base];




    }
}
    //public static int sumList(int []arr){
//        int sum =0;
//        for (int i: arr){
//            sum +=i;
//        }
//        return sum;


