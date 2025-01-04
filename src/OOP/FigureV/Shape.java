package OOP.FigureV;

public abstract class Shape {
    private String figure;

    public Shape(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }
    public abstract double getV();

    public  abstract  void info();
}
