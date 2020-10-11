import java.util.*;

class playerHuman {

    private String name;

    public playerHuman(String name) {
        this.name = name;
    }

    public int executeMove(int chooseMove) {

        List<Integer> allowedMoves = new ArrayList<>();
        allowedMoves.add(1);
        allowedMoves.add(2);
        allowedMoves.add(3);

        int move = allowedMoves.get(chooseMove);

        return move;

    }

}