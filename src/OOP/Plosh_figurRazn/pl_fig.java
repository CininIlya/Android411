package OOP.Plosh_figurRazn;

public class pl_fig {
    private static int count;

    public static double triangle1(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        count++;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double triangle2(int a, int h) {
        count++;
        return 0.5 * a * h;
    }

    public static int kvadrat(int a) {
        count++;
        return a * a;
    }

    public static int pryamougolnik(int a, int b) {
        count++;
        return a * b;
    }

    public static int getCount() {
        return count;
    }
}


