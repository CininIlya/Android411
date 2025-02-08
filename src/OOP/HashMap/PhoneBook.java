package OOP.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();//{Зотов: 7773232,7763232,Калинкин}
        addNumber("Зотов", 7773232, bookPhone);
        addNumber("Зотов", 7763232, bookPhone);
        addNumber("Калинкин", 4443232, bookPhone);
        addNumber("Романов", 888992, bookPhone);
        addNumber("Зотов", 4443232, bookPhone);
        addNumber("Калинкин", 113232, bookPhone);
        printBook(bookPhone);

    }
    // Добавление имена к телефонам

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {

        if (map.containsKey(key)) {// проверка содержится ли ключ
            map.get(key).add(value);// мы получает значение текушего элемента из ааррай листа

        } else {
            ArrayList<Integer> list = new ArrayList<>();// создался аарай лист и созраняется один номер тел
            list.add(value);//4443232
            map.put(key, list);

        }
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for (var temp : map.entrySet()) {
            String phones = "";
            int i = 1; // переменная для удаление последней запятой
                for (int el : temp.getValue()) {

                    phones = phones + el + (temp.getValue().size()  == i ? "" : ", ");// удалении последней запуцтой в выводе строки
                    i++;
                }
                System.out.printf("%s: %s%n", temp.getKey(), phones);
            }
        }
    }

