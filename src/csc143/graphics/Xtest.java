package csc143.graphics;

public class Xtest {

	public static void main(String[] args){
		javax.swing.JFrame win;
		win = new javax.swing.JFrame("Test Component");
		win.add(new csc143.graphics.X2(), java.awt.BorderLayout.NORTH);
		win.add(new csc143.graphics.X2(), java.awt.BorderLayout.SOUTH);
		win.add(new csc143.graphics.X2(), java.awt.BorderLayout.EAST);
		win.add(new csc143.graphics.O2(), java.awt.BorderLayout.WEST);
		win.setSize(400, 300);
		win.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}

}
