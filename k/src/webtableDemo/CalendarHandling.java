package webtableDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CalendarHandling {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
//		WebDriver driver1 = new WebDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();


		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'23')]")).click();
		
		driver.findElement(By.id("datepicker")).click();		
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("11"))
			{
				ele.click();
				break;
			}
			
		}
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[@class='wd day'][text()='20']")).click();
		
		List<WebElement> allDates1=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td[@class='wd day' | @class='we day']"));
		
//		List<WebElement> allDates1=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td[@class='wd day']"));
//		List<WebElement> allDates1=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td[@class='we day']"));

		for(WebElement ele:allDates1)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("30"))
			{
				ele.click();
				break;
			}
			
		}
		

		
		
		
		
		
		
		
/*		
		
		driver.get("https://ksrtc.in/pages/bus-services.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allDates1=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td[@class='wd day']"));

		for(WebElement ele:allDates1)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("26"))
			{
				ele.click();
				break;
			}
			
		}
	*/	
	}

}