package csc143.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import csc143.sudoku.SudokuBase.State;
import csc143.sudoku.SudokuCore;

public class SudokuModel extends SudokuCore {
    
    public SudokuModel(int r, int c) {
        super(r, c);
    }
    
    public State getRowState(int n) { 
    	List check = new ArrayList();
        for(int i = 0; i < getSize(); i++){
        	if(getValue(n, i) != 0) check.add(getValue(n, i));
        }
        Set<Integer> set = new HashSet<Integer>(check);
    	
        if(set.size() < check.size()){
            return State.ERROR;
        } else if(check.size() <= getSize()){
        	return State.INCOMPLETE;
        } else {
        	return State.COMPLETE;
        }
    }
    
    public State getColumnState(int n) { 
    	List check = new ArrayList();
        for(int i = 0; i < getSize(); i++){
        	if(getValue(i, n) != 0) check.add(getValue(i, n));
        }
        Set<Integer> set = new HashSet<Integer>(check);
    	
        if(set.size() < check.size()){
            return State.ERROR;
        } else if(check.size() <= getSize()){
        	return State.INCOMPLETE;
        } else {
        	return State.COMPLETE;
        }
    }
    
    public State getRegionState(int n) { 
    	List check = new ArrayList();
		int j, k = 0;
    	for(int i = 0; i <= n; i++, j += getColumns(), k += getRows()){
    		check.clear();
    		for(j = 0; j < getRows(); j++){
    			for(k = 0; k < getColumns(); k++){
    				if(getValue(k, j) != 0) check.add(getValue(k, j));
    			}
    		}
    	}
    	Set<Integer> set = new HashSet<Integer>(check);
    	for(Object o : check) System.out.println(o);
        if(set.size() < check.size()){
            return State.ERROR;
        } else if(check.size() <= getSize()){
        	return State.INCOMPLETE;
        } else {
        	return State.COMPLETE;
        }
        
    }
    
}