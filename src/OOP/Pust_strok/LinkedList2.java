package OOP.Pust_strok;

import java.util.LinkedList;
import java.util.ListIterator;

class LinkedList2 {
    public static void main(String[] args) {
        Raduga kr = new Raduga("Красный");
        Raduga or = new Raduga("Оранжевый");
        Raduga ge = new Raduga("Желтый");
        Raduga ze = new Raduga("Зеленый");
        Raduga go = new Raduga("Голубой");
        Raduga si = new Raduga("Синий");
        Raduga fe = new Raduga("Феолетовый");

        LinkedList<Raduga> col = new LinkedList<>();

        col.add(kr);
        col.add(or);
        col.add(ge);
        col.add(ze);
        col.add(go);
        col.add(si);
        col.add(fe);
        System.out.println("Список: " + col);
//        System.out.println("\nСписок интераторов в прямом направлении: ");
//        for (int i = 0; i <col.size(); i++) {

//            System.out.println("Индекс = " + i+", " +"Элемент = " + col.get(i));
        ListIterator<Raduga> listIterator = col.listIterator();
        System.out.println("\nСписок интераторов в прямом направлении: ");
        while (listIterator.hasNext()) {
            System.out.println("Индекс = " + listIterator.nextIndex() + ", " + "Элемент = " + listIterator.next());
        }

        System.out.println("\nСписок интераторов в обратном направлении: ");
        while (listIterator.hasPrevious()) {
            System.out.println("Индекс = " + listIterator.previousIndex() + ", " + "Элемент = " + listIterator.previous());
//        Iterator p = col.listIterator(2);
//        while(p.hasNext()){
//            System.out.println(p.next());
        }
    }
}

class Raduga {
    String color;

    public Raduga(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                color;

    }
}

