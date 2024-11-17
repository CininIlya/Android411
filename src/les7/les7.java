package les7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class les7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int mas[] = new int [4];
//       mas[0]= 5;
//        mas[1]= 2;
//        mas[2]= 7;
//        mas[3]=  mas[1] +  mas[2]= 2;
//        for (int i = 0; i < 4; i++) {
//            System.out.println(mas [i]);
//        }
//        int n =10;
//        int [] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n -1] = 2;// mas [9] =2
//        mas[n -2] =3; // mas [8] = 3
//        mas [n /5] = mas [n-1] + mas [n-2]; // mas [2] = mas [9] + mas [8] =>
//        for (int i = 0; i < mas.length ; i++) {
//            System.out.print(mas[i] + " ");
//        }
//        int[] array = new int[4];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "");
//
//        }
//        int n;
//        System.out.print("Кол-во элемен. массива: ");
//        n = input.nextInt();
//
//        int [] array;
//        if (n < 5) {
//array = new int[n];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("->");
//                array[i] =input.nextInt();
//            }
//        }else {
//            array = new int [n];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        int [] array = new int[10];
//        for (int i = 0; i < array.length ; i++) {
//            System.out.print("->");
//            array[i] =input.nextInt();
//
//        }
//        for (int i = array.length -1; i >= 0 ; i--) {
//            System.out.print(array[i] + " ");
//        }
//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));
//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//
//
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                sum +=array[i]; //sum =sum + array[i]
//            }
//        } System.out.println("Сумма отр эл массива: " + sum);
//
//        int min;
//        int [] array   = new int [5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array [i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0]; // min = 9
//        //[9,5,4,6,3]
//        for (int i = 1; i < args.length; i++) {
//            if (array[i] < min){ //
//                min  = array[i];
//            }
//        }
//        System.out.println("Мин эл в массиве: " + min);
//        int [] a1 = {1,2,3,4};
//        int [] a2 = new int [a1.length + 5];
//
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1 [i];
//        }
//        for (int i = 0; i < a2.length ; i++) {
//            System.out.println(a2[i]);
//        }
//        double a =Math.random()*3;
//        System.out.println(a);

//        double a = 2 + Math.random() * 5; //[2;7)
//        System.out.println(a);

//        double a = Math.random() * 10 -5; //[-5;5)
//        System.out.println(a);

//        int a =3 +(int) (Math.random() *  2); //[3;5)
//        System.out.println(a);

//        int a =(int) (Math.random() * (10+1)) - 5 ; //[-5;5)
////        System.out.println(a);

//        int a = (int) (Math.random() * 7 - 2); //[-2;5)  // (Math.random() * 5-(-2) ) + (- 2) => (Math.random() *7 -2
//        System.out.println(a);
//        int [] array = new int[10];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]= (int) (Math.random() *10);
//        }
//        System.out.println(Arrays.toString(array));

//        int [] array = new int[10];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]= (int) (Math.random() * 12 + 2); //[2;14)
//        }
//        System.out.println(Arrays.toString(array));

//        int [] array = new int[20];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]= (int) (Math.random() * 31 - 15); //[-15;16)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString());
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            } else {
//                sum += array[i];
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Сумма нечетных элементов: " + sum);
//       int [] numbers = {10,20,30,40,50};
//
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.print(numbers[i] + " ");
//
//        }
//        System.out.println();
//
//        for (int x : numbers){ // int x = 10;
//            System.out.print(x + " ");
//        }
//        String [] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name : names){
//            System.out.print(name + "\t");

        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 40 + 10);
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}

