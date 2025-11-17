package tictactoe.strategy.winningstrategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Move move , Board board);

}
