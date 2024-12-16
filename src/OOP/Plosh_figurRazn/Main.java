package OOP.Plosh_figurRazn;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника - Герона: " + pl_fig.triangle1(3, 4, 5));
        System.out.println("Площадь треугольника через основание: " + pl_fig.triangle2(6, 7));
        System.out.println("Площадь квадрата: " + pl_fig.kvadrat(7));
        System.out.println("Площадь прямоугольника: " + pl_fig.pryamougolnik(2, 6));
        System.out.printf("Количество подсчета площади: " + pl_fig.getCount());
    }
}
