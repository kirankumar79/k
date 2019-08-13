package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest {
	 
	WebDriver driver;
	@Test
	// Here this parameters we will take from testng.xml
	@Parameters("Browser")
	public void test1(String browser) {
		
		if (browser.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.facebook.com");

			driver.quit();
			
		} else if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.facebook.com");

			driver.quit();
			
		} else if (browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver","C:/selenium/selenium/IEDriverServer_x64_3.14.0/IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.facebook.com");
			
//			driver.quit();

			try {
				Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
//		driver.manage().window().maximize();
//
//		driver.get("http://www.facebook.com");
//		
//		driver.close();
//
//		driver.quit();
		

	}

}