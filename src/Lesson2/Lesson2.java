package Lesson2;

import java.util.Arrays;

/**
 * Created by Евгений Чашурин on 27.01.2017.
 * echashurin@gmail.com
 */
public class Lesson2 {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 0, 8,};
        inversArr();
        completeArr();
        updateArr();
        squareArr();
        minMaxArr();
        System.out.println(doubleSummArr(array));
        biasArr(array, -1);
    }

    //Задание 1
    public static void inversArr() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 2
    public static void completeArr() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 3
    public static void updateArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 4
    public static void squareArr() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (j == arr.length - i - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5
    public static void minMaxArr() {
        int[] arr = {-8, 10, 14, 25, 47, -15, 0};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент в массиве - " + max);
        System.out.println("Минимальный элемент в массиве - " + min);
    }

    //Задание 6
    public static boolean doubleSummArr(int[] arr) {
        int k = 0;
        int i = 1;
        int j = 0;
        while (k < arr.length - 1) {
            if (summArr1(j, arr) == summArr2(i, arr)) {
                return true;
            }
            k += 1;
            i += 1;
            j += 1;
        }
        return false;
    }

    //Ищем сумму левой части массива
    public static int summArr1(int a, int[] arr) {
        int summ = 0;
        for (int i = 0; i <= a; i++) {
            summ += arr[i];
        }
        return summ;
    }

    //Ищем сумму правой части массива
    public static int summArr2(int a, int[] arr) {
        int summ = 0;
        for (; a < arr.length; a++) {
            summ += arr[a];
        }
        return summ;
    }

    //Задание 7
    public static void biasArr(int[] arr, int n) {
        if (Math.abs(n) >= arr.length || n == 0) {
            System.out.println("Переданное число для смещения больше длины массива или равно нулю");
        } else {
            if (n > 0) {
                while (n > 0) {
                    int m = arr[arr.length - 1];
                    for (int i = 0; i < arr.length; i++) {
                        int l = arr[i];
                        arr[i] = m;
                        m = l;
                    }
                    n--;
                }
            } else {
                while (n < 0) {
                    int m = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        int l = arr[arr.length - i - 1];
                        arr[arr.length - i - 1] = m;
                        m = l;
                    }
                    n++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
