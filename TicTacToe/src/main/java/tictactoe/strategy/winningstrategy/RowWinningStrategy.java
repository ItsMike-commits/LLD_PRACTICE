package tictactoe.strategy.winningstrategy;

import java.util.HashMap;
import java.util.Map;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class RowWinningStrategy implements WinningStrategy{
    private Map<Integer,Map<Symbol,Integer>> rowMaps = new HashMap<>();
    
    @Override
    public boolean checkWinner( Move move ,Board board)
    {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        // First time entry in the row.
        if(!rowMaps.containsKey(row)){
            rowMaps.put(row, new HashMap<>());
        }

        //Get the row if it is existing already.
        Map<Symbol,Integer> currentRowMap = rowMaps.get(row);

        // Check whether the symbol is present in the map or not.
        if(!currentRowMap.containsKey(symbol))
        {
            currentRowMap.put(symbol , 0);
        }

        currentRowMap.put(symbol, currentRowMap.get(symbol)+1);
        
        // If the count of symbol = dimension, player wins
        return (currentRowMap.get(symbol) == board.getDimension());
         


        
    }

}
