package OOP.Institute;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодолаев", "Даши", 16);
        System.out.println(human);

        Student student = new Student("Загидулин", "Линар", 32, "Математика",
                "мм_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("Даньшин", "Андрей",
                38, "Астрофизика", 100);
        System.out.println(teacher);
    }
}

