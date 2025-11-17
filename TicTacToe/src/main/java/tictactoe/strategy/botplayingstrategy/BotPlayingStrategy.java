package tictactoe.strategy.botplayingstrategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);

}
