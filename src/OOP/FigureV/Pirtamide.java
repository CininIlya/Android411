package OOP.FigureV;

public class Pirtamide extends Shape {
private int S;
private int h;

    public Pirtamide( int s, int h,String figure) {
        super(figure);
        S = s;
        this.h = h;
    }

    @Override
    public double getV() {
        return (1.0 / 3.0) *S *h ;
    }

    @Override
    public void info() {
        System.out.printf("Фигура:  " + getFigure() + " |" + " Обьем фигуры: " + "%.2f%n",getV());
    }
}
