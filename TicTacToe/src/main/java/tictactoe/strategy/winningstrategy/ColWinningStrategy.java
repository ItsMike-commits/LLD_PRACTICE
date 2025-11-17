package tictactoe.strategy.winningstrategy;

import java.util.HashMap;
import java.util.Map;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class ColWinningStrategy implements WinningStrategy{

    private Map<Integer,Map<Symbol,Integer>> colMaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move , Board board)
    {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // Check whether col is existing or not, if not create it.
        if(!colMaps.containsKey(col))
        {
            colMaps.put(col,new HashMap<>());
        }
        // if it is already there, pull out the currentcolMap;
        Map<Symbol,Integer> currentColMap = colMaps.get(col);
         
        // if the symbol is not there, Initialise it with 0
        if(!currentColMap.containsKey(symbol))
        {
            currentColMap.put(symbol, 0);
        }
        //if the symbol is already there, increment its value by 1.
        currentColMap.put(symbol, currentColMap.get(symbol)+1);

        // If the count of symbol becomes equal to the dimesion, player wins.
        return (currentColMap.get(symbol) == board.getDimension());
    }
}
