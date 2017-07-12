package csc143.graphics;

class P2 extends javax.swing.JComponent {

    
    /**
     * Constructor, sets the preferred size.
     */
    public P2() {
        setPreferredSize(new java.awt.Dimension(25, 25));
    }
    
    /**
     * The necessary method. This method renders the component.
     * 
     * @param g The Graphics object use to render
     */
    @Override
    public void paintComponent(java.awt.Graphics g) {
    	  super.paintComponent(g);
    	  g.setColor(java.awt.Color.white);
      	  g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    	}

}
