import java.util.Scanner;
public class dz8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] num = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] num2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                System.out.print(num2[i][j] * num2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


