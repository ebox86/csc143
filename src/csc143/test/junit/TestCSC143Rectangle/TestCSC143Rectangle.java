package csc143.test.junit.TestCSC143Rectangle;

/*
 * Evan Kohout
 * LA6: Junit
 */

import org.junit.*;

import csc143.junit.CSC143Rectangle;
import static org.junit.Assert.*;

public class TestCSC143Rectangle {

	private CSC143Rectangle rect1, rect2, rect3, rect4;

	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testRectangle1(){
		Assert.assertEquals("rect1(10)", 10, rect1.getHeight());
	}
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testRectangle2(){
		Assert.assertEquals("rect1(10)", 10, rect1.getWidth());
	}
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testRectangle3(){
		Assert.assertEquals("rect1(10)", 100.0, rect1.getArea(), 0);
	}
	
	/*
	 * Test fail with parameter out of bounds
	 */
	@org.junit.Test(expected=IllegalArgumentException.class)
	public void testRectangle4(){
		rect4 = new CSC143Rectangle(1001, 1001);
	}
	
	/*
	 * Test pass with boundary parameter
	 */
	@org.junit.Test()
	public void testCircle5(){
		Assert.assertEquals("rect2(1000)", 1000, rect2.getHeight());
	}
	
	@org.junit.Before
	public void setup() {
		rect1 = new CSC143Rectangle(10, 10);
		rect2 = new CSC143Rectangle(1000, 1000);
	}
	
}
