package TDDminiCalculatorJunitTestCases;

import static org.junit.Assert.*;
import junit.extensions.*;
import org.junit.Test;

import MiniCalculatorTDDGroupID.MiniCalculatorTDDArtifactID.Calculator;

public class CalculatorJunitTest {

		Calculator cal;

	public CalculatorJunitTest(){
		cal = new Calculator();
	}
	@Test
	public void add(){
	//System.out.print("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 	assertEquals(0, cal.addition(-20, 25));
	System.out.println("------Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	
	@Test
	public void sub()
	{
		System.out.print("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 		assertEquals(4, cal.subtruction(10, 6));
		System.out.println("------Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void div()
	{
	System.out.print("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 	//	assertEquals(2, cal.division(4, 2));
		assertEquals("Error!!", cal.division(4, 0));
		assertEquals(5, cal.division(10, 2));


		System.out.println("------Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void mul()
	{
		System.out.print("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 		assertEquals(50, cal.multipilication(10, 5));
		System.out.println("------Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void rem()
	{
		System.out.print("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 		assertEquals(2, cal.rem(10, 4));
		System.out.println("------Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void testOfPrintUpTo10(){
		cal.printUpTo10();
	}
	
}