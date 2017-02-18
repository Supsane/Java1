package Lesson8;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Евгений Чашурин on 03.02.2017.
 * echashurin@gmail.com
 */
public class XOGame {
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static char fieldArray[][];
    public static final int SIZE_FIELD = 3;
    public static final int DOT_WIN = 3;
    public static final char EMPTY_CELL = '*';
    public static final char X_DOT = 'X';
    public static final char O_DOT = 'O';

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            stepUser();
            printField();
            if (checkWin(X_DOT)) {
                System.out.println("Поздравляем, Вы победили!!!");
                break;
            }
            if (checkFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            stepAI();
            printField();
            if (checkWin(O_DOT)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (checkFieldFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }

    public static void initField() {
        fieldArray = new char[SIZE_FIELD][SIZE_FIELD];
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int j = 0; j < SIZE_FIELD; j++) {
                fieldArray[i][j] = EMPTY_CELL;
            }
        }
    }

    public static void printField() {
        System.out.print("    ");
        for (int i = 0; i < SIZE_FIELD; i++) {
            System.out.printf(" %2d ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE_FIELD; i++) {
            System.out.printf(" %2d ", i + 1);
            for (int j = 0; j < SIZE_FIELD; j++) {
                System.out.printf(" %2c ", fieldArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void stepUser() {
        System.out.println("Ваш ход. Введите координаты X, Y.");
        int x, y;
        do {
            x = checkX() - 1;
            y = checkY() - 1;
        }
        while (!chekXY_SizeField(x, y));
        fieldArray[y][x] = X_DOT;
    }

    public static int checkX() {
        int x;
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не число, введите координату X");
                sc.nextLine();
            }
        }
        return x;
    }

    public static int checkY() {
        int y;
        while (true) {
            if (sc.hasNextInt()) {
                y = sc.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не число, введите координату Y");
                sc.nextLine();
            }
        }
        return y;
    }

    public static void stepAI() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE_FIELD);
            y = rnd.nextInt(SIZE_FIELD);
        }
        while (!chekXY_SizeField(x, y));
        fieldArray[y][x] = O_DOT;
        System.out.println("Компьютер сходил в точку " + (x + 1) + ", " + (y + 1));
    }

    public static boolean chekXY_SizeField(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE_FIELD || y >= SIZE_FIELD) {
            System.out.println("Введенные координаты не попадают в поле, введите корректные координаты");
            sc.nextLine();
            return false;
        }
        if (fieldArray[y][x] == EMPTY_CELL) return true;
        return false;
    }

    public static boolean checkWin(char symb) {
        if (fieldArray[0][0] == symb && fieldArray[0][1] == symb && fieldArray[0][2] == symb) return true;
        if (fieldArray[1][0] == symb && fieldArray[1][1] == symb && fieldArray[1][2] == symb) return true;
        if (fieldArray[2][0] == symb && fieldArray[2][1] == symb && fieldArray[2][2] == symb) return true;

        if (fieldArray[0][0] == symb && fieldArray[1][0] == symb && fieldArray[2][0] == symb) return true;
        if (fieldArray[0][1] == symb && fieldArray[1][1] == symb && fieldArray[2][1] == symb) return true;
        if (fieldArray[0][2] == symb && fieldArray[1][2] == symb && fieldArray[2][2] == symb) return true;

        if (fieldArray[0][0] == symb && fieldArray[1][1] == symb && fieldArray[2][2] == symb) return true;
        if (fieldArray[2][0] == symb && fieldArray[1][1] == symb && fieldArray[0][2] == symb) return true;
        return false;
    }

    public static boolean checkFieldFull() {
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int j = 0; j < SIZE_FIELD; j++) {
                if (fieldArray[i][j] == EMPTY_CELL) return false;
            }
        }
        return true;
    }
}
