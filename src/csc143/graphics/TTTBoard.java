package csc143.graphics;

import java.awt.Color;

class TTTBoard extends javax.swing.JComponent {

	private static Color lineColor;
	private static int winX, winY;
	
	public TTTBoard(int x, int y) {
        //setPreferredSize(new java.awt.Dimension(25, 25));
        setLineColor(java.awt.Color.black);
        this.winX = x;
        this.winY = y;
	}
	
    // ~~ getters / setters ~~ //
    
    public java.awt.Color getLineColor() {
      return lineColor;
    }
	
    public void setLineColor(java.awt.Color rgb) {
    	lineColor = rgb;
    	repaint();
    }
    	
	/**
	 * The necessary method. This method renders the lines on the board.
	 * 
	 * @param g
	 *            The Graphics object use to render
	 */
	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		g.setColor(java.awt.Color.black);
		// draw the horizontal lines
		g.drawLine(getWidth()/3, 0, getWidth()/3, getHeight());
		g.drawLine(getWidth()/3*2, 0, getWidth()/3*2, getHeight());
		// draw the vertical lines
		g.drawLine(0, getHeight()/3, getWidth(), getHeight()/3);
		g.drawLine(0, getHeight()/3*2, getWidth(), getHeight()/3*2);
	}

}
