package OOP.FigureV;

public class Shar extends Shape {

    private int radius;

    public Shar(int radius, String figure) {
        super(figure);
        this.radius = radius;
    }

    @Override
    public double getV() {
        return (4.0 / 3.0) * Math.PI *
                radius * radius * radius;
    }

    @Override
    public void info() {
        System.out.printf("Фигура:  " + getFigure() + "      |"
                + " Обьем фигуры: "  + "%.2f%n",getV());
    }

}
