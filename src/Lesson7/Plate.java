package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Plate {
    private final int maxFood = 40;
    private int food;

    public boolean decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.println("В тарелке нет столько еды");
            addEatInPlate();
            System.out.println("Тарелка была наполнена до краев");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public Plate(int food) {
        if (food < maxFood) this.food = food;
        else {
            System.out.print("В тарелку столько не убирается.");
            System.out.println(" Вы рассыпали " + (food - maxFood) + " еды");
            this.food = maxFood;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addEatInPlate() {
        food += (maxFood - food);
    }
}
