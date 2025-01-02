package OOP.Stipend;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Виктор","Вербов","Gr111",5.0f,0);
        Aspirant aspirant = new Aspirant("Александр","Невзоров","Gr222","Work1",5.0f,0);
        Aspirant aspirant1 = new Aspirant("Антон","Бобров","G333","Work2",4.9f,0);

        System.out.println(student);
        System.out.println(aspirant);
        System.out.println(aspirant1);
    }
}

