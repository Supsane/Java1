package Lesson6;

/**
 * Created by Евгений Чашурин on 10.02.2017.
 * echashurin@gmail.com
 */
public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(double length);

    public abstract void swim(double length);

    public abstract void jump(double height);
}
