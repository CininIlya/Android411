package lesson11;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        System.out.print("На каком этажк: ");
        int n1 = input.nextInt();
        elevator(n1);


    }
    public static void elevator(int n){
        if (n == 0){
            System.out.println("Вы в подывле");
            return;
        }
        System.out.println("=>" + n);
        elevator(n-1);
        System.out.print(n + " ");

    }
}
