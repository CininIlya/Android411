package OOP.HashMap;

import java.util.Hashtable;

public class HasTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String > ht1 = new Hashtable<>(4);
        Hashtable<Integer,String > ht2 = new Hashtable<>(2);

        ht1.put(1,"one");
        ht1.put(2,"two  ");
        ht1.put(3,"tree");

        ht2.put(4,"four");
        ht2.put(5,"five");
        ht2.put(6,"six");

        System.out.println("ht1 " + ht1);
        System.out.println("ht2 " + ht2);
    }
}
