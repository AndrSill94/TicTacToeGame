import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Main programm function
 * program entry point
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Player1 player1;
        Player2 player2;
        System.out.println("****Welcome to tictac toe game*****\n");

        while(true) {
            System.out.print("Select player1: ");
            String firstPlayerSelect = scanner.next();
            player1 = new Player1("Player1", firstPlayerSelect);
            if(!firstPlayerSelect.equals("x") && !firstPlayerSelect.equals("0")) {
                System.out.println("Invalid error, input x or 0");
                continue;
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("Select player2: ");
            String secondPlayerSelect = scanner.next();
            player2 = new Player2("Player2", secondPlayerSelect);

            if(!secondPlayerSelect.equals("x") && !secondPlayerSelect.equals("0")) {
                System.out.println("Invalid error, input x or 0");
                continue;
            } else {
                break;
            }
        }
        System.out.println("**Greate**");

        System.out.println("Player1 : " + player1.getPlayerSelect());
        System.out.println("Player2 : " + player2.getPlayerSelect());
        System.out.println("Start game.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Start game..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Start game...");
        TimeUnit.SECONDS.sleep(1);
        clearConsole();
        Board board = new Board();
        System.out.println(board.getBoard());

        String winner = "";

        while(Board.getBoardCounter() < 9) {
            System.out.print("Player1 " + "(" + player1.getPlayerSelect() + ")" + "turn(select cell number) : ");
            int cellNumber = scanner.nextInt();
            board.inputElement(cellNumber, player1.getPlayerSelect());

            clearConsole();
            System.out.println(board.getBoard());

            if(board.winCheck()) {
                System.out.println(player1.getName() + " winner");
                break;
            }


            System.out.print("Player2 " + "(" + player2.getPlayerSelect() + ")" + "turn(select cell number) : ");
            cellNumber = scanner.nextInt();
            board.inputElement(cellNumber, player2.getPlayerSelect());

            clearConsole();
            System.out.println(board.getBoard());

            if(board.winCheck()) {
                System.out.println(player2.getName() + " winner");
                break;
            }

        }
        System.out.println("draw. no winners");
    }

    /**
     * function to clear the console
     * transition simulation
     */
    public static void clearConsole() {
        for(var i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }
}
