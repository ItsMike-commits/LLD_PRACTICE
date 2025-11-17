package tictactoe.models;

import tictactoe.factory.BotPlayingStrategyFactory;
import tictactoe.strategy.botplayingstrategy.BotPlayingStrategy;

public class BotPlayer extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel)
    {
      super(name, symbol);
      setPlayerType(PlayerType.BOT);
      this.botDifficultyLevel = botDifficultyLevel;
      this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }
    
    @Override
    public Move makeMove(Board board)
    {
      return botPlayingStrategy.makeMove(board);


    }


}
