package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(test.TestNGListener.class)
public class TestNGListenerDemo {
	
	@Test
	public void GoogleTitleVerify(){
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("title :"+driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void scenario1(){
		System.out.println("dummy test");
		Assert.assertTrue(false);
	}

}
