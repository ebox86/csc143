/*
 * Evan Kohout
 * Assignment 1: SnapShop
 * Minimum
 * FlipVerticalFilter - adds vertical flip filter
 */

/**
 * FlipVerticalFilter - add a filter that flips the image vertically.
 * @author Evan Kohout
 * @version CSC143 - summer 2017
 *
 */
public class FlipVerticalFilter implements Filter {

	/**
	 * filter -- overrode method from Filter interface
	 */
	public void filter(PixelImage theImage) {
        // get the data from the image
        Pixel[][] data = theImage.getData();
        
        int rows = data.length;
        
        // buffer array for pixel manipulation
        Pixel[] temp;
        
        // goes through each row and flips pixel data, creating a vertical flip effect
        for(int i = 0; i < rows/2; i++){
        	temp = data[rows - i - 1];
        	data[rows - i - 1] = data[i];
        	data[i] = temp;
        }
        // update the image with the moved pixels
        theImage.setData(data);
		
	}

}
