package praktik;

public class dz14 {
    public static void main(String[] args) {
        String strok = "Hello, World";
        System.out.println(strok);
        int big = 0;
        int small = 0;
        for (int i = 0; i < strok.length(); i++) {
            char ch = strok.charAt(i);
            if (ch >= 64 && ch <= 91) {
                big += 1;
            } else if (ch >= 96 && ch <= 123) {
                small += 1;
            }
        }
        System.out.println("Количество строчных букв - " + small + ", " + "Количество прописных букв - " + big);
    }
}
