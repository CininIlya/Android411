package OOP.Treeset;

import java.util.Scanner;
import java.util.TreeSet;


public class minimal_znach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.print("Количество чисел: ");
        int count = input.nextInt();

        System.out.println("Введите числа");

        for (int i = 0; i < count; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            treeSet.add(num);
        }
        System.out.println("Наименьший элемент  В TreeSet: " + treeSet.first());
//            int num = input.nextInt();

//        List<Integer> numbers = readNumber();

//    }

//    public static List<Integer> readNumber() {
//        ArrayList<Integer> number = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Количество чисел: ");
//        int count = input.nextInt();
//
//        System.out.println("Введите числа");
//
//        for (int i = 0; i < count; i++) {
//            System.out.print("-> ");
//            int num = input.nextInt();
//            number.add(num);
//        }
//        return number;
    }
}
