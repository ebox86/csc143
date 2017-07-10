package csc143.sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class SudokuBoard extends javax.swing.JPanel {
    
	SudokuBase b;
	int cols;
	int rows;
	int cellSize = 50;
	int cellPadding = 1;
	
    public SudokuBoard(SudokuBase b) {
    	cols = b.getColumns();
    	rows = b.getRows();
    	this.b = b;
    }
    
    
    SudokuBase getBase() {
    	return this.b;
    }
    
    public void paintComponent(Graphics g){
    	super.paintComponent(g);
    	g.setColor(Color.black);
    	g.drawRect(0, 0, (cellSize) * (cols * rows) - cellPadding, (cellSize) * (cols * rows) - cellPadding);
		int xVal = cellPadding;
		int yVal = cellPadding;
		int colorCount = 0;
		
		// creates array which includes the index values of which 
		// regions get filled gray
		int tempCount = 1;
		List grayCells = new ArrayList();
		grayCells.add(1);
		for(int a = 1; a <= rows * cols; a++){
			if(a % 2 != 0){
				tempCount += 1;
				grayCells.add(tempCount);
			} else {
				tempCount += 3;
				grayCells.add(tempCount);
			}
		}
		
		
		for(int n = 0; n < grayCells.size(); n++){
			System.out.println(grayCells.get(n));
		}
		for(int i = 0; i < cols; i++){
    		for(int j = 0; j < rows; j++){
    			System.out.println("region " + colorCount);
    			
    			// if there are an even number of columns, perform special check against colorCount list --
    			// the purpose of this check is to see whether the current region of game board should
    			// have a gray background or not.
    			if(rows % 2 == 0){
    				if(grayCells.contains(colorCount)){
    					drawRegion(g, j, i, xVal, yVal, Color.decode("#DCDCDC"));
    				} else {
    					drawRegion(g, j, i, xVal, yVal, Color.white);
    				}
    			} else if(colorCount % 2 != 0){
    				drawRegion(g, j, i, xVal, yVal, Color.decode("#DCDCDC"));
    			} else { 
    				drawRegion(g, j, i, xVal, yVal, Color.white);
    			}
    			xVal += (cellSize) * cols;
    			colorCount++;
    		}
    		xVal = cellPadding;
			yVal += (cellSize) * rows;
    	}
    }
    

    private void drawRegion(Graphics g, int colVal, int rowVal, int xVar, int yVar, Color c){
    	g.setColor(c);
		g.fillRect(xVar, yVar, cellSize * cols, cellSize * rows);
		g.setColor(Color.black);
    	for(int k = 0; k < rows; k++){
			for(int l = 0; l < cols; l++){
				g.drawRect(l * cellSize + xVar + cellPadding, k * cellSize + yVar + cellPadding, cellSize, cellSize);
			}
		}
    }
    
    @Override
    public Dimension getPreferredSize() {
       return new Dimension(b.getColumns() * b.getRows() * cellSize + cellPadding, b.getRows() * b.getColumns() * cellSize + cellPadding);
    }
    
    public static void main(String[] args) {
        javax.swing.JFrame win = new javax.swing.JFrame("Test 2x3");
        win.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        win.add(new SudokuBoard(new SudokuStub(2, 3)));
        win.pack();
        win.setVisible(true);
    }
    
}