package OOP.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Programm12 {
    public static void main(String[] args) {
        University un1 = new University("Университет ", 300);
        University un2 = new University("нач.Школа ", 400);
        University un3 = new University("ср.Школа ", 230);
        University un4 = new University("выс.Школа ", 240);
        University un5 = new University("муз.Школа ", 500);

        SortUniversity sortUniv = new SortUniversity();
        int res = sortUniv.compare(un1, un2);
        switch (res) {
            case -1:
                System.out.println(un2.getName() + "большe!");
                break;
            case 1:
                System.out.println(un1.getName() + "больше!");
                break;
            default:
                System.out.println("Два учебных заведение равные по численности");


        }
        ArrayList<University> list = new ArrayList<>();
        list.add(un1);
        list.add(un2);
        list.add(un3);
        list.add(un4);
        list.add(un5);
        System.out.println("\nСортировка по имени: ");
        Collections.sort(list,sortUniv);
        for (University count: list){
            System.out.println(count.getName() + " " );

        }




        SortNameUniversity nameCompare = new SortNameUniversity();// работа со с списком Университета через коллецию
        Collections.sort(list, nameCompare);
        for (University name : list) {
            System.out.println(name.getName() + " " + name.getNim_of_students()); //выводим имена студентов + количество студентов
        }
        System.out.println("\nСортировка по кол-ву учеников");
    }
}

class University {
    private int nim_of_students; // количество студентов
    private String name;// название института

    public University(String name, int nim_of_students) {
        this.nim_of_students = nim_of_students;
        this.name = name;
    }

    public int getNim_of_students() {
        return nim_of_students;
    }

    public String getName() {
        return name;
    }
}

class SortUniversity implements Comparator<University> {// вспомогательный класс метод который не реальзован

    @Override
    public int compare(University o1, University o2) {
        if (o1.getNim_of_students() == o2.getNim_of_students()) // сраввнение по кол-ву учашихся
            return 0;
        else
            return o1.getNim_of_students() > o2.getNim_of_students() ? 1 : -1;
    }
}

class SortNameUniversity implements Comparator<University> {
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}