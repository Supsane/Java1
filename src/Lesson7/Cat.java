package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void info() {
        System.out.println(name + ": " + hungry);
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        hungry = false;
    }
}
