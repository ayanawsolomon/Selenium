package grouping;

import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class TestSelenium {

	public void runSelenium() {
		System.out.println("***************runSelenium()2");
	}

	public void runSelenium1() {
		System.out.println("**************runSelenium()3");
	}
	
	@Test(groups="independent")
	public void runSelenium2() {
		System.out.println("**************runSelenium()4");
	}

}