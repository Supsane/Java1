package Lesson6;

/**
 * Created by Евгений Чашурин on 10.02.2017.
 * echashurin@gmail.com
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(double length) {
        double maxRun = 200 + Math.random()*100;
        if (length > maxRun) System.out.println("Кот " + name + " столько не пробежит");
        else System.out.println("run: " + name + " " + true);
    }

    public void swim(double length) {
        System.out.println("Кот не умеет плавать");
    }

    public void jump(double height) {
        double maxJump = 0.5 + Math.random();
        if (height>maxJump) System.out.println("Кот " + name + " так высоко не прыгнет");
        else System.out.println("jump: " + name + " " +true);
    }
}
