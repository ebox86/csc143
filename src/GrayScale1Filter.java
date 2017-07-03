import java.awt.Color;

public class GrayScale1Filter implements Filter {

	@Override
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();

		for (int row = 0; row < theImage.getHeight(); row++) {
			for (int col = 0; col < theImage.getWidth(); col++) {
				int[] temp = data[row][col].rgb;
				temp[0] = (int) (temp[0] * 0.3);
				temp[1] = (int) (temp[1] * 0.59);
				temp[2] = (int) (temp[2] * 0.11);
				data[row][col].rgb = temp;
			}

		}
		// update the image with the moved pixels
		theImage.setData(data);

	}
}
