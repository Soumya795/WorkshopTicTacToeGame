import java.util.Scanner;

public class TicTacToe {
    static char player, computer;
    static int location;
    public static Scanner s = new Scanner(System.in);
    static char[] board = new char[10];
    private static boolean playerWinToss;
    private static boolean isWinner=false;

    static void toss() {
        double toss = Math.floor(Math.random() * 10) % 2;
        int coin = s.nextInt();
        if (coin == toss) {
            System.out.println("Player Won and will be making the 1st move ");
        } else
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

        while (true) {
            location = s.nextInt();
            s.nextLine();
            if (isEmpty(location) && location > 0 && location < 10) {
                board[location] = player;
                showBoard();
                break;
            } else {
                System.out.println("Wrong Input Start from the Beginning");
            }

        }

    }

    public static boolean isEmpty(int location) {
        return board[location] == ' ';
    }
    static void computerMove(){
        System.out.println("Computer Plays");
        while (!isEmpty(location))
        {
            location = (int) Math.floor( Math.random()*((100%9)+1));
        }
        board[location]=computer;
        showBoard();

    }


    public static boolean checkBoard() {
        if ((board[1] != ' ') && (board[2] != ' ') && (board[3] != ' ') && (board[4] != ' ') && (board[5] != ' ')
                && (board[6] != ' ') && (board[7] != ' ') && (board[8] != ' ') && (board[9] != ' ')) {

            return true;
        }
        return false;
    }

     public static boolean checkWinner() {
         if (isWinner)
             return true;
         if ((board[1] == player && board[2] == player && board[3] == player)
                 || (board[4] == player && board[5] == player && board[6] == player)
                 || (board[7] == player && board[8] == player && board[9] == player)
                 || (board[1] == player && board[4] == player && board[7] == player)
                 || (board[2] == player && board[5] == player && board[8] == player)
                 || (board[3] == player && board[6] == player && board[9] == player)
                 || (board[1] == player && board[5] == player && board[9] == player)
                 || (board[3] == player && board[5] == player && board[7] == player)) {
             System.out.println("Player is the WINNER!!");
             isWinner = true;
             return true;
         }

         if ((board[1] == computer && board[2] == computer && board[3] == computer)
                 || (board[4] == computer && board[5] == computer && board[6] == computer)
                 || (board[7] == computer && board[8] == computer && board[9] == computer)
                 || (board[1] == computer && board[4] == computer && board[7] == computer)
                 || (board[2] == computer && board[5] == computer && board[8] == computer)
                 || (board[3] == computer && board[6] == computer && board[9] == computer)
                 || (board[1] == computer && board[5] == computer && board[9] == computer)
                 || (board[3] == computer && board[5] == computer && board[7] == computer)) {
             System.out.println("Computer is the WINNER");
             isWinner = true;
             return true;
         }
         return false;
     }
         static void startGame() {
             while (!checkWinner() && !checkBoard()) {
                 if (playerWinToss) {
                     userMove();
                     if (!checkBoard()) {
                         computerMove();
                     } else {
                         computerMove();
                         if (!checkBoard())
                             userMove();
                     }
                     if (!checkBoard() && !checkBoard())
                         System.out.println("Game Tied");
                 }


             }
         }

    public static void main(String[] args) {
        System.out.println("Welcome To The Game of Tic Tac Toe");
        toss();
        createBoard();
        choice();
        showBoard();
        userMove();
        startGame();
    }
}
