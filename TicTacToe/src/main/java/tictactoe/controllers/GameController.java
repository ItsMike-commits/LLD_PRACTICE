package tictactoe.controllers;

import java.util.List;

import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;

public class GameController {

    public Game startGame(int dimension, List<Player> players)
    {
        return Game.getBuilder()
                   .setDimension(dimension)
                   .setPlayers(players)
                   .build();
    }

    public void makeMove(Game game)
    {
        game.makeMove();
    }

    public GameState getGameState(Game game)
    {
       return game.getGameState();
    }

    public Player getWinner(Game game)
    {
        return game.getWinner();
    }

    public void printBoard(Game game)
    {
        game.printBoard();
    }

}
