import java.util.Scanner;
public class dz3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите пятизначное число: ");
//        System.out.print("1: ");
//        int num1 = input.nextInt();
//        System.out.print("2: ");
//        int num2 = input.nextInt();
//        System.out.print("3: ");
//        int num3 = input.nextInt();
//        System.out.print("4: ");
//        int num4 = input.nextInt();
//        System.out.print("5: ");
//        int num5 = input.nextInt();
//        System.out.printf("Произведение цифр числа 97531: %.0f %n", (float) (num1 * num2) * (num3 * num4) * (num5));
//        System.out.printf("Средне арифметическое числа 97531: %.1f %n", (float) (num1 + num2 + num3 + num4 + num5) / 5);
//        input.close();
//      int a = 5;
//      a+=10; //a= a + 10
//        a -= 2; // a = a -2
//        System.out.println(a);

        Scanner input = new Scanner(System.in);
//        int a, b, c sum;
//        System.out.print("Введите 1 число: ");
//        a = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        b = input.nextInt();
//        System.out.print("Введите 3 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел:" + sum);

//        int sum;
//        System.out.print("Введите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += input.nextInt();

//        System.out.println("Сумма чисел:" + sum);

//        int a = 5;
//        int b = 3;
//        System.out.println(a == b); // false\
//        System.out.println(a != b); // true
//        System.out.println(a > b); // false\
//        System.out.println(a >= b); // false\
//        System.out.println(a <= b); //

//        boolean a1 = 25 > 6 && 5 < 3 && 4 == 4 + 2; // true && false && true = true
//        boolean a2 = 5 < 3;
//        System.out.println(a1);
//        System.out.println(!a2);

        //if  (учловие) { комнда 1


        // }
//        int age;
//        System.out.print("Введите свой возвраст: ");
//        age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать");
//        } else {
//            System.out.println("Доступ запрешен");
//            System.out.println("Вход разрешен с 18 лет");
//        }

//        int num1 = 17;
//        int num2 = 7;
//        if (  num1 >  num2) {
//            System.out.println("Первое число больше второго");
//        }
//        else if (num1 < num2){
//            System.out.println("Первое число меньше второго");
//        }else{
//            System.out.println("Числа равны");
//        }

//        System.out.println("Введите первую сторону");
//        int side1 = input.nextInt();
//        System.out.println("Введите вторую сторону");
//        int side2 = input.nextInt();
//        System.out.println("Введите третью сторону");
//        int side3 = input.nextInt();
//        if  (side1 ==  side2 && side1 == side3 && side2 ==side3) {
//            System.out.println("Треугольник равносторонный...");
//
//
//        }else {
//            System.out.println("Равносторонний");
//            System.out.println("Равнобедренный");
//            System.out.println("Разносторонный");
//int day, time;
//        System.out.print("Введите день недели цифрами: ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5){
//            System.out.println("Рабочий день.\n Введите время:");
//            time = input.nextInt();
//            if (time >= 9 && time <= 18){
//                System.out.println("Открыто.);
//        }else {
//            System.out.println("Закрыто. Откроется в 9:00);
//        }
//        }else if (day == 6 || day == 7) {
//            System.out.println("Выходной день.");
//        }else {
//            System.out.println("Такого дня не существует");
//        }
//        int n;
//        System.out.print("Введите количество ворон: ");
//        n = input.nextInt();
//        if (n >=0 && n <= 9) {
//            System.out.print("На ветке");
//            if (n ==1){
//                System.out.println(n + " ворона");
//            }else if (n >= 2 && n <= 4) {
//                System.out.println(n + "вороны");
//            }else if (n >=5 && n <= 9 || n == 0){
//                    System.out.println(n +"ворон");
//            }
//        }else {
//            System.out.println("Ошибка данных");
//
//        int n;
//        n = input.nextInt();
//        System.out.print(n % 10);
//        int day;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день ");
//            if (day == 1) System.out.print("Понедельник");
//            if (day == 2) System.out.print("Вторник");
//            if (day == 3) System.out.print("Среда");
//            if (day == 4) System.out.print("Четверг");
//            if (day == 5) System.out.print("Пятница");
//        } else if (day == 6 || day == 7) {
//            System.out.print("Выходной день");
//            if (day == 6) System.out.print("Суббота");
//            if (day == 7) System.out.print("Воскресение");
//        } else {
//            System.out.println("Такого дня недели не существует");
//        }
//        int number, res;
//        number = 5;
//        res = number >= 0 ? number : - number;
//        System.out.println(res);

        int age;
        System.out.print("Введите возвраст: ");
        age = input.nextInt();
        System.out.println(age >= 18 && age <= 65 ? "Приятного просмотра": " Вам еще рано смотреть фильм");
    }
}
