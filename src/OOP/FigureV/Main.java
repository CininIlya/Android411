package OOP.FigureV;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[3];
        shapes[0] = new Shar(4,"Шар");
        shapes[1] = new Cilindr(2,2,"Цилиндр");
        shapes[2] = new Pirtamide(100,60,"Пирамида");
        for (Shape shape : shapes){
            shape.info();
        }
    }
}
