/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tictactoe;

import java.util.ArrayList;
import java.util.List;

import tictactoe.controllers.GameController;
import tictactoe.models.BotDifficultyLevel;
import tictactoe.models.BotPlayer;
import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;
import tictactoe.models.Symbol;

/**
 *
 * @author mukeshsingh
 */
public class TicTacToe {

    public static void main(String[] args) {
        GameController gameController = new GameController();

        // setting custom values for simplicity.
        int dimension = 3;
        List<Player>players = new ArrayList<>();

        players.add(new Player("Mukesh" , new Symbol('X')));
        players.add(new BotPlayer("Bot" , new Symbol('O'), BotDifficultyLevel.EASY));
        
        Game game = gameController.startGame(dimension, players);

        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS))
        {  
            gameController.printBoard(game);
            gameController.makeMove(game);
        }
        //GameState either will be ENDED or DRAW.
        if (gameController.getGameState(game).equals(GameState.COMPLETED)) {
            gameController.printBoard(game);
            System.out.println(gameController.getWinner(game).getName() + " has WON the game.");
        } else {
            System.out.println("GAME DRAW!");
        }

       
    }
}
