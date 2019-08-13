package session_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMultipleSession {
	@Test(testName="tc1", dependsOnMethods={"executeSessionTwo"})
	public void executSessionOne() {
		// First session of WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 1");

	}

	@Test(testName="tc2")
	public void executeSessionTwo() {
		// Second session of WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 2");

	}

	@Test(testName="tc3")
	public void executSessionThree() {
		// Third session of WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 3");

	}
}