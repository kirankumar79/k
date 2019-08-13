package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyError {

	@Test
	public void TestError() {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		// Open browser
		FirefoxDriver driver = new FirefoxDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open URL
		driver.get("http://www.naukri.com/");

		// Click on login button
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.className("blueBtn")).click();
		driver.findElement(By.id("qsbFormBtn")).click();
		// This will capture error message
		String actual_msg = driver.findElement(By.id("qsbError")).getText();

		// Store message in variable
		String expect = "plz enter valid email";

		// Here Assert is a class and assertEquals is a method which will
		// compare two values if// both matches it will run fine but in case if
		// does not match then if will throw an
		// exception and fail testcases

		// Verify error message
		Assert.assertEquals(actual_msg, expect);

	}
}