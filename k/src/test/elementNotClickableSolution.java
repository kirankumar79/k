package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementNotClickableSolution {
	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		// Create object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		
		 
		// Start the chrome session
		WebDriver driver = new ChromeDriver(options);
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com");
		
//		WebElement elementToClick = driver.findElement(By.id("persistent"));
		
//		elementToClick.click();
		
//		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
		 
		 
		 
		// Click the element
		 
//		elementToClick.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Actions act = new Actions(driver);
//		act.moveToElement(elementToClick).click().build().perform();
		
		Thread.sleep(9);
		
		WebElement elementToClick1 = driver.findElement(By.xpath("//label[contains(text(), 'Stay signed')]"));
		
		System.out.println("found element   "+elementToClick1);
		
//		WebElement elementToClick1 = driver.findElement(By.xpath("//a[@id='mbr-forgot-link')]"));
		
//		WebElement elementToClick1 = driver.findElement(By.id("mbr-forgot-link"));
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(elementToClick1));
		
		elementToClick1.click();		
		System.out.println(":)");
		

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elementToClick1);
		

	}

}
