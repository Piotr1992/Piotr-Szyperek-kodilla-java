
import java.util.*;

class PlayerHuman {

    public int executeMove(int chooseMove) {
        List<Integer> allowedMoves = new ArrayList<>();
        allowedMoves.add(1);
        allowedMoves.add(2);
        allowedMoves.add(3);
        int move = allowedMoves.get(chooseMove-1);
        return move;
    }
}