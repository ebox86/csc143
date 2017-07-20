package csc143.test.junit.TestCSC143Circle;

/*
 * Evan Kohout
 * LA6: Junit
 */

import org.junit.*;
import csc143.junit.CSC143Circle;
import static org.junit.Assert.*;

public class TestCSC143Circle {

	private CSC143Circle circ1, circ2, circ3, circ4, circ5;
	
	/*
	 * Test pass with constuctor parameter 10
	 */
	@org.junit.Test 
	public void testCircle1(){
		Assert.assertEquals("circ1(10)", 10, circ1.getDiameter());
	}
	
	/*
	 * Test pass with constructor parameter 100, area of ~7853
	 */
	@org.junit.Test 
	public void testCircle2(){
		Assert.assertEquals("circ2(100)", 7853.981633974483, circ2.getArea(), 0);
	}
	
	/*
	 * Test pass with constructor parameter 500
	 */
	@org.junit.Test 
	public void testCircle3(){
		Assert.assertEquals("circ(500)", 500, circ3.getDiameter());
	}
	
	/*
	 * Test fail with parameter out of bounds
	 */
	@org.junit.Test(expected=IllegalArgumentException.class)
	public void testCircle4(){
		circ4 = new CSC143Circle(1001);
	}
	
	/*
	 * Test pass with boundary parameter
	 */
	@org.junit.Test()
	public void testCircle5(){
		circ5 = new CSC143Circle(1000);
		Assert.assertEquals("circ(1000", 1000, circ5.getDiameter());
	}
		
	@org.junit.Before
	public void setup() {
		circ1 = new CSC143Circle(10);
		circ2 = new CSC143Circle(100);
		circ3 = new CSC143Circle(500);
	}
}
