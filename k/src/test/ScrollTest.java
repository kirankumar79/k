package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class ScrollTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		// load browser
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();


		// maximize browser
		driver.manage().window().maximize();

		// Open Application
		driver.get("http://jqueryui.com");

		// Wait for 5 second
		Thread.sleep(5000);

		// This will scroll page 400 pixel vertical
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		WebElement elem = driver.findElement(By.linkText("Controlgroup"));

		// This will enable this element if element is invisible

		String attr = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

		// Execute the Java Script for the element which we find out
		((JavascriptExecutor) driver).executeScript(attr, elem);

		// Click on element

		elem.click();

		WebElement elem1 = driver.findElement(By.name("s"));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		//js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", elem1);
		elementHighLight(js, elem1);
	 
		elem1.sendKeys("kiran");
		
		Thread.sleep(2000);

		// type in Selenium without using sendKeys() method
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('s')[0].value='kumar';");

		// This will execute JavaScript in your script
		js.executeScript("document.getElementsByClassName('icon-search')[0].click();");

		driver.get("https://www.w3schools.com/howto/howto_js_display_checkbox_text.asp");
			
		// This will execute JavaScript in your script
		((JavascriptExecutor) driver).executeScript("document.getElementById('myCheck').checked=true;");
		
		// Pass application URL
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		 
		 
		 
		// Create instance of Javascript executor
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		 
		 
		 
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		 
		 
		// Extract the text and verify
		 
		System.out.println(element.getText());
		 
		
	}
	
	public static void elementHighLight(JavascriptExecutor je, WebElement we){
		je.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", we);
	}
	

}
