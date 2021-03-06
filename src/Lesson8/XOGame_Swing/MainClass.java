package Lesson8.XOGame_Swing;

/**
 * Created by Евгений on 18.02.2017.
 */
public class MainClass {
    private int SIZE = 10;
    private int DOT_TO_WIN = 3;
    private final int SIZE_WINDOW = 500;
    private final int CELL_SIZE = 40;
    private int SIZE_FIELD = SIZE * CELL_SIZE;
    private int SIZE_INDENT = (SIZE_WINDOW-SIZE_FIELD)/2;


    public int getSIZE() {
        return SIZE;
    }

    public void setSIZE(int SIZE) {
        this.SIZE = SIZE;
    }

    public int getDOT_TO_WIN() {
        return DOT_TO_WIN;
    }

    public void setDOT_TO_WIN(int DOT_TO_WIN) {
        this.DOT_TO_WIN = DOT_TO_WIN;
    }

    public int getSIZE_FIELD() {
        return SIZE_FIELD;
    }

    public int getSIZE_INDENT() {
        return SIZE_INDENT;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
