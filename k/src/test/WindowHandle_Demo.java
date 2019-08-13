package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driverPath);
		WebDriver driver = new FirefoxDriver();

		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String xp = "//*[contains(@href,'popup.php')]";

		driver.findElement(By.xpath(xp)).click();

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				
				Thread.sleep(2000);
				
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
/*				
				WebDriverWait wait2 = new WebDriverWait(driver, 10);
				wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("emailid"))));
*/
				WebElement el = driver.findElement(By.name("emailid"));
				el.sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window.
				driver.close();
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
	}
}