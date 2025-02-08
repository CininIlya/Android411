package OOP.HashMap;

import OOP.table.Table;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap1 {
    public static void main(String[] args) {
//        TreeMap<String ,String> fileExtensions = new TreeMap<>((o1, o2) -> {
        TreeMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER) {
//            return o1.compareTo(o2);// метод делает сортировку элементов вывода
//        });
        };
        fileExtensions.put("Python","*.ру");
        fileExtensions.put("C++","*.cpp");
        fileExtensions.put("JavaScript","*.js");
        fileExtensions.put("Golang","*.jo");
        fileExtensions.put("Java","*.java");
        fileExtensions.put("java","*.java");
        System.out.println(fileExtensions);
        System.out.println(fileExtensions.get("Java"));
        fileExtensions.remove("Golang");
        System.out.println(fileExtensions);
        System.out.println(fileExtensions.descendingMap());;
        System.out.println(fileExtensions.lastEntry());
        System.out.println(fileExtensions.firstEntry());

        }
    }
