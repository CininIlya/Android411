package praktik;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.concurrent.LinkedBlockingDeque;

public class les15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String  str1 ="Hello";
//        String  str2 ="World";
//        str2 = str2+ "!";
//        String message = str1 + " " + str2;
//        System.out.println(message);
//        char    [] helloArray ={'П', 'р','и','в','е','т'};
//    String helloString = new String(helloArray);
//        System.out.println(helloString);
//        String  str1 = "Hello";
//        int a =5;
//        String message = str1 + " " + a;
//        System.out.println(message);
//        String  str1 = "2";
//        int a =5;
//        String message = str1  + a;
//        System.out.println(message);


//
//        String s = "Я буду хорошим программистом";
//        System.out.println(s);
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'а' && ch <= 'я') {
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }
//        String s1 = "";
//        if (s1.length() == 0 || s1.isEmpty()){
//            System.out.println("пустая строка");


//        String str1 = "строка";
//        char [] res = str1.toCharArray();
//        System.out.println("Массив сиьволов:");
//        for(int i=0; i< res.length; i++){
//        System.out.println("Элемент [" + i ="]" + res[i]);
//    }

//    String path = "https://www.oracle.com/java/technologies/downloads/#jdk20-"
//    char [] chars = path.toCharArray();
//    for (i =0; i< chars.leght; i++) {
//        if (chars [i] == '/'){
//            chars [i] = '\\';
//
//    }
//}
//String res = new String(chars);
//    System.out.print(res);
//        String str1 = "I learning Java";
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a'));
//        System.out.println(str1.lastIndexOf('a'));
//        System.out.println(str1.indexOf('a',5));
//        System.out.println(str1.lastIndexOf('a',5));
//        System.out.println("     Hello World ".trim());
//        String  str1 = "I learning Java".substring(2,10);
//        System.out.println(str1);
//        System.out.println("I learning Java".substring(2));S

//        System.out.print("Введите 2 слова через пробел: ");
//        String str = input.nextLine();
//        String first = str.substring(0,str.indexOf(" "));
//        String second = str.substring(str.indexOf(" ")).trim();
//        System.out.println(second +""+ first);

//        String  str1 = "I learning Java";
//        String [] words = str1.split("a");
//        for (String word : words)
//            System.out.println(word);

//        System.out.print("Введите ФИО: ");
//        String str = input.nextLine();
//        String[] FIO = str.split(" ");
//        System.out.println(Arrays.toString(FIO));
//        System.out.println(FIO [0]+ " " + FIO[1].substring(0,1) + "." + FIO [2].substring(0,1) + ".");
//        System.out.println(FIO [0]+ " " + FIO[1].charAt(0) + "." + FIO [2].charAt(0) + ".");
//        String str = "Строка...";
//        char[] res = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            String  str = str. charAt(str.length(); i++){
//                res [i] = str.charAt(str.length()-1 -i);
//            }
//            System.out.print(res);
//        }

//    String  line = "Строка";
//    String  result = "";
//        for (int i = 0; i <line.length() ; i++) {
//            result = line.charAt(i) + result;
//
//        }
//        System.out.println(result);

//        String  res = String.join(":", "00","23","30");
//        System.out.println(res);
//
//        String [] text = new String[]{"Я", "буду", "хорошим", "программистом"};
//        String str = String.join(" ",text);
//        System.out.println(str);
//        String text = "Замените в этой строке все появления буквы 'o' на букву 'О', кроме первого и последнего вхождения";
//        String text2 = "";
//        char x;
//        int pos1 = text.indexOf('о');
//        int pos2 = text.lastIndexOf('о');
//        for (int i = 0; i < text.length(); i++) {
//            x = text.charAt(i);
//            if (x == 'о' && i != pos1 && i != pos2) {
//                x = 'О';
//            }
//            text2 += x;
//        }
//        System.out.println("Исходная строка -> " + text);
//        System.out.println("Результирующая -> " + text2);


//        String line = "Замените в этой строке все появления буквы 'o' на букву 'О', кроме первого и последнего вхождения";
//        String a = line.substring(0,line.indexOf("о") + 1);
//        System.out.println(a);
//        String b = line.substring(line.indexOf("о") + 1, line.lastIndexOf("о"));
//        System.out.println(b);
//        String c = line.substring(line.indexOf("о"));
//        System.out.println(c);
//        System.out.println(a+b.replace("о", "О") + c);

//        int a =5;
//        int b =5;
//        String a = "Hello";
//        String b = "Hello";
//        String c = "Good-bye";
//        String d = "HELLO";
//        System.out.println(a + " == " + b + "- >" + a.equals(b));
//        System.out.println(a + " == " + c + "- >" + a.equals(c));
//        System.out.println(a + " == " + d+"- >" + a.equals(d));
//        System.out.println(a + " == " + d+"- >" + a.equalsIgnoreCase(d));


//        System.out.println("I learning Java".endsWith("Java"));
//        System.out.println("I learning Java".startsWith("I"));
//        System.out.println("I llearning Java".contains("ing"));
//
//        String str = "11 23 44 55 23 22";
//        String str1 = "23";
//        String change = "!!!";
//        if (str.contains(str1)) {
//            str = str.replace(str1, change);
//            System.out.println(str);
//        }


//        String s = "Я буду хорошим программистом";
//        System.out.println(s);
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'а' && ch <= 'я') {
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);

//        String strok = "Hello, World";
//        System.out.println(strok);
//        int sum = 0;
//        int[] result1 = new int['z' - 'a' + 1];
//        int[] result2 = new int['Z' - 'A' + 1];
//
//        for (int i = 0; i < strok.length(); i++) {
//            char ch = strok.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                result1[ch - 'a']++;
//            } else {
//                if (ch >= 'A' && ch <= 'Z')
//                    result2[ch - 'A']++;
//            }
//        }
////        for (int i = 0; i < result1.length; i++) {
////            sum = (i + 'A' + result1[i]);
////            System.out.print(sum);
//
//
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println((char) (j ) + " = " + result2[j]);
//
//            }

    }
}
