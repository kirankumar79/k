package aktions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*		
		//Launching sample website
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		action.moveToElement(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
	*/	
		//Closing the driver instance
		//driver.quit();
/*
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		//Mouseover on submit button
		Actions action1 = new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//input[@id='u_0_a']"));
		action1.moveToElement(btn1).perform();
	*/	
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		//Mouseover on submit button
		Actions action1 = new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//span[text()='Departments']"));
		action1.moveToElement(btn1).perform();
		
	
	}	
	
}