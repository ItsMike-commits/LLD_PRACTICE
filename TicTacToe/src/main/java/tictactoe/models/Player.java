package tictactoe.models;

import java.awt.Dimension;
import java.util.Scanner;

import tictactoe.exceptions.InvalidMoveException;

public class Player {

    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner;
    

    public Player(String name, Symbol symbol)
    {
        this.name = name;
        this.symbol = symbol;
        this.playerType = PlayerType.HUMAN;
        scanner = new Scanner(System.in);
    }

    private boolean validateMove(Board board ,int row , int col)
    {
        int dimension = board.getDimension();
        if(row <0 || row>=dimension || col<0 || col>=dimension)
        {
          return false;
        }
        return (board.getBoard().get(row).get(col).isEmpty());
    }


    public Move makeMove(Board board)throws InvalidMoveException
    {
        // It is responsibility of the player to make a move.
        System.out.println("Please enter the row ");
        int row = scanner.nextInt();

        System.out.println("Please enter the column ");
        int col = scanner.nextInt();
        
        

        if(!validateMove(board, row,col))
        {
            throw new InvalidMoveException("Invalid Move. Try another cell");
        }


        return new Move(this , new Cell(row, col));
    }





    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Symbol getSymbol()
    {
        return symbol;
    }
    public void setSymbol(Symbol symbol)
    {
        this.symbol = symbol;
    }
    public PlayerType getPlayerType()
    {
        return playerType;
    }
    public void setPlayerType(PlayerType  playerType)
    {
        this.playerType = playerType;
    }


}
