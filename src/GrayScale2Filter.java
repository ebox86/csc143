
public class GrayScale2Filter implements Filter {

	@Override
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		for (int row = 0; row < theImage.getHeight(); row++) {
			for (int col = 0; col < theImage.getWidth(); col++) {
				int[] temp = data[row][col].rgb;
				Pixel curPix = data[row][col];
				int grayValue = (11 * curPix.RED + 16 * curPix.GREEN + 5 * curPix.BLUE) / 32;
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
