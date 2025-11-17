package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import tictactoe.exceptions.InvalidMoveException;
import tictactoe.strategy.winningstrategy.ColWinningStrategy;
import tictactoe.strategy.winningstrategy.DiagonalWinningStrategy;
import tictactoe.strategy.winningstrategy.RowWinningStrategy;
import tictactoe.strategy.winningstrategy.WinningStrategy;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy>winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies)
    {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    // Who is making the move + validate cell + checkWinner
    public void makeMove()
    {
        Player currentPlayer = players.get(nextPlayerIndex);
        char sym = currentPlayer.getSymbol().getSymbol();
        System.out.println(currentPlayer.getName() + " is making a move with symbol " + sym);

        // Player has validated and made the move
        // Set that cell with the corresponding symbol and player
        Move move = null;
        try {
            move = currentPlayer.makeMove(board);
        } catch (InvalidMoveException e) {
            e.printStackTrace();
        }
        
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = board.getBoard().get(row).get(col);

        cell.setCellState(CellState.FILLED);
        cell.setPlayer(currentPlayer);
        System.out.println(cell.getCellState() + " "+ cell.getPlayer().getSymbol().getSymbol());
        // Turn for next player
        nextPlayerIndex = (nextPlayerIndex+1)%players.size();
        // set the final move
        Move finalMove = new Move(currentPlayer, cell);
        moves.add(finalMove);
        

        if(checkWinner(board , finalMove))
        {
            winner = currentPlayer;
            gameState = GameState.COMPLETED;
        }
        else if(moves.size() == (board.getDimension() * board.getDimension()))
        {
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move finalMove){

        for(WinningStrategy winningStrategy : winningStrategies)
        {
            if(winningStrategy.checkWinner(finalMove, board))
            return true;
        }
        return false;
    }

    public void printBoard()
    {
        this.board.printBoard();
    }

    // Getter and Setter Methods:
    public Board getBoard()
    {
        return board;
    }
    public void setBoard(Board board)
    {
        this.board = board;
    }

    public List<Player> getPlayers()
    {
        return players;
    }
    public void setPlayers(List<Player> players)
    {
        this.players = players;
    }

    public List<Move> getMove()
    {
        return moves;
    }
    public void setMoves(List<Move> moves)
    {
        this.moves = moves;
    }
    
    public GameState getGameState()
    {
        return gameState;
    }
    public void setGameState(GameState gameState)
    {
        this.gameState = gameState;
    }
    public Player getWinner()
    {
        return winner;
    }
    public void setWinner(Player winner)
    {
        this.winner = winner;
    }

    public int getNextPlayerIndex()
    {
        return nextPlayerIndex;
    }
    public void setNextPlayerIndex(int nextPlayerIndex)
    {
     this.nextPlayerIndex = nextPlayerIndex;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
   // End of all getter - setter methods //
    
   // Builder class for game
   public static class Builder{

    private int dimension;
    private List<Player> players;

    // Getter-Setter inside builder class.
    public int getDimension()
    {
        return dimension;
    }

    public Builder setDimension(int dimension)
    {
        this.dimension = dimension;
        return this;
    }

    public List<Player> getPlayers(){
        return players;
    }

    public Builder setPlayers(List<Player> players)
    {
        this.players = players;
        return this;
    }

    // Validation:
    public void validatePlayersCount(){
        //TODO
    }
    public void validateSymbols(){
        //TODO
    }
    public void validateBotCount(){
       //TODO
    }
    public void validateGame(){
        validatePlayersCount();
        validateSymbols();
        validateBotCount();
    }
    public  Game build(){
        //Validate:
        validateGame();

        List<WinningStrategy>winnerStrategies = new ArrayList<>();
        winnerStrategies.add(new RowWinningStrategy());
        winnerStrategies.add(new ColWinningStrategy());
        winnerStrategies.add(new DiagonalWinningStrategy());

        return new Game(
            dimension , players, winnerStrategies
        );
    }


   }
     

}
