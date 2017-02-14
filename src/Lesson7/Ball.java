package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Ball extends Item{
    public Dog getOwner() {
        return owner;
    }

    public void setOwner(Dog owner) {
        this.owner = owner;
    }

    public Ball(String color) {
        this.type = "ball";
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
