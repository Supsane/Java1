package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Plate {
    private int food;

    public void decreaseFood(int n) {
        food -= n;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
