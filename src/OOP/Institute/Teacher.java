package OOP.Institute;

public class Teacher extends Human {
    private String specialization;
    private double experience;


    public Teacher(String lastName, String firstName, int age, String specialization, double experience) {
        super(lastName, firstName, age);
        setSpecialization(specialization);
        setExperience(experience);
        System.out.println("TeacherConstructor");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;

    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" + "specialization='" + specialization + '\'' + ", experience=" + experience + '}';
    }
}

