package OOP.Stipend;

public class Aspirant extends Student {
    private float averageGrade;
    private String theme;
    private int scholarshipAmount;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Aspirant(String firstName, String lastName, String group, String theme,
                    float averageGrade, int scholarshipAmount) {
        super(firstName, lastName, group, averageGrade, scholarshipAmount);
        setTheme(theme);
        this.averageGrade = averageGrade;

    }

    @Override
    public int getScholarship() {
        if (averageGrade >= 5) {
            scholarshipAmount = 2000;
        } else {
            scholarshipAmount = 1800;
        }
        return scholarshipAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "" +
                " ,тема работы: " + theme;

    }
}


