package csc143.test.junit.TestCSC143Triangle;

/*
 * Evan Kohout
 * LA6: Junit
 */

import org.junit.*;
import csc143.junit.CSC143Triangle;
import static org.junit.Assert.*;

public class TestCSC143Triangle {

	private CSC143Triangle tri1, tri2, tri3, tri4;
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testTriangle1(){
		Assert.assertEquals("tri1(10)", 10, tri1.getHeight());
	}
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testTriangle2(){
		Assert.assertEquals("tri1(10)", 10, tri1.getBase());
	}
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testRectangle3(){
		Assert.assertEquals("tri1(10)", 50.0, tri1.getArea(), 0);
	}
	
	@org.junit.Before
	public void setup() {
		tri1 = new CSC143Triangle(10, 10);
	}
}
