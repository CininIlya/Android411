package OOP.lyamda.korot_slov_2met;

interface Calcinterface{
    public void calculate (String a,String b);



}
class Calc implements Calcinterface{
    @Override
    public void calculate(String a, String b) {
        System.out.println("Первое слово: " + a);
        System.out.println("Второе слово: " + b);
    }

}

public class sravnenie_dlin {
    public static void main(String[] args) {

        String dog = "Собака";
        String cat = "Котааа";
//        String[] words = new String[]{"РЎРѕР±Р°РєР°", "РљРѕС‚"};
//        String shortest = Arrays.asList(words).stream()
//                .sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1)
//                .findFirst().get();
        Calcinterface ss = new Calc();
        ss.calculate(dog, cat);
        if (cat.length() > dog.length()) {
            System.out.println("Самое короткое слово: " + dog);
        }
        if
        (cat.length() < dog.length()) {
            System.out.println("Самое короткое слово: "+ cat);
        } if
        (cat.length() == dog.length()){
            System.out.println("Равны");

        }

    }

}






//            System.out.println("РЎР°РјРѕРµ РєРѕСЂРѕС‚РєРѕРµ СЃР»РѕРІРѕ: " + shortest);


