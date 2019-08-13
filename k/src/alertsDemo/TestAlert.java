package alertsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//public class TestAlert {
//
//	@Test
//	public void TestAL() throws InterruptedException {
//
//		// Load Firefox browser
//		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//
//		// Open KSRTC website
//
//		driver.get("http://www.ksrtc.in");
//
//		// Maximize the window
//
//		driver.manage().window().maximize();
//
//		// Click on Search Availability Service button
//		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.findElement(By.linkText("Search for Bus"));
//
////		driver.findElement(By.xpath(".//*[@id='Table_3']/tbody/tr[1]/td[2]/div/a")).click();
//
//		// Switch to alert window and capture the text and print
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		// Pause testcase for 5 second
//
//		Thread.sleep(5000);
//
//		// click on ok button
//
//		driver.switchTo().alert().accept();
//
//		// Close browser
//
//		driver.quit();
//	}
//}

public class TestAlert {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	
	
}