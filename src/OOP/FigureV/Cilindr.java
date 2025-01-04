package OOP.FigureV;

public class Cilindr extends Shape {
private int radius;
private int h;

    public Cilindr( int radius, int h,String figure) {
        super(figure);
        this.radius = radius;
        this.h = h;
    }

    @Override
    public double getV() {
        return Math.PI*(radius*radius)*h ;
    }

    @Override
    public void info() {
        System.out.printf("Фигура:  " + getFigure() + "  |"
                + " Обьем фигуры: " + "%.2f%n",getV());
    }
}

