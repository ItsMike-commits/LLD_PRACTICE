package tictactoe.factory;


import tictactoe.models.BotDifficultyLevel;
import tictactoe.models.BotPlayer;
import tictactoe.strategy.botplayingstrategy.BotPlayingStrategy;
import tictactoe.strategy.botplayingstrategy.EasyBotPlayingStrategy;
import tictactoe.strategy.botplayingstrategy.MediumBotPlayingStrategy;
import tictactoe.strategy.botplayingstrategy.HardBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel)
    {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY))
        return new EasyBotPlayingStrategy();
        else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
        return new MediumBotPlayingStrategy();
        else if(botDifficultyLevel.equals(BotDifficultyLevel.HARD))
        return new HardBotPlayingStrategy();

        return null;

    }

}
