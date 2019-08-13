package aktions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropDemo {
	 
	public static void main(String[] args) throws InterruptedException {
		
 
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open webpage
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
 
	
		// Add 5 seconds wait
		Thread.sleep(5000);
 
		// Create object of actions class
		Actions act=new Actions(driver);
 
		// find element which we need to drag
		WebElement source=driver.findElement(By.xpath("(//span[text()='Thrillers'])[1]"));
		
		WebElement destination=driver.findElement(By.xpath("(//span[text()='History'])[2]"));
		
		// it will click and hold the triller box and move to element will move cursor to history in another box and then release
		act.clickAndHold(source).pause(2000).moveToElement(destination).release().build().perform();
 
	}
 
}