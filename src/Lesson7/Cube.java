package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Cube extends Item{
    public Dog getOwner() {
        return owner;
    }

    public void setOwner(Dog owner) {
        this.owner = owner;
    }

    public Cube(String color) {
        this.type = "cube";
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
