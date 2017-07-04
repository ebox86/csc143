/*
 * Evan Kohout
 * Assignment 1: SnapShop
 * Minimum
 * RotateClockwiseFilter - rotates 2d pixel array clockwise to the right
 */

/**
 * RotateClockwiseFilter - rotates 2d pixel array clockwise to the right
 * @author evankoh
 * @version CSC143 - summer 2017
 */
public class RotateClockwiseFilter implements Filter {

	/**
	 * filter -- overrode method from Filter interface
	 */
	public void filter(PixelImage theImage) {
		
		// get the data from the image
		Pixel[][] data = theImage.getData();
		
		// checks if image is a square or not, if not, throw
		// IllegalStateException
		if(theImage.getHeight() != theImage.getWidth()) throw new IllegalStateException("Only square images can be rotated.");
		  
		// values for row and column traversal
        int rowNum = data.length;
        int colNum = data[0].length;

        // buffer array for storing new positions of pixels
        Pixel[][] temp = new Pixel[rowNum][colNum];
        
        // goes through each pixel in the 2d array and moves it to the buffer array in a clockwise direction
        for(int i =0; i<rowNum; i++){
            for(int j=0; j<colNum; j++){
                temp[i][j] = data[rowNum-j-1][i];
            }
        }
		// update the image with the moved pixels
		theImage.setData(temp);
	}

}
