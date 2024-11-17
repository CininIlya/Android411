package les7;

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        int k = input.nextInt();
        System.out.println("Введите конец диапазона: ");
        int n = input.nextInt();
        int[] array = new int[n - k + 1];
        for (int i = 0, j = k; i <= n - k; i++, j++) {
            array[i] = j;
            System.out.print(array[i] + "\t");
        }
    }
}