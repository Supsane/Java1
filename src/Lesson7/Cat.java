package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void info() {
        System.out.println(name + ": " + hungry);
    }

    public void eat(Plate plate) {
        if (!hungry) {
            boolean eatOrNot = plate.decreaseFood(appetite);
            if (eatOrNot) hungry = true;
            else hungry = false;
        } else System.out.println(name + " не хочет есть");
    }
}
