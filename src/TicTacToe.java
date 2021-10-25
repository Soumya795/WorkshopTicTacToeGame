import java.util.Scanner;

public class TicTacToe {
    static char player, computer;
    static int location;
    public static Scanner s = new Scanner(System.in);
    static char[] board = new char[10];
    static void toss(){
        double toss=Math.floor(Math.random()*10)%2;
        int coin=s.nextInt();
        if (coin == toss)
        {
            System.out.println("Player Won and will be making the 1st move ");
        }
        else
            System.out.println("Player Won and will be making the 1st move");
    }
    static void createBoard() {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }

    }

    static void choice() {

        player = Character.toUpperCase(s.next().charAt(0));
        if (player == 'X')
            computer = 'O';
        else if (player == 'O')
            computer = 'X';
        else
            System.out.println("Invalid choice");

    }

    static void showBoard() {
        System.out.println(board[1] + "--|-" + board[2] + "-|-" + board[3] + "-|--");
        System.out.println(board[4] + "--|-" + board[5] + "-|-" + board[6] + "-|--");
        System.out.println(board[7] + "--|-" + board[8] + "-|-" + board[9] + "-|--");

    }

    static void userMove() {
        System.out.println("Enter A position between 1 to 9 ");
        location = s.nextInt();

            if (location > 0 && location < 10) {
                board[location] = player;
                showBoard();
            } else
                System.out.println("Wrong Input Start from the Beginning");
    }


    public static void main(String[] args) {
        System.out.println("Welcome To The Game of Tic Tac Toe");
        toss();
        createBoard();
        choice();
        showBoard();
        userMove();

    }
}
