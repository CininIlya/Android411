package praktik;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class les14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        try { // попытаться
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите 2 число: ");
//            int b = input.nextInt();
//
//            System.out.println(a / b);
//        } catch (InputMismatchException |ArithmeticException e) {
//            System.out.println("Вы ввели не целое цисло" + e);
//            System.out.println("Делить на ноль нельзя" + e);
//        }finally {
//            System.out.println("Конец программы");
//        }
//        try {
//            int[] numbers = new int[3];
//            numbers[3] = 9;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Введен некорректный индекс - " + e);
//        }
        int res = getFactorial(-5);
        System.out.println(res);
    }
    public static  int getFactorial(int num){
        int mul = 1;
        try {
            if (num <1){
                throw new Exception("Число меньше 1 указывать нельзя");
            }

        for (int i = 1; i <= num ; i++) {
            mul *= i;
        }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            mul = num;

        }
        return mul;
    }
}