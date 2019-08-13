package aktions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pom.BrowserFactory;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
/*
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://www.amazon.com/");

		// Type something on Skill textbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("test");

		// Create object on Actions class
		Actions builder = new Actions(driver);

		// find the element which we want to Select from auto suggestion
		WebElement ele = driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));

		// use Mouse hover action for that element
		builder.moveToElement(ele).build().perform();

		// Give wait for 2 seconds
		Thread.sleep(2000);

		// finally click on that element
		builder.click(ele).build().perform();
		
		
*/		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://in.via.com/bus-tickets");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='src']"))
		    .clear();

		driver.findElement(By.xpath("//input[@id='src']"))
		    .sendKeys("Chen");

		driver.findElement(
		    By.xpath("//div[@class='acResults'][1]//li[1]//span")).click();

		driver.findElement(By.xpath("//input[@id='autocomplete_dest']"))
		    .clear();

		driver.findElement(By.xpath("//input[@id='autocomplete_dest']"))
		    .sendKeys("Co");

		driver.findElement(
		    By.xpath("//div[@class='acResults'][2]//li[1]//span")).click();
	}

}