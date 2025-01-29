package OOP.lyamda.korot_slov_2met;
interface CalcInterface1 {
    void calculate(String a, String b);
}


//class Calc implements Calcinterface{
//    @Override
//    public void calculate(String a, String b) {
//        System.out.println("Первое слово: " + a);
//        System.out.println("Второе слово: " + b);
//    }
//}

public class Lyambda {
    public static void main(String[] args) {
        String dog = "Собака";
        String cat = "Кот";
        CalcInterface1 ss = (a, b) -> {
            System.out.println("Первое слово: " + a);
            System.out.println("Второе слово: " + b);
        };
        ss.calculate(dog, cat);
        if (cat.length() > dog.length()) {
            System.out.println("Самое короткое слово: " + dog);
        }
        if
        (cat.length() < dog.length()) {
            System.out.println("Самое короткое слово: " + cat);
        }
        if
        (cat.length() == dog.length()) {
            System.out.println("Равны");
        }
    }
}
