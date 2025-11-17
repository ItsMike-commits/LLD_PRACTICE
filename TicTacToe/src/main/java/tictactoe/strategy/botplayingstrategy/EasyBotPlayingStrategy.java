package tictactoe.strategy.botplayingstrategy;

import java.util.List;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board)
    {
         for (List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.isEmpty()) {
                    return new Move(null, cell);
                }
            }
        }

        return null;

    }

}
