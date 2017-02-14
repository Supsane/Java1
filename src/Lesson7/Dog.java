package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class Dog {
    private String name;
    private Item item;

    public Dog(String name) {
        this.name = name;
    }

    public void play(Item item) {
        if (item.getOwner() == null) {
            this.item = item;
            item.setOwner(this);
            System.out.println(name + " играет с " + item.getInfo());
        } else {
            if (item.getOwner() == this) {
                System.out.println(name + ": так я с ним и играю...");
            } else {
                System.out.println(name + ": мяч занят");
            }
        }
    }

    public void stopPlaying() {
        if (item != null) {
            System.out.println(name + " перестает играть с " + item.getInfo());
            item.setOwner(null);
            item = null;
        } else {
            System.out.println(name + ": а я и не играю...");
        }
    }
}
