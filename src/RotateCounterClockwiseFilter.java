/*
 * Evan Kohout
 * Assignment 1: SnapShop
 * Minimum
 * RotateCounterClockwiseFilter - rotates 2d pixel array counterclockwise to the left
 */

/**
 * RotateCounterClockwiseFilter - rotates 2d pixel array counterclockwise to the
 * left
 * 
 * @author evankoh
 * @version CSC143 - summer 2017
 */
public class RotateCounterClockwiseFilter implements Filter {

	/**
	 * filter -- overrode method from Filter interface
	 */
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		// checks if image is a square or not, if not, throw
		// IllegalStateException
		if (theImage.getHeight() != theImage.getWidth())
			throw new IllegalStateException("Only square images can be rotated.");

		// buffer array
		Pixel[][] newArray = new Pixel[data[0].length][data.length];

		// goes through each pixel and moves it to buffer array in a
		// counterclockwise position
		for (int i = 0; i < data[0].length; ++i) {
			for (int j = 0; j < data.length; ++j) {
				newArray[i][j] = data[j][data[0].length - i - 1];
			}
		}
		// update the image with the moved pixels
		theImage.setData(newArray);
	}

}
