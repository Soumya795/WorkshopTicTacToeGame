import java.util.Scanner;

public class TicTacToe {
    static char player, computer;
    public static Scanner s = new Scanner(System.in);

    static void createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }

    }

    static void choice() {

        player = Character.toUpperCase(s.next().charAt(0));
        if (player == 'X')
            computer = 'O';
        else
            computer = 'X';

    }


    public static void main(String[] args) {
        System.out.println("Welcome To The Game of Tic Tac Toe");
        createBoard();
        choice();
    }
}
