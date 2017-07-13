/*
 * Evan Kohout
 * LA 5: Color Buttons
 * Minus
 */
package csc143.graphics;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 * ColorButtons -- displays window with buttons of different colors, clicking
 * them changes the color of the main pane
 * 
 * @author evankoh
 * @version LA5: Color Buttons
 */
public class ColorButtons {
	
	// ~~ fields ~~ //
	
	// the panel object
	private JPanel panel;
	// the background color -- used to store the changing bg colors
	private java.awt.Color bgColor;
	// the color array used to initialize the buttons
	private Color[] colors = { Color.red, Color.green, Color.blue, Color.cyan, Color.magenta, Color.yellow, Color.black,
			Color.white };

	/**
	 * Constructs a new ColorButton object 
	 */
	public ColorButtons() {
		// set up the window
		JFrame win = new JFrame("Color Buttons");
		// sets window size
		win.setSize(560, 420);
		win.setLocation(50, 50);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// sets initial bg color
		setColor(Color.lightGray);

		// set up the display area
		panel = new JPanel();
		setBG(panel);
		win.add(panel);

		// set up the toolbar
		JPanel tool = new JPanel();
		for (int i = 0; i < colors.length; i++) {
			ColorButton b = new ColorButton(colors[i], panel);
			setColor(b.getColor());
			tool.add(b);
		}

		// adds the toolbar with buttons to the NORTH cardinal position
		win.add(tool, BorderLayout.NORTH);
		win.setVisible(true);
	}
	
	// ~~ getters / setters ~~ //
	
	/**
	 * setBG -- sets the background color of the JPanel created in the constructor
	 * @param panel -- a JPanel object
	 */
	public void setBG(JPanel panel) {
		panel.setBackground(getColor());
	}

	/**
	 * setColor -- sets the color of the background
	 * @param c -- java.awt.Color object
	 */
	public void setColor(java.awt.Color c) {
		this.bgColor = c;
	}

	/**
	 * Returns the color currently set of the background
	 * @return bgColor -- java.awt.Color object
	 */
	public java.awt.Color getColor() {
		return this.bgColor;
	}
	
	// ~~ application methid ~~ //

	/**
	 * main application method for the ColorButton class
	 * @param args -- not used
	 */
	public static void main(String[] args) {
		new ColorButtons();
	}

	/**
	 * ColorButton -- helper class used to build the Buttons used in the toolbar
	 * @author Evan Kohout
	 */
	class ColorButton extends JPanel {
		// used to store the color of the button
		private java.awt.Color c;
		
		/**
		 * ColorButton -- constructs a new ColorButton object
		 * @param c - java.awt.Color object
		 * @param panel - JPanel object needed for mouseClickListener
		 */
		public ColorButton(Color c, JPanel panel) {
			setBackground(c);
			setPreferredSize(new Dimension(50, 50));
			this.c = c;

			// adds mouse listener to the button
			addMouseListener(new MouseAdapter() {
				
				/**
				 * used to determine what happens on mouse click
				 */
				@Override
				public void mousePressed(MouseEvent e) {
					repaint();
				}

				/**
				 * used to determine what happens on mouse release
				 */
				@Override
				public void mouseReleased(MouseEvent e) {
					setColor(c);
					setBG(panel);
					repaint();
				}
			});
		}
		
		/**
		 * Returns the color of the button
		 * @return c -- java.awt.Color object
		 */
		public java.awt.Color getColor() {
			return c;
		}
	}
}
