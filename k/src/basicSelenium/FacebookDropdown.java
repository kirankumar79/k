package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement male_radio_button = driver.findElement(By.id("u_0_6"));

		boolean status = male_radio_button.isDisplayed();

		System.out.println("Male radio button is Displayed >>" + status);

		boolean enabled_status = male_radio_button.isEnabled();

		System.out.println("Male radio button is Enabled >>" + enabled_status);

		boolean selected_status = male_radio_button.isSelected();

		System.out.println("Male radio button is Selected >>" + selected_status);

		male_radio_button.click();

		boolean selected_status_new = male_radio_button.isSelected();

		System.out.println("Male radio button is Selected >>" + selected_status_new);

	}

}