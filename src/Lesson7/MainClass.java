package Lesson7;

/**
 * Created by Евгений on 14.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik 1");
        Dog dog2 = new Dog("Bobik 2");
        Dog dog3 = new Dog("Bobik 3");
        Ball ball = new Ball("Red");
        Cube cube = new Cube("Green");

        dog1.play(ball);
        dog1.play(ball);
        dog2.play(cube);
        dog2.stopPlaying();
        dog1.stopPlaying();
        dog1.stopPlaying();
    }
}
