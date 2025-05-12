package pl.training.module03;

public class TicTacToe {

    private static final byte EMPTY = 0;
    private static final byte PLAYER_X = 1;
    private static final byte PLAYER_O = 2;

    private final byte[] board = new byte[9];

    public void printBoard() {
        for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
            switch (board[fieldIndex]) {
                case EMPTY:
                    System.out.print("-  ");
                    break;
                case PLAYER_X:
                    System.out.print("X  ");
                    break;
                case PLAYER_O:
                    System.out.print("O  ");
                    break;
            }
            if ((fieldIndex + 1) % 3 == 0)
                System.out.println();
        }
    }

}
