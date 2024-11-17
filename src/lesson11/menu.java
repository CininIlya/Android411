package lesson11;

import java.util.Scanner;

public class menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int size;
        System.out.println("Введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];

        int option;
        do {
            System.out.println("Меню");
            System.out.println("1. Ввод эл. массива ");
            System.out.println("2. Отоб. массива ");
            System.out.println("3. Поиск эл в  массиве ");
            System.out.println("4. Сортировка  массива ");
            System.out.println("5. Выход ");
            System.out.println("6. Сделай свой выбор ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    inputArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("Ввежите элемент , который найти: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1) {
                        System.out.print("Элемент не найден" + "\n");
                    } else {
                        System.out.print("Элемет найден на позиции" + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Отсортиров. массив: ");
                    sortArray(list);
                    displayArray(list);
            }
        } while (option != 5);

    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("=>");
            array[i] = input.nextInt();
        }
    }

    static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int searchArray(int[]array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}


