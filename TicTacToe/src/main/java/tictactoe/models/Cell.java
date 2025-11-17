package tictactoe.models;

public class Cell {
    private int i;
    private int j;
    private CellState cellState;
    private Player player;

    public Cell(int i, int j)
    {
        this.i = i;
        this.j = j;
        this.cellState = CellState.EMPTY;
    }

    public int getRow()
    {
        return i;
    }

    public void setRow(int i)
    {
        this.i = i;
    }

    public int getCol()
    {
        return j;
    }

    public void setCol(int j)
    {
        this.j = j;
    }

    public CellState getCellState()
    {
        return cellState;
    }

    public void setCellState(CellState cellState)
    {
        this.cellState = cellState;
    }

    public boolean isEmpty()
    {
        return (this.cellState == CellState.EMPTY);
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }


}
