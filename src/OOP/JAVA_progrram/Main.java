package OOP.JAVA_progrram;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int Width = 100;
        int Height = 150;

        final int N = 1;
        Converter converter[] = new Converter[N];
        converter[0] = new Rectangle();


        for (Converter c : converter) {
            System.out.print("Width: " + Width + ", ");
            System.out.println("Height: " + Height);
            System.out.print("Width: " + c.resizeWidth(Width) + ", ");
            System.out.println("Height: " + c.resizeHeight(Height));
        }


    }
}

interface Converter {
    int resizeWidth(int width);


    int resizeHeight(int height);

}

class Rectangle implements Converter {

    public Rectangle() {
    }

    @Override
    public int resizeWidth(int width) {
        return width + 150;
    }

    @Override
    public int resizeHeight(int height) {
        return height + 150;
    }
}
