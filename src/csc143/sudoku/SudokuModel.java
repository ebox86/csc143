package csc143.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import csc143.sudoku.SudokuCore;
/**
 * Model used to determine the state of rows, columns and regions on the sudoku board
 * @author Evan Kohout
 * @version csc143 - Homework 3: Sudoku Main
 *
 */
public class SudokuModel extends SudokuCore {
    
    public SudokuModel(int r, int c) {
        super(r, c);
    }
    
    /**
     * getRowState -- determines the state of a given row n
     * @return State -- the state of the row
     */
    public State getRowState(int n) { 
    	List check = new ArrayList();
        for(int i = 0; i < getSize(); i++){
        	if(getValue(n, i) != 0) check.add(getValue(n, i));
        }
    	return stateHelper(check);
    }
    
    /**
     * getColumnState -- determines the state of a given column n
     * @return State -- the state of the column
     */
    public State getColumnState(int n) { 
    	List check = new ArrayList();
        for(int i = 0; i < getSize(); i++){
        	if(getValue(i, n) != 0) check.add(getValue(i, n));
        }
    	return stateHelper(check);
    }
    
    /**
     * getRegionState -- determines the state of a given region n
     * @return State -- the state of the region
     */
    public State getRegionState(int n) { 

    	// incomplete
    	return State.ERROR;
        
    }
    
    /*
     * helper method used to determine the state after collecting a list of cell values
     */
    private State stateHelper(List l){
    	Set<Integer> set = new HashSet<Integer>(l);
        if(set.size() < l.size()){
            return State.ERROR;
        } else if(l.size() <= getSize()){
        	return State.INCOMPLETE;
        } else {
        	return State.COMPLETE;
        }
    }
}