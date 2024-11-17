import java.io.PrintStream;
import java.util.Scanner;

public class zadaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Выбор фигуры:\n1 - прямоугольник \n2 - треугольник  \n3 - круг\n: ");
        int figure = input.nextInt();
        if (figure == 1) {
            pryam();
        } else if (figure == 2) {
            trey();
        } else if (figure == 3) {
            krug();
        } else {
            System.out.print("Ошибка");
        }
    }

    public static void pryam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сторону  a = ");
        float a = input.nextInt();
        System.out.print("Введите сторону  b = ");
        float b = input.nextInt();
        System.out.printf("S= %.2f", a * b);
    }

    public static void trey() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сторону  a = ");
        double a = input.nextInt();
        System.out.print("Введите сторону  b = ");
        double b = input.nextInt();
        System.out.print("Введите сторону  c = ");
        double c = input.nextInt();
        double p = (a + b + c) / 2;
        double pp = p * (p - a) * (p - b) * (p - c);
        System.out.printf("S:  %.2f", Math.sqrt(pp));
    }

    public static void krug() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        int radis = input.nextInt();
        System.out.printf("S: %.2f", Math.PI * Math.pow(radis, 2));
    }
}

