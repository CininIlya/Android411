package OOP.Serializable.Prolozh_FIlms;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Controller {
    private Model filmModel;
    private View userInterface;

    public Controller() {
        this.filmModel = new Model();
        this.userInterface = new View();
    }
    public void run(){
        String answer = "";
        while (!answer.equals("q")){
answer = userInterface.waitUserAnswer();
checkUserAnswer(answer);
        }
    }
    public void checkUserAnswer(String answer){
        if (answer.equals("1")){
            Map film = userInterface.addUserfilm();
            filmModel.addFilm(film);

        }else if (answer.equals("2")){
            Collection films = filmModel.getAllFilms();
            userInterface.showAllFilms(films);

        }
    }
}
