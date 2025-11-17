package tictactoe.strategy.winningstrategy;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.util.ElementScanner14;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class DiagonalWinningStrategy implements WinningStrategy {

    private Map<Symbol,Integer> leftDiagonalMap = new HashMap<>();
    private Map<Symbol,Integer> rightDiagonalMap = new HashMap<>();
    
    @Override
    public boolean checkWinner(Move move , Board board)
    {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col)
        {
            if(!leftDiagonalMap.containsKey(symbol))
            {
                leftDiagonalMap.put(symbol, 0);
            }
            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol)+1);
            if(leftDiagonalMap.get(symbol) == board.getDimension())
            return true;
        }
        if (row + col == board.getDimension() - 1) { // right diagonal
            if (!rightDiagonalMap.containsKey(symbol)) {
                rightDiagonalMap.put(symbol, 0);
            }
            rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);

            if(rightDiagonalMap.get(symbol) == board.getDimension())
            return true;
        }

        return false;
    }

}
