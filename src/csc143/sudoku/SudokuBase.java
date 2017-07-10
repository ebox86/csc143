package csc143.sudoku;

/**
 * SudokuBase - abstract class that contains the basic methods 
 * for what the Sudoku board can do
 * @author Evan Kohout
 * @version Assignment 2: Sudoku Board
 */
public abstract class SudokuBase extends java.util.Observable {
    
	// the rows of the sukoku board
    private final int rows;
    // the columns of the sudoku board
    private final int columns;
    // the size of the board in terms of number of regions
    private final int size;
    
    /**
     * State -- public enumeration for returning various states of the board
     *
     */
    public enum State {COMPLETE, INCOMPLETE, ERROR};

    /**
     * SudokuBase -- constructs a new SudokuBase object
     * @param layoutRows -- number of rows for the game board
     * @param layoutColumns -- number of columns for the game board
     */
    public SudokuBase(int layoutRows, int layoutColumns) {
        rows = layoutRows;
        columns = layoutColumns;
        size = columns * rows;
    }
    
    /**
     * getRows -- getter method used to return the number of rows in the game board
     * @return -- number of rows
     */
    public int getRows() {
        return rows;
    }
    
    /**
     * getColumns -- getter method used to return the number of columns in the game board
     * @return -- number of columns
     */
    public int getColumns() {
        return columns;
    }
    
    /**
     * getSize -- getter method used to return the size of the game board
     * @return -- an integer value of the size of the game board
     */
    public int getSize() {
        return size;
    }
    
    public abstract int getValue(int row, int col);
    
    /**
     * setValue -- setter method used to assign value to a particular cell
     * @param row -- the row of the cell to be assigned a value
     * @param col -- the column of the cell to be assigned a value
     * @param value -- the value to be assigned
     */
    public abstract void setValue(int row, int col, int value);
    
    /**
     * isGiven -- checks to see whether a certain cell on the board is a given value or not
     * @param row -- the row of the cell to be checked
     * @param col -- the column of the cell to be checked
     * @return -- boolean
     */
    public abstract boolean isGiven(int row, int col);
    
    
    public abstract void fixGivens();
    
    /**
     * getRowState -- the current state of a given row n
     * @param n
     * @return State -- the current state of the row n
     */
    public abstract State getRowState(int n);
    
    /**
     * getColumnState -- the current state of a given column n
     * @param n
     * @return State --  the current state of the column n
     */
    public abstract State getColumnState(int n);
    
    /**
     * getRegionState -- the current state of a given region n
     * @param n
     * @return State -- the current state of the region n
     */
    public abstract State getRegionState(int n);
    
}