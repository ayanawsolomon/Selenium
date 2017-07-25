package TDDminiCalculatorJunitTestCases;

import java.text.Collator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MiniCalculatorTDDGroupID.MiniCalculatorTDDArtifactID.Calculator;
import junit.framework.Assert;

public class MiniCalculator {
	Calculator cal;
	int result;
	@BeforeTest 
	public void test(){
		 cal = new Calculator();
	}
  @Test
  public void addition() {
	  // Addtion 
	 result = cal.addition(5, 6);
	 Assert.assertEquals(11, result);
	 result = cal.addition(-5, 6);
	 Assert.assertEquals(1, result);
	 
  }
  
  
  @Test
  public void sub() {
	  // sub 
	 result = cal.subtruction(5, 6);
	 Assert.assertEquals(-1, result);
	 result = cal.subtruction(5,- 6);
	 Assert.assertEquals(11, result);
	 
  }
  
  @Test
  public void mul(){
	  result = cal.multipilication(-5, -6);
	  Assert.assertEquals(30, result);
  }
  
  
  @Test
  public void div(){
	  result = (Integer) cal.division(12, 6);
	  Assert.assertEquals(2, result);
  }
  @Test
  public void divByZero(){
	  Assert.assertEquals("Error!!", cal.division(13, 0));
  }
  
 // @Test
  public void rmdr(){
	  result = cal.rem(5, 2);
	  Assert.assertEquals(1, result);
  }
  
}
