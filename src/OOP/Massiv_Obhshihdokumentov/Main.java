package OOP.Massiv_Obhshihdokumentov;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        Integer[] IntArray = {9, 5, 3};
//        String[] StrArray = {"One", "Two"};
//        printArray(IntArray);
//        printArray(StrArray);
//
//    }
//
//    public static <T> void printArray(T[] InputArray) {
//        for (T elem : InputArray) {
//            System.out.println(" Массив: " +elem);
//        }
//        System.out.println();
//    }
//
//}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int length1 = scanner.nextInt();
        Integer[] IntArray = new Integer[length1];

        for (int i = 0; i < IntArray.length; i++) {
            System.out.print("->");
            IntArray[i] = scanner.nextInt();

        }
        System.out.print("Введите количество элементов массива строк : ");
        int length2 = scanner.nextInt();
        String[] StrArray = new String[length2];


        scanner.nextLine();
        for (int i = 0; i < StrArray.length; i++) {
            System.out.print("->");
            StrArray[i] = scanner.nextLine();

        }
        System.out.println();

        printArray(IntArray);
        printArray(StrArray);
    }

    public static <T> void printArray(T[] arr) {
        System.out.print(" Массив: ");
        for (T elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
//
//}
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите длину массива: ");
//        Integer length = scanner.nextInt();
//        Integer[] IntArray = new Integer[length];
//        Zhac<Integer> IntergerIntArray = new Zhac<Integer>();
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < 10; i++) {
//
//
//            System.out.println("Введите количество элементов строк : ");
//            String = scanner.nextInt();
//            String[] StrArray = new String[length];
//            System.out.println("Введите элементы массива:");
//            for (char j = 0; length > j; j++) {
//                StrArray[j] = scanner.nextLine();
//
//            }
//            printArray();
//            printArray();
//
//
//          class Zhac<T extends Number> {
//                private T[] IntArray, StrArray;
//
//
//              public Zhac(T[] intArray, T[] strArray) {
//                  IntArray = intArray;
//                  StrArray = strArray;

