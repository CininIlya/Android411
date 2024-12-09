package praktik;


import java.util.Scanner;
import java.util.SortedMap;

public class les16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        System.out.println(sb + "\n");
//
//        StringBuilder sb1 = new StringBuilder(1000);
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb1 + "\n");
//        StringBuilder sb2 = new StringBuilder("Java");
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//        System.out.println(sb2 + "\n");
//
//        StringBuilder sb3 = new StringBuilder("String");
//        System.out.println(sb3.capacity());
//        System.out.println(sb3.length());
//        System.out.println(sb3 + "\n");
//        StringBuilder sb = new StringBuilder();
//        sb.append('a');
//        sb.append(true);
//        sb.append(10);
//        sb.append(12345L);
//        sb.append(10.20);
//        sb.append("Hello").append(" ").append("world");


////        sb.insert(5,"!");
//////        sb.delete(5,7);
////        sb.deleteCharAt(5);
////
////        sb.replace(5,10,"Java");
////
////
////        System.out.println(sb);
////
////        String st=sb.substring(6, 7);
////        System.out.println(st);
////        st = sb.substring(6);
//        System.out.println(sb);
////        sb.reverse();
////        System.out.println(sb);
//
//        System.out.println(sb.indexOf("l",4));


        StringBuilder sb1 = createStr(5, 3);
        System.out.println(sb1);
        modifyStr(sb1,"=","равно");
        modifyStr(sb1,"+","плюс");
        modifyStr(sb1,"-","минус");
        modifyStr(sb1,"+","умножить");

        System.out.println(sb1);
    }

    public static StringBuilder createStr(int a, int b) {
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }

    public static void modifyStr(StringBuilder stBuild,String oldStr ,String newStr) {
        int pos;
        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.deleteCharAt(pos);
//            stBuild.insert(pos, "равно");
            stBuild.replace(pos,pos+1,newStr);

        }
//        return stBuild;

    }
}