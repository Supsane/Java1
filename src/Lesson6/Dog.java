package Lesson6;

/**
 * Created by Евгений Чашурин on 10.02.2017.
 * echashurin@gmail.com
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(double length) {
        double maxRun = 400 + Math.random()*300;
        if (length > maxRun) System.out.println("Собака " + name + " так много не пробежит");
        else System.out.println("run: " + name + " " + true);
    }

    public void swim(double length) {
        double maxSwim = 10 + Math.random()*10;
        if (length > maxSwim) System.out.println("Собака " + name + " так много не проплывет");
        else System.out.println("swim: " + name + " " + true);
    }

    public void jump(double height) {
        double maxJump = 0.5 + Math.random();
        if (height > maxJump) System.out.println("Собака " + name + " так высоко не прыгнет");
        else System.out.println("jump: " + name + " " + true);
    }
}
