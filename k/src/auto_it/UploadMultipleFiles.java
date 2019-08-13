package auto_it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadMultipleFiles {

	@Test
	public void UploadMultiplFiles() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

//		driver.get("file:///C:/Users/Windows/Desktop/fileupload.html");
		driver.get("http://demo.guru99.com/test/upload/");

//		WebElement el = driver.findElement(By.xpath(".//*[@id='s']"));
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadElement);
		System.out.println("trying 1st file");
		Thread.sleep(2000);

		Runtime.getRuntime().exec(
				"C:\\selenium\\AutoIT\\ParameterisedFileUpload.exe"
						+ " "
						+ "C:\\Users\\Windows\\Desktop\\demo.java");

		
		System.out.println("1st file uploaded");
		Thread.sleep(2000);
//		WebElement el1 = driver.findElement(By.xpath(".//*[@id='s']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadElement);
		System.out.println("trying 2nd file");
		Thread.sleep(2000);

		Runtime.getRuntime().exec(
				"C:\\selenium\\AutoIT\\ParameterisedFileUpload.exe"
						+ " " + "C:\\Users\\Windows\\Desktop\\Q&A.txt");
	}
}