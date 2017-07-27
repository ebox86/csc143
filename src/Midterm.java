import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Midterm extends JPanel {

    private javax.swing.JFrame win;
    private java.awt.Container c;
    private javax.swing.JButton b1, b2;
    
	public static void main(String[] args){
		Midterm m = new Midterm();
	}
	
	public Midterm(){
        win = new javax.swing.JFrame("Sample Layouts");
        c = win.getContentPane();
        c.setLayout(new java.awt.GridLayout(1, 3));
        Font f = new Font("Dialog", Font.BOLD, 36);
        Graphics2D g2 = new (Graphics2D)g;
        b1 = new javax.swing.JButton("up");
        b2 = new javax.swing.JButton("dn");
        c.add(b1, BorderLayout.WEST);
        c.add(b2, BorderLayout.EAST);
        win.setSize(200, 150);
        win.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        win.setVisible(true);
        win.toFront();
	}
	

}
