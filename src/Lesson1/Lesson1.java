package Lesson1;

/**
 * Created by Евгений Чашурин on 24.01.2017.
 * echashurin@gmail.com
 */
public class Lesson1 {

    //Задание 1
    public static void main(String[] args) {

        // Задание 2
        byte a = 12;
        short b = 10;
        int c = 15;
        long d = 400L;
        float f = 10.4f;
        double e = 15.6789;
        boolean bool = true;
        char ch = 'u';
    }

    //Задание 3
    public static int computeMethod(int a, int b, int c, int d) {
        int compute = a * (b + (c / d));
        return compute;
    }

    //Задание 4
    public static boolean checkMethod(int a, int b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5
    public static void thatNumber(int a) {
        if (a >= 0) {
            System.out.print("Переданное число положительное");
        } else {
            System.out.print("Переданное число отрицательное");
        }
    }

    //Задание 6
    public static boolean thatNumber1(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 7
    public static void nameHello(String str) {
        System.out.print("Привет, " + str);
    }

    //Задание 8
    public static void intercalaryYear(int year) {
        if ((year % 100 == 0 && year % 400 == 0) && year % 4 == 0) {
            System.out.println(year + " год високосный");
        }
    }
}
