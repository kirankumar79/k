package aktions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragDrop {
	 
	public static void main(String[] args) throws InterruptedException {
		
 
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open webpage
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
 
//		driver.switchTo().frame(0);
		
		// Add 5 seconds wait
		Thread.sleep(5000);
 
		// Create object of actions class
		Actions act=new Actions(driver);
 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		// calling the method and x,y cordinates are random
		act.dragAndDropBy(drag, 250, 150).build().perform();
 
	}
 
}