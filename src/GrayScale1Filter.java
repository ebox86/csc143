import java.awt.Color;

public class GrayScale1Filter implements Filter {

	@Override
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		for (int row = 0; row < theImage.getHeight(); row++) {
			for (int col = 0; col < theImage.getWidth(); col++) {
				int[] temp = data[row][col].rgb;
				int grayValue = (int)(temp[0] * (30.0f/100.0f)) + (int)(temp[1] * (59.0f/100.0f)) + (int)(temp[2] * (11.0f/100.0f));
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
