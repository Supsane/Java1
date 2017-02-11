package Lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Евгений Чашурин on 30.01.2017.
 * echashurin@gmail.com
 */
public class Lesson3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        game();
        guessWord();
    }

    //Задание 1
    public static void randGame() {
        System.out.println("Компьютер загадал число от 0 до 9. У Вас есть 3 попытки, чтобы угадать это число. Первая попытка, введите число");
        game();
        while (true) {
            System.out.println("Хотите сыграть еще? y/n");
            String yn = sc.next();
            if (yn.equals("y")) {
                System.out.println("Введите число");
                game();
            } else break;
        }
    }

    public static void game() {
        Random rnd = new Random();
        int random = rnd.nextInt(10);
        int numbEnter = -1;
        for (int i = 0; i < 3; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    numbEnter = sc.nextInt();
                    break;
                } else {
                    System.out.println("Вы ввели не число. Введите пожалуйста число");
                    sc.nextLine();
                }
            }
            if (numbEnter > random) {
                System.out.println("Введеное Вами число больше загаданного, попробуйте еще раз. Осталось попыток " + (3 - i - 1));
            } else if (numbEnter < random) {
                System.out.println("Введеное Вами число меньше загаданного, попробуйте еще раз. Осталось попыток " + (3 - i - 1));
            } else {
                System.out.println("Поздравляем вы угадали!!!");
                break;
            }
        }
    }

    //Задание 2
    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd = new Random();
        int random = rnd.nextInt(words.length);
        String word = words[random];
        System.out.println("Компьютер загадал какое-то слово. У Вас есть бесконечное количество попыток его угадать. Введите слово");
        while (true) {
            String userWord = sc.next();
            if (userWord.equals(word)) {
                System.out.println("Поздравляем, Вы угадали!!!");
                break;
            }
            int wordLength = word.length();
            int userWordLength = userWord.length();
            int maxLength;
            if (wordLength > userWordLength) maxLength = userWordLength;
            else maxLength = wordLength;
            char word1 = word.charAt(0);
            char userWord1 = userWord.charAt(0);
            if (word1 == userWord1) {
                System.out.println("Вы не угадали слово, но совпали первые буквы, они следующие:");
                System.out.print(word1);
                for (int i = 1; i < maxLength; i++) {
                    char word2 = word.charAt(i);
                    char userWord2 = userWord.charAt(i);
                    if (word2 == userWord2) {
                        System.out.print(word2);
                    }
                }
                System.out.println("###########");
            } else System.out.println("К сожалению вы не угадали слово и не совпало ни одной буквы, попробуйте еще раз");
        }
    }
}
