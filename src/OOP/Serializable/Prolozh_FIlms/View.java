package OOP.Serializable.Prolozh_FIlms;

import java.util.*;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer() {
        System.out.println("=====================Редактирование данных каталога фильмов " +
                "=======================");
        System.out.println("Действие с фильмами: ");
        System.out.println("1 - добавление фильма" +
                "\n2 - каталог фильма"+
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("===================================================================================");
        return userAnswer;

    }

    public Map addUserfilm() {
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режиссер", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("длительность", "");
        dictFilm.put("студия", "");
        dictFilm.put("актеры", "");
        System.out.println("=============Выбор фильма===========================================================");
        for (Map.Entry<String, String> el : dictFilm.entrySet()) {
            System.out.println("Введите " + el.getKey() + " фильма: ");
            dictFilm.put(el.getKey(), input.nextLine());
        }
        System.out.println("=========================================================================================");
        return dictFilm;
    }

    public void showAllFilms(Collection films) {
        System.out.println("=============Каталог Фильмов===========================================================");
        for (var element : films){
            System.out.println(element);
        }
        System.out.println("=========================================================================================");
    }
}