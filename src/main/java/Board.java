import java.util.Arrays;
import java.util.Scanner;

public class Board {
    char[][] cells;

    public Board() {
        cells = new char[3][3];
    }

    public boolean isCellEmpty(int x, int y) {
        if (cells[x][y] == 0) { //Character.isWhitespace(cells[x][y]
            return true;
        }
        return false;
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (isCellEmpty(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        new Board();
        //print();
    }

    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------");
        for (char[] row: cells) {
            System.out.println(Arrays.toString(row));
        }
        /*for (int i = 0; i < cells.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("\t");
            }
            for (int j = 0; j < cells[i].length; j++) {
                System.out.printf("|%c|\n", cells[i][j]);
            }
        }*/
        System.out.println("---------");
    }
}
