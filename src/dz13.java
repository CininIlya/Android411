
public class dz13 {
    public static void main(String[] args) {
        int[] mas = {-2, 3, 8, -11, -4, 6,};
        System.out.print("n=");
        System.out.println(Otric(0, mas));

    }

    public static int Otric(int i, int[] arr) {
        if (i == arr.length)
            return 0;

        int s = Otric(i + 1, arr);
        if (arr[i] < 0) {
            s++;
        }
        return s;
    }
}