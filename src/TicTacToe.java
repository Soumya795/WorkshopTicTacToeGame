import java.util.Scanner;

public class TicTacToe {
    static char player, computer;
    public static Scanner s = new Scanner(System.in);
    static char[] board = new char[10];

    static void createBoard() {

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

    static void showBoard() {
        System.out.println( board[1] + "--|-" + board[2] + "-|-" + board[3] + "-|--");
        System.out.println( board[4] + "--|-" + board[5] + "-|-" + board[6] + "-|--");
        System.out.println( board[7] + "--|-" + board[8] + "-|-" + board[9] + "-|--");

    }


    public static void main(String[] args) {
        System.out.println("Welcome To The Game of Tic Tac Toe");
        createBoard();
        choice();
        showBoard();
    }
}
