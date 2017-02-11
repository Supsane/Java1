package Lesson6;

/**
 * Created by Евгений Чашурин on 11.02.2017.
 * echashurin@gmail.com
 * Check
 */
public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Palkan");
        Cat cat = new Cat("Barsik");
        cat.run(250);
        cat.jump(1);
        cat.swim(12);
        dog.run(600);
        dog.jump(1.2);
        dog.swim(15);
    }
}
