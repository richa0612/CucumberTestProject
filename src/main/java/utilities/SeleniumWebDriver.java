package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebDriver {
	
	private static SeleniumWebDriver seleniumDriver;
	
	private static WebDriver driver; 
	
	private static WebDriverWait WaitDriver;
	
	public final static  int TIMEOUT = 30;
	
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	
	private SeleniumWebDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\richa.pandey\\workspace-cucumber\\LiveProject\\src\\test\\java\\executables\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WaitDriver = new WebDriverWait(driver, TIMEOUT);
		
		driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
		
	}
	
	
	public static void openPage(String url) {
		
		driver.get(url);
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void setUpDriver() {
		
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumWebDriver();
		}
	}
	
	public static void tearDown() {
		
		if (driver!= null) {
			
			driver.close();
			driver.quit();
		}
	}
	

}
