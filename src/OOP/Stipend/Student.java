package OOP.Stipend;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private float averageGrade;
    private int scholarshipAmount;

    public Student(String firstName, String lastName, String
            group, float averageGrade, int scholarshipAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageGrade = averageGrade;
        this.scholarshipAmount = scholarshipAmount;

    }

    public Student(float averageGrade) {

    }

    public int getScholarship() {
        if (averageGrade >= 5) {
            scholarshipAmount = 1000;
        } else {
            scholarshipAmount = 800;
        }
        return scholarshipAmount;
    }

    @Override
    public String toString() {
        float getScholarship = getScholarship();
        return "" +
                " " + firstName +
                " " + lastName +
                ", группа " + group +
                ", оценка " + averageGrade +
                ", сумма стипендии " + getScholarship + ""
                ;
    }
}


