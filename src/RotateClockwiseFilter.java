
public class RotateClockwiseFilter implements Filter {

	@Override
	public void filter(PixelImage theImage) {
		
		// get the data from the image
		Pixel[][] data = theImage.getData();
		
		if(theImage.getHeight() != theImage.getWidth()) throw new IllegalStateException("Only square images can be rotated.");
		  
        int rowNum = data.length;
        int colNum = data[0].length;

        Pixel[][] temp = new Pixel[rowNum][colNum];
        for(int i =0; i<rowNum; i++){
            for(int j=0; j<colNum; j++){
                temp[i][j] = data[rowNum-j-1][i];
            }
        }
		// update the image with the moved pixels
		theImage.setData(temp);
	}

}
