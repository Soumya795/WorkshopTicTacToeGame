public class TicTacToe {

    static void createBoard(){
        char[]board=new char[10];
        for (int i=1;i<10;i++){
            board[i]=' ';
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Game of Tic Tac Toe");
        createBoard();

    }
}
