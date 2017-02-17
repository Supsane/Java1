package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Cat cat[] = {new Cat("Barsik1", 10), new Cat("Barsik2", 15), new Cat("Barsik3", 20)};
        Plate plate = new Plate(41);
        cat[0].info();
        plate.info();
        cat[0].eat(plate);
        cat[0].info();
        plate.info();
        cat[0].eat(plate);
        cat[0].info();
        plate.info();
        cat[1].info();
        cat[1].eat(plate);
        cat[1].info();
        plate.info();
        cat[2].info();
        cat[2].eat(plate);
        cat[2].eat(plate);
        cat[2].info();
        plate.info();

    }
}
