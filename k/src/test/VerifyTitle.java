package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.inviul.com");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
///		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(actualTitle.contains("Free Selenium Tutorials"));
		Assert.assertTrue(driver.getPageSource().contains("TestNG Tutorials"));
//		driver.close();
//		driver.quit();

	}

}