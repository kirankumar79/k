package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToFrame_ID {
/*	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://demo.guru99.com/test/guru99home/"); // navigates to

		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		// switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click(); // Clicks the

		System.out.println("*********We are done***************");
	}
*/

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");

		// Switch by Index

		// System.out.println("current frame : " + el.getAttribute("name"));



		// driver.findElement(By.xpath("//a[text()='Git Log']"));

		// driver.quit();
		String frame = "iframe1";
		try {
			driver.switchTo().frame(frame);
//			driver.switchTo().frame(driver.findElement(By.name("iframe1")));
			System.out.println("Navigated to frame with id " + frame);
//			WebElement el = (WebElement) ((JavascriptExecutor) driver).executeScript("return window.frameElement");
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + frame
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with id " + frame
					+ e.getStackTrace());
		}
//		Thread.sleep(9000);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Git Log']")));

		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
	}

}