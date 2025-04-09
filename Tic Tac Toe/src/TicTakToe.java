import java.util.Scanner;

public class TicTakToe {
    private char[][] game_board = new char[3][3];
    private int player = 1;
    private String player1;
    private String player2;
    private char cell_value = 0;
    private int[] currentRow = {0,0};
    TicTakToe(){
        System.out.println("Welcome to Ranjith's TicTakToe.");
        for(int row=0;row<3;row++){
            for (int col=0;col<3;col++){
                this.game_board[row][col]='_';
            }
        }
        this.start_game();
    }

    private void display_board(Scanner scanner){
        for(int row=0;row<3;row++){
            System.out.println();
            for(int col=0;col<3;col++){
                System.out.print(game_board[row][col]+" ");
            }
        }
        System.out.println();
        System.out.println();
        if(player%2==0){
            System.out.println(this.player2+"'s turn : ");
        }else{
            System.out.println(this.player1+"'s turn : ");
        }
        this.player++;
        this.display_board(scanner);
    }
//    private void checkCell(int row,int col){
//
//    }
    private void checkValue(Scanner scanner){
        if(Character.toUpperCase(this.cell_value) != 'X' && Character.toUpperCase(this.cell_value) != 'O'){
            System.out.print("Enter the correct value.Only X or O allowed : ");
            String input = scanner.nextLine();
            this.cell_value = input.charAt(0);
            System.out.println("cell value "+this.cell_value);
            checkValue(scanner);
        }
    }
    private void start_game(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ranjith's TicTacToe Game!");
        System.out.print("Enter player 1 name : ");
        player1 = scanner.next();
        System.out.print("Enter player 2 name : ");
        player2 = scanner.next();
        System.out.println("Names : "+player1+" "+player2);
        System.out.println("The game has started! Good luck and Have fun with your friend.");
        this.display_board(scanner);
    }

    private boolean checkWinner(){
//        this.game_board
        return false;
    }

}
