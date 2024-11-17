import java.util.Scanner;
public class dz4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Введите число от 1 до 99: ");
        k = input.nextInt();
        if (k >= 0 && k <= 99) {
            System.out.print("-");
            if (k == 1 || k == 21 || k == 31 || k == 41 || k == 51 || k == 61 || k == 71 || k == 81 || k == 91) {
                System.out.println(k + " копейка");
            } else if (k >= 2 && k <= 4 || k >= 22 && k <= 24 || k >= 32 && k <= 34 || k >= 42 && k <= 44 || k >= 52 && k <= 54 ||
                    k >= 62 && k <= 64 || k >= 72 && k <= 74 || k >= 82 && k <= 84 || k >= 92 && k <= 94) {
                System.out.println(k + " копейки");
            } else if (k >= 5 && k <= 20 || k >= 25 && k <= 30 || k >= 35 && k <= 40 || k >= 45 && k <= 50 || k >= 55 && k <= 60 ||
                    k >= 65 && k <= 70 || k >= 75 && k <= 80 || k >= 85 || k <= 90 || k >= 95 || k <= 99 || k==0) {
                System.out.println(k + " копеек");
            }
        } else {
            System.out.println("Ошибка");
        }






            }
        }
