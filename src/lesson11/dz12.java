package lesson11;

import java.util.Scanner;

public class dz12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        int ch = input.nextInt();
        ptintRavno(ch);
        for (int i = 0; i < ch - 2; i++) {
            printSredslash(ch);
        }
        ptintRavno(ch);
    }

    public static void printSredslash(int n) {
        System.out.print("=");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\\/");
        }
        System.out.println("=");
    }

    public static void ptintRavno(int n) {
        for (int i = 0; i < n * 2; i++) {

            System.out.print("=");
        }
        System.out.println();
    }
}
