package csc143.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TTT {

	private static int winX = 400;
	private static int winY = 300;
	
	/**
	 * The driver the Tick Tack Toe board with three X2 instances and three O2
	 * instances and places them on the board.
	 * 
	 * @param args
	 *            The command-line arguments, ignored
	 */
	public static void main(String[] args) {

		// setup the window
		JFrame win = new JFrame("Test Component");
		win.setSize(winX, winY);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
		TTTBoard board = new TTTBoard(winX, winY);

		X2 x = new X2();
		x.setLineColor(java.awt.Color.blue);
		
		O2 o = new O2();
		o.setLineColor(java.awt.Color.red);
		o.setFillColor(java.awt.Color.yellow);
		
		win.add(x);
		win.add(o);
		win.add(x);
		win.add(o);
		win.add(x);
		win.add(new P2());
		win.add(o);
		win.add(new P2());
		win.add(x);
		
		// change the layout
		win.setLayout(new GridLayout(3, 3, 20, 20));
		
		// show the window
		win.setVisible(true);

		// force the new layout manager to work
		win.validate();
	}


}