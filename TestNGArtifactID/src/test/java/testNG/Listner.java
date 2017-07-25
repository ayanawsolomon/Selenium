package testNG;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ISuiteListener, ITestListener, IInvokedMethodListener{

	public void onStart(ISuite suite){
		Reporter.log("Ready to run suite : " + suite.getName(), true);
	}
	public void onFinish(ISuite suite){
		Reporter.log("Suite run is completed : " + suite.getName(), true);
	
	}
	public void onStart(ITestContext context){
		Reporter.log("Test is about to run: " + context.getName(), true);
	}
	
	public void onFinish(ITestContext context){
		Reporter.log("Test is done here : " + context.getName(), true);
		
	}
	public void onTestSuccess(ITestResult result){
		printTestResult(result);
	}
	
	public void onTestFailure(ITestResult result){
		printTestResult(result);
	}
	public void onTestStart(ITestResult result){
		printTestResult(result);
	}
	public void onTestSkipped(ITestResult result){
		printTestResult(result);
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	

	private void printTestResult(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("This test is : " + result.getTestClass().getName(), true);
		String testInfo="";
		if(result.getParameters() != null){
			for(Object parameter : result.getParameters()){
				testInfo = testInfo + ", " + parameter;
			}
			Reporter.log("The current parameter methods are : " + testInfo, true);
		}
		String status =null;
		switch(result.getStatus()){
		case ITestResult.SUCCESS :
			status ="Success";
			break;
		case ITestResult.FAILURE:
			status = "Failed";
			break;
		case ITestResult.SKIP:
			status ="skipped";
			break;
		case ITestResult.STARTED:
			status ="Started";
			break;
		case ITestResult.SUCCESS_PERCENTAGE_FAILURE:
			status ="Succews_percentage_failuer";
			break;
		
		}
		Reporter.log(" Status of the test is: " + status, true);

		
	
	}
	
	public void beforeInvocation(IInvokedMethod method, ITestResult test){
		Reporter.log("Method is about to run: " + getMethodName(method.getTestMethod()), true);
		
	}
	public void afterInvocation(IInvokedMethod method, ITestResult test){
		Reporter.log(method.getClass().getName() + ", " + method.getTestMethod(), true);
		
	}
	public String getMethodName(ITestNGMethod method){
		return method.getClass().getName() + ", " + method.getMethodName();
		
	}
	
	
}