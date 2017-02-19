package Lesson8.XOGame_Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Евгений on 18.02.2017.
 */
public class MainGameClass extends JPanel {
    private int[][] map;
    private int SIZE = 3;
    private int DOT_TO_WIN = 3;
    private final int SIZE_WINDOW = 500;
    private int CELL_SIZE_HEIGHT = (SIZE_WINDOW - 50)/SIZE;
    private int CELL_SIZE_WIDTH = SIZE_WINDOW/SIZE;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i = 0; i < SIZE; i++) {
            g.drawLine(0, i * CELL_SIZE_HEIGHT, SIZE_WINDOW, i * CELL_SIZE_HEIGHT);
            g.drawLine(i * CELL_SIZE_WIDTH, 0, i * CELL_SIZE_WIDTH, SIZE_WINDOW);
        }
    }
}
