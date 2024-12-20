package GenericPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver=null;
	Propertyfile p=new Propertyfile();
	WebDriverUtility w=new WebDriverUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void beforesuiteconfi() {
		Reporter.log("DataBase connection started",true);
	}
	
	@BeforeClass
	public void ToLaunchBrowser() throws IOException {
		
		String BROWSER = p.toreadDataFrompropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		sdriver=driver;
		Reporter.log("Browser is launched",true);
		
		w.toMaximize(driver);
		Reporter.log("Browser is maximized",true);
		w.wait_tillpageloads(driver);
	}
	@BeforeMethod
	public void NavigateToURl() throws IOException {
		String URL = p.toreadDataFrompropertyFile("url");
		driver.get(URL);
		Reporter.log("Browser is navigated to application",true);
	}
	@AfterMethod
	public void logoutFromApplication() {
		
	}
	@AfterClass
	public void TocloseBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void aftersuiteconfi() {
		Reporter.log("DataBase connection flushed out or removed",true);
	}

}
