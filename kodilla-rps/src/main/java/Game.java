
import java.util.Scanner;



class Game {

    private String nameHuman;
    private int numberOfRoundsWin;
    private playerHuman pH = new playerHuman(nameHuman);
    private playerComputer pC = new playerComputer();
    Scanner chooseMove = new Scanner(System.in);

    Game(String nameHuman, int numberOfRoundsWin) {
        this.nameHuman = nameHuman;
        this.numberOfRoundsWin = numberOfRoundsWin;
    }

    public void playGame() {

        int numberOfRoundsHuman = 0;
        int numberOfRoundsComputer = 0;
        boolean end = false;

        do{

            if ( rulesGame(pH.executeMove(chooseMove.nextInt()), pC.executeMove()).equals("Human") ) {
                numberOfRoundsHuman++;
                displayResults("Human", numberOfRoundsHuman, numberOfRoundsComputer);
            } else if ( rulesGame(pH.executeMove(chooseMove.nextInt()), pC.executeMove()).equals("Computer") ) {
                numberOfRoundsComputer++;
                displayResults("Computer", numberOfRoundsHuman, numberOfRoundsComputer);
            }

            if( numberOfRoundsHuman == numberOfRoundsWin ) {
                end = true;
                displayResults("Human", numberOfRoundsHuman, numberOfRoundsComputer);
                System.out.println("The game won Human!");
            } else if( numberOfRoundsComputer == numberOfRoundsWin ) {
                end = true;
                displayResults("Computer", numberOfRoundsHuman, numberOfRoundsComputer);
                System.out.println("The game won Computer!");
            }

        }while (!end);

    }

    public String rulesGame(int movePlayerHuman, int movePlayerComputer) {

        String resultOfRound = "";

        if( movePlayerHuman == 1 && movePlayerComputer == 2 ) {
            resultOfRound = "Computer";
        } else if( movePlayerHuman == 2 && movePlayerComputer == 1 ) {
            resultOfRound = "Human";
        } else if( movePlayerHuman == 1 && movePlayerComputer == 3 ) {
            resultOfRound = "Human";
        } else if( movePlayerHuman == 3 && movePlayerComputer == 1 ) {
            resultOfRound = "Computer";
        } else if( movePlayerHuman == 2 && movePlayerComputer == 3 ) {
            resultOfRound = "Computer";
        } else if( movePlayerHuman == 3 && movePlayerComputer == 2 ) {
            resultOfRound = "Human";
        } else {
            resultOfRound = "";
        }

        return resultOfRound;

    }

    public void displayResults(String winner, int resultPlayerHuman, int resultPlayerComputer) {

        System.out.println("Execute moves players:");
        System.out.println("Execute move " + nameHuman + " is " + pH.executeMove(chooseMove.nextInt()));
        System.out.println("Execute move Computer is " + pC.executeMove());
        System.out.println("This round win " + winner);
        System.out.println("Currently result game -> \tPlayer Human : " + resultPlayerHuman + "\tPlayer Computer : " + resultPlayerComputer);

    }

}