
/*
 * Evan Kohout
 * Assignment 1: SnapShop
 * Minimum
 * GrayScale1Filter - adds grayscale filter using alg1 of the assignment guidelines
 */

import java.awt.Color;

/**
 * GrayScale1Filter - adds a grayscale filter using an algorithm which reduces
 * red to 30%, green to 59% and blue to 11%
 * 
 * @author evankoh
 * @version CSC143 - summer 2017
 */
public class GrayScale1Filter implements Filter {

	/**
	 * filter -- overrode method from Filter interface
	 */
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		// go through each pixel value from the 2d array and convert its rgb
		// value to a gray value, then assign the gray value back to the pixel
		for (int row = 0; row < theImage.getHeight(); row++) {
			for (int col = 0; col < theImage.getWidth(); col++) {
				int[] temp = data[row][col].rgb;
				// gray value based on the pixel color which reduces red to 30%,
				// green to 59% and blue to 11%
				int grayValue = (int) (temp[0] * (30.0f / 100.0f)) + (int) (temp[1] * (59.0f / 100.0f))
						+ (int) (temp[2] * (11.0f / 100.0f));
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
