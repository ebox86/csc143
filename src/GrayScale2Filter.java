/*
 * Evan Kohout
 * Assignment 1: SnapShop
 * Minimum
 * GrayScale2Filter - adds grayscale filter using alg2 of the assignment guidelines
 */

/**
 * GrayScale2Filter - adds a grayscale filter using an algorithm which sets the
 * gray value to 11/32 of red, 16/32 of green and 5/32 of blue.
 * 
 * @author Evan Kohout
 * @version CSC143 - summer 2017
 */
public class GrayScale2Filter implements Filter {

	/**
	 * filter -- overrode method from Filter interface
	 */
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		// go through each pixel and convert its rgb value to a gray value, then
		// assign the gray value to the pixel
		for (int row = 0; row < theImage.getHeight(); row++) {
			for (int col = 0; col < theImage.getWidth(); col++) {
				int[] temp = data[row][col].rgb;
				// gray value which sets pixel color to 11/32 of red, 16/32 of
				// green and 5/32 of blue.
				int grayValue = (11 * temp[0] + 16 * temp[1] + 5 * temp[2]) / 32;
				// red value
				temp[0] = grayValue;
				// green value
				temp[1] = grayValue;
				// blue value
				temp[2] = grayValue;
				data[row][col].rgb = temp;
			}
		}
		// update the image with the moved pixels
		theImage.setData(data);

	}
}
