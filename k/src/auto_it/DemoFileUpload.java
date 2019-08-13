package auto_it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoFileUpload {

	@Test
	public void testAutoIt () throws Exception {

		// This will open Firefox browser
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		// This will maximize browser to full screen
		driver.manage().window().maximize();

		// This will open respective URL
		driver.get("file:///C:/Users/Windows/Desktop/fileupload.html");
//		driver.get("http://demo.guru99.com/test/upload/");

		// This will click on Upload button
		WebElement el = driver.findElement(By.xpath(".//*[@id='s']"));
//		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
		// This will invoke AutoIT script here give the path of the script
		// and this will throw IO exception so u can use throw or try catch
		// In my case I am using throws
		
		Thread.sleep(9000);

		Runtime.getRuntime().exec("C:\\selenium\\AutoIT\\first.exe");

		// Once you will run this program AutoIt script will be invoked and
		// respective f//ile will be attached

	}

}