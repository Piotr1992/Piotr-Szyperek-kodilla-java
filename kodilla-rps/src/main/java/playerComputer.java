
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



class playerComputer {

    public int executeMove() {

        List<Integer> allowedMoves = new ArrayList<>();
        allowedMoves.add(1);
        allowedMoves.add(2);
        allowedMoves.add(3);

        Random rand = new Random();
        int chooseMoves = rand.nextInt(3);
        int move = allowedMoves.get(chooseMoves);

        return move;

    }

}