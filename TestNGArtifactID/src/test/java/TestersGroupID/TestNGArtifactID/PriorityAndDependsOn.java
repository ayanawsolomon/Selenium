package TestersGroupID.TestNGArtifactID;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityAndDependsOn {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("///////suite code from registriaon");
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println("///////suite code from registration");
	}
	
	@BeforeGroups
	public void beforeGroup(){
		System.out.println("runs before group start");
	}

	@Test(priority =5)
	  public void phoneTest1(){
		  System.out.println("phone and email with 1928964356");
	  }
	@Test()
	  public void phoneTest2(){
		  System.out.println("phone with ' ' ");
	  }
	@Test(priority =4)
	  public void phoneTest3(){
		  System.out.println("phone and email with sdflkjsdklsdfsdfj");
	  }
	@Test(dependsOnMethods = {"emailTest2"}, priority=2)
	  public void phoneTest4(){
		  System.out.println("run second phone with 23423524524542542");
	  }
	
	
	@Test(dependsOnMethods = {"emailTest2"}, priority =5)
	  public void emailTest1(){
		  System.out.println("email and phone with email 324324234234@gamil.com");
	
	}
	@Test( priority =4)
	  public void emailTest2(){
		  System.out.println("email and phone with email adsflksjdfsd@gamil.com");
	Assert.assertEquals("Solomon", "John");  
	}
	@Test(dependsOnMethods = {"emailTest2"}, priority =3)
	  public void emailTest3(){
		  System.out.println("email with email sdfsdfsdf@@gamil.com");
	  }
	@Test(priority =1)
	  public void emailTest4(){
		  System.out.println("run first email with email with dsfdsfsf");
	  }
	
	
	
}
