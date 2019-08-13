package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PomDemoTest {

	@Test
	public void verifyValidLogin() {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://demosite.center/wordpress/wp-login.php");

		LoginPage login = new LoginPage(driver);

		login.loginToWordpress("admin","demo123");

		driver.quit();
	}
	
}