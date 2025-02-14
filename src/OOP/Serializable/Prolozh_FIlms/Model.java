package OOP.Serializable.Prolozh_FIlms;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;

    public Model() {
        this.films = new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm) {
        Film film = new Film(dictFilm);
films.put((String) dictFilm.get("название"),film);

    }
    public Collection getAllFilms(){
        return films.values();
    }
}

class Film {
    private String title;
    private String zhanr;
    private String rezhiser;
    private String year;
    private String time;
    private String studio;
    private String actors;

    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название");
        this.zhanr = (String) dictFilm.get("жанр");
        this.rezhiser = (String) dictFilm.get("режиссер");
        this.year = (String) dictFilm.get("год выпуска");
        this.time = (String) dictFilm.get("длительность");
        this.studio = (String) dictFilm.get("студия");
        this.actors = (String) dictFilm.get("актеры");
        ;
    }

    public String getTitle() {
        return title;
    }

    public String getZhanr() {
        return zhanr;
    }

    public String getRezhiser() {
        return rezhiser;
    }

    public String getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }

    public String getStudio() {
        return studio;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return title + "(" + zhanr + ')';
    }
}