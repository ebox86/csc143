
public class RotateCounterClockwiseFilter implements Filter {

	@Override
	public void filter(PixelImage theImage) {

		// get the data from the image
		Pixel[][] data = theImage.getData();
		
		if(theImage.getHeight() != theImage.getWidth()) throw new IllegalStateException("Only square images can be rotated.");
		
        Pixel[][] newArray = new Pixel[data[0].length][data.length];
        for (int i = 0; i < data[0].length; ++i) {
            for (int j = 0; j < data.length; ++j) {
            	newArray[i][j] = data[j][data[0].length - i - 1];
            }
        }
		// update the image with the moved pixels
		theImage.setData(newArray);
	}

}
