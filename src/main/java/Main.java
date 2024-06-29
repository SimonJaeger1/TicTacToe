public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.print();
        board.place(0,0, 'X');
        board.print();
        board.place(0,1, 'O');
        board.print();
        board.place(1,0, 'X');
        board.print();
        board.place(2,1, 'O');
        board.print();
    }
}
