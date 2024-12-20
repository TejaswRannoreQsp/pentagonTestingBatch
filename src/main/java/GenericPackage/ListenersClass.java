package GenericPackage;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--sucess");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--failure");
		WebDriverUtility w=new WebDriverUtility();
		JavaUtility j=new JavaUtility();
		String screenshot = methodName+j.toFetchDateAndTime();
		try {
			w.toperformScreenshotOnWebpage(BaseClass.sdriver, screenshot);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--skipped");
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite execution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite execution completed");
	}
	

}
