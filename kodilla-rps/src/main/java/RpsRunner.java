
import java.util.Scanner;



public class RpsRunner {

    public static void main(String[] args) {

        Scanner scName = new Scanner(System.in);
        Scanner scNumberOfRounds = new Scanner(System.in);

        System.out.print("\nGive your name:\t");
        String name = scName.next();

        System.out.print("\nGive number of rounds won and followed by victory:\t");
        int numberOfRoundsWin = scNumberOfRounds.nextInt();

        System.out.println("\nGame manual:");
        System.out.println("key 1 - play \"stone\"");
        System.out.println("key 2 - play \"paper\"");
        System.out.println("key 3 - play \"scissors\"");
        System.out.println("key x - ending the game, preceded by the question \"Are you sure you want to end the game?\"");
        System.out.println("n key - restart the game, preceded by the question \"Are you sure you want to end the current game?\"");

        System.out.println("\n\nStart game!\n");
        Game game = new Game(name, numberOfRoundsWin);
        game.playGame();

    }

}





