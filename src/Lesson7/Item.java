package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Item {
    protected String color;
    protected Dog owner;
    protected String type;

    public Dog getOwner() {
        return owner;
    }

    public void setOwner(Dog owner) {
        this.owner = owner;
    }

    public String getInfo() {
        return type + " " + color;
    }
}
