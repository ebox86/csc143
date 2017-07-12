package csc143.sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * Sudoku Board -- creates and displays a graphical sudoku board
 * @author Evan Kohout
 * @version Assignment 2: Sudoku Board
 */
public class SudokuBoard extends javax.swing.JPanel {
    
	// ~~ fields ~~ //
	
	SudokuBase b;
	private final int cols;
	private final int rows;
	private final int cellSize = 50;
	private final int cellPadding = 2;
	
	// ~~ constructor ~~ //
	
	/**
	 * SudokuBoard -- constructs the sudokuBoard object
	 * @param b -- the sudoku base object
	 */
    public SudokuBoard(SudokuBase b) {
    	cols = b.getColumns();
    	rows = b.getRows();
    	this.b = b;
    }
    
    // ~~ methods ~~ //
    
    /**
     * getBase -- implements abstract class getBase from SudokuBase
     * @return b -- the board
     */
    SudokuBase getBase() {
    	return this.b;
    }
    
    /**
     * paintComponent -- overrides JPanel's paintComponent method and 
     * displays graphical components to the frame
     */
    public void paintComponent(Graphics g){
    	super.paintComponent(g);
		int xVal = 1;
		int yVal = 1;
		int colorCount = 0;
		
		// sets the default transparent background to Color.white
		g.setColor(Color.white);
		g.fillRect(0, 0, (cellSize) * (cols * rows) + cellPadding, (cellSize) * (cols * rows) + cellPadding);
		
		// creates array which includes the index values of which
		// regions get filled gray
		int tempCount = 1;
		List<Integer> grayCells = new ArrayList<Integer>();
		grayCells.add(1);
		for(int a = 1; a <= rows * cols; a++){
			if(a % 2 != 0) grayCells.add(tempCount += 1);
			else grayCells.add(tempCount += 3);
		}
		
		// loops through each 'region' on the board and draws a new region
		for(int i = 0; i < cols; i++){
    		for(int j = 0; j < rows; j++){
    			
    			// if there are an even number of columns, perform special check against colorCount list --
    			// the purpose of this check is to see whether the current region of game board should
    			// have a gray background or not.
    			if(rows % 2 == 0){
    				if(grayCells.contains(colorCount)){
    					drawRegion(g, xVal, yVal, Color.decode("#DCDCDC"));
    				} else {
    					drawRegion(g, xVal, yVal, Color.white);
    				}
    			} else if(colorCount % 2 != 0){
    				drawRegion(g, xVal, yVal, Color.decode("#DCDCDC"));
    			} else { 
    				drawRegion(g, xVal, yVal, Color.white);
    			}
    			xVal += (cellSize) * cols;
    			colorCount++;
    		}
    		xVal = cellPadding - 1;
			yVal += (cellSize) * rows;
    	}
    	// draws outer most black border
    	g.setColor(Color.black);
    	g.drawRect(0, 0, (cellSize) * (cols * rows) + cellPadding + 1, (cellSize) * (cols * rows) + cellPadding + 1);
    }
    

    /*
     * creates a new 'region' on the sudoku board
     */
    private void drawRegion(Graphics g, int xVar, int yVar, Color c){
    	g.setColor(c);
		g.fillRect(xVar + 1, yVar + 1, cellSize * cols, cellSize * rows);
    	for(int k = 0; k < rows; k++){
			for(int l = 0; l < cols; l++){
				drawCell(g, (l * cellSize) + xVar + 1, (k * cellSize) + yVar + 1, cellSize - 3);
			}
		}
    }
    
    /*
     * creates a new cell within a region of the sudoku board
     * offset by 1 pixel in both x and y axis so to create the 
     * 1 px border with the region background color
     */
    private void drawCell(Graphics g, int x, int y, int side){
    	g.setColor(Color.black);
    	g.drawRect(x + 1, y + 1, side, side);
    }
    
    /*
     * resizes the frame to the appropriate height and width per the board size
     */
    @Override
    public Dimension getPreferredSize() {
       return new Dimension(b.getColumns() * b.getRows() * cellSize + 4, b.getRows() * b.getColumns() * cellSize + 4);
    }
    
    
    /*
     * Test application method which tests the frame and creates a 2x3 sudoku board
     */
    public static void main(String[] args) {
        javax.swing.JFrame win = new javax.swing.JFrame("Test 2x3");
        win.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        win.add(new SudokuBoard(new SudokuStub(5, 3)));
        win.pack();
        win.setVisible(true);
    }
    
}