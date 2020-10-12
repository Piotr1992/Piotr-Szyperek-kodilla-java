
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
        String resultRulesGame;
        int movePlayerComputer = 0;
        int movePlayerHuman = 0;

        while (!end) {

            System.out.print("Execute move: \t");
            movePlayerHuman  = pH.executeMove( getInputInt( chooseMove , 4) );

            movePlayerComputer = pC.executeMove();
            System.out.print("Executed move of computer: \t" + movePlayerComputer);


            resultRulesGame = rulesGame(movePlayerHuman, movePlayerComputer);

            if ( resultRulesGame.equals("Human") ) {
                numberOfRoundsHuman++;
            } else if ( resultRulesGame.equals("Computer") ) {
                numberOfRoundsComputer++;
            }

            displayResults(resultRulesGame, numberOfRoundsHuman, numberOfRoundsComputer, movePlayerHuman, movePlayerComputer);

            if( numberOfRoundsHuman == numberOfRoundsWin ) {
                end = true;
                System.out.println("Human win game!");
            } else if( numberOfRoundsComputer == numberOfRoundsWin ) {
                end = true;
                System.out.println("Computer win game!");
            }

        }
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

    public void displayResults(String winner, int resultPlayerHuman, int resultPlayerComputer, int movePlayerHuman, int movePlayerComputer) {
        System.out.println("\n\n\nExecute moves players:");
        System.out.println("Executed move " + nameHuman + " -> " + movePlayerHuman);
        System.out.println("Execute move Computer -> " + movePlayerComputer);
        if( resultPlayerHuman != resultPlayerComputer ) {
            System.out.println("This round win -> " + winner);
        } else {
            System.out.println("There was a draw this round!");
        }
        System.out.println("Currently result game : \nPlayer Human -> " + resultPlayerHuman + "\tPlayer Computer -> " + resultPlayerComputer + "\n\n\n");
    }

    public int getInputInt(Scanner in, int range)  {
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int val = in.nextInt();
                if (val > 0 && val < range) {
                    return val;
                }
            } else {
                in.nextInt();
            }
        }

        if(in.hasNext()) {
            String key = in.next();
            if ( key.equals("x") ) {
                System.out.println("Are you sure you want to end the game?\nPress key Y or y!");
                if( key.equals("Y") && key.equals("y") ) {
                    System.exit(-1);
                }
            } else if ( key.equals("n") ) {
                System.out.println("Are you sure you want to end the current game?\nPress key Y or y!");
                if( key.equals("Y") && key.equals("y") ) {
                    RpsRunner rr = new RpsRunner();
                    String[] arg = new String[10];
                    rr.main(arg);
                }
            }
        }

        return -1;
    }



}