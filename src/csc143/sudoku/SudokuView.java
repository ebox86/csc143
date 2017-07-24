package csc143.sudoku;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import csc143.test.sudoku.SymbolRendererTest;

/**
 * 
 * @author Evan Kohout
 * @version Assignment 4: Sudoku View
 */
public class SudokuView extends SudokuBoard {
	
	/**
	 * constructs the SudokuView object
	 * @param b
	 */
	public SudokuView(SudokuBase b) {
		super(b);
	}

	public void setSelected(int i, int j) {
	}

}
/*
 * private class which defines graphical icons for values 1 - 12
 * ~~ 
 * Uses Roman numerals as icons
 */
class PrimarySymbols implements SymbolRenderer {

	// sets cell size for icons
	private int size = 40;
	
	/**
	 * drawSymbol -- creates a symbol on the board at the specified location, values 1 - 12
	 * @param g -- Graphics
	 * @param x -- x coordinate for placement
	 * @param y -- y coordinate for placement
	 * @param value -- a int value either 1 - 12, inclusive 
	 */
	@Override
	public void drawSymbol(Graphics g, int x, int y, int value) {
		Graphics2D g2 = (Graphics2D) g;
		int thickness = 5;
		g2.setStroke(new BasicStroke(thickness));
		if(value == 1){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical line
			g2.drawLine(x + size/2, y + size - thickness/2, x + size/2, y + thickness/2);
			return;
		} else if (value == 2){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical lines
			g2.drawLine(x + size/3, y + size - thickness/2, x + size/3, y + thickness/2);
			g2.drawLine(x + (size/3) * 2, y + size - thickness/2, x + (size/3) * 2, y + thickness/2);
			return;
		} else if (value == 3){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical lines
			g2.drawLine(x + size/4, y + size - thickness/2, x + size/4, y + thickness/2);
			g2.drawLine(x + (size/4) * 2, y + size - thickness/2, x + (size/4) * 2, y + thickness/2);
			g2.drawLine(x + (size/4) * 3, y + size - thickness/2, x + (size/4) * 3, y + thickness/2);
			return;
		} else if (value == 4){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical line
			g2.drawLine(x + size/4, y + size - thickness/2, x + size/4, y + thickness/2);
			// V shape
			g2.drawLine(x + size/2 + thickness, y + size - thickness/2, x + size/4 + thickness, y + thickness/2);
			g2.drawLine(x + size/2 + thickness, y + size - thickness/2, x + (size/4) * 3 + thickness, y + thickness/2);
			return;
		} else if (value == 5) {
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// V shape
			g2.drawLine(x + size/2, y + size - thickness/2, x + size/4, y + thickness/2);
			g2.drawLine(x + size/2, y + size - thickness/2, x + (size/4) * 3, y + thickness/2);
			return;
		} else if (value == 6){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical line 
			g2.drawLine(x + (size/4) * 3, y + size - thickness/2, x + (size/4) * 3, y + thickness/2);
			// V shape
			g2.drawLine(x + size/2 - thickness, y + size - thickness/2, x + size/4 - thickness, y + thickness/2);
			g2.drawLine(x + size/2 - thickness, y + size - thickness/2, x + (size/4) * 3 - thickness, y + thickness/2);
			return;
		} else if (value == 7){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// V shape
			g2.drawLine(x + (size/4) * 3 - (thickness), y + size - thickness/2, x + (size/4) * 3 - (thickness), y + thickness/2);
			// vertical lines
			g2.drawLine(x + (size/4) * 3 + thickness, y + size - thickness/2, x + (size/4) * 3 + thickness, y + thickness/2);
			g2.drawLine(x + size/2 - thickness * 2, y + size - thickness/2, x + size/4 - thickness * 2, y + thickness/2);
			g2.drawLine(x + size/2 - thickness * 2, y + size - thickness/2, x + (size/4) * 3 - thickness * 2, y + thickness/2);
			return;
		} else if (value == 8){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical lines
			g2.drawLine(x + (size/4) * 3 - thickness, y + size - thickness/2, x + (size/4) * 3 - thickness, y + thickness/2);
			g2.drawLine(x + (size/4) * 3 + thickness/3, y + size - thickness/2, x + (size/4) * 3 + thickness/3, y + thickness/2);
			g2.drawLine(x + (size/4) * 3 + thickness + thickness/2, y + size - thickness/2, x + (size/4) * 3 + thickness + thickness/2, y + thickness/2);
			// V shape
			g2.drawLine(x + size/2 - thickness * 2, y + size - thickness/2, x + size/4 - thickness * 2, y + thickness/2);
			g2.drawLine(x + size/2 - thickness * 2, y + size - thickness/2, x + (size/4) * 3 - thickness * 2, y + thickness/2);
			return;
		} else if (value == 9){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical line
			g2.drawLine(x + size/4, y + size - thickness/2, x + size/4, y + thickness/2);
			// X shape
			g2.drawLine(x + (size/4) * 3 + thickness, y + size - thickness/2, x + size/4 + thickness, y + thickness/2);
			g2.drawLine( x + size/4 + thickness, y + size - thickness/2, x + (size/4) * 3 + thickness, y + thickness/2);
			return;
		} else if (value == 10) {
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// X shape
			g2.drawLine(x + (size/4) * 3, y + size - thickness/2, x + size/4, y + thickness/2);
			g2.drawLine(x + size/4, y + size - thickness/2, x + (size/4) * 3, y + thickness/2);
			return;
		} else if (value == 11){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical line
			g2.drawLine(x + (size/4) * 3, y + size - thickness/2, x + (size/4) * 3, y + thickness/2);
			// X shape
			g2.drawLine(x + (size/4) * 3 - thickness, y + size - thickness/2, x + size/4 - thickness, y + thickness/2);
			g2.drawLine(x + size/4 - thickness, y + size - thickness/2, x + (size/4) * 3 - thickness, y + thickness/2);
			return;
		} else if (value == 12){
			// upper and lower lines
			g2.drawLine(x + thickness/2, y + thickness/2, x + size - thickness/2, y + thickness/2);
			g2.drawLine(x + thickness/2, y + size - thickness/2, x + size - thickness/2, y + size - thickness/2);
			// vertical lines
			g2.drawLine(x + (size/4) * 3 - (thickness), y + size - thickness/2, x + (size/4) * 3 - (thickness), y + thickness/2);
			g2.drawLine(x + (size/4) * 3 + thickness, y + size - thickness/2, x + (size/4) * 3 + thickness, y + thickness/2);
			// X shape
			g2.drawLine(x + (size/4) * 3 - thickness * 2, y + size - thickness/2, x + size/4 - thickness * 2, y + thickness/2);
			g2.drawLine(x + size/4 - thickness * 2, y + size - thickness/2, x + (size/4) * 3 - thickness * 2, y + thickness/2);
			return;
		}
	}
	
	/*
	 * application method used to test symbol icons
	 */
	public static void main(String[] args) {
		new SymbolRendererTest().testSymbols(new PrimarySymbols());
	}

}