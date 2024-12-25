package OOP.Obiem_parallelepiped;

public class Main  {
    public static void main(String[] args) {
        Box3d box = new Box3d(5.0, 3.0, 2.0);
        Box3d corob = new Box3d(10.0, 5.0, 7.0);
        double vol2;

        System.out.println(box);
        System.out.println("Обьем:" + box.vol());

        vol2 = corob.vol();

        System.out.println("\nНовые значения:" + "\nШирина: 10.0" + "\nВысота: 5.0" + "\nГлубина: 7.0");
        System.out.println(corob);
        System.out.println("Обьем 2 :" + corob.vol());

    }
}

