package Les6;

import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int str = 7;
        for (int i = 0; i <= str; i++) {
            for (int j = str; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}