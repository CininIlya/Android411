package praktik;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome(" А роза упала на лапу Азора"));
        System.out.println(Palindrome(" Азора   "));
    }

    public static boolean Palindrome(String input) {
        String res = "";
        input = input.toLowerCase().replace(" ", "");
        for (int i = 0; i < input.length(); i++) {
            res = input.charAt(i) + res;

        }
        System.out.print(res + " :");
        return input.equals(res) ? true : false;
    }
}

