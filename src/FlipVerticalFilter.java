/**
 * Filter that flips the image vertically.
 * @author Evan Kohout
 * @version CSC143 - summer 2017
 *
 */
public class FlipVerticalFilter implements Filter {

	@Override
	public void filter(PixelImage theImage) {
        // get the data from the image
        Pixel[][] data = theImage.getData();
        
        int rows = data.length;
        Pixel[] temp;
        
        for(int i = 0; i < rows/2; i++){
        	temp = data[rows - i - 1];
        	data[rows - i - 1] = data[i];
        	data[i] = temp;
        }
        // update the image with the moved pixels
        theImage.setData(data);
		
	}

}
