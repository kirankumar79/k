package aktions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pom.BrowserFactory;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://www.google.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);

		/*
		 * act.contextClick(driver.findElement(By.linkText("Settings")))
		 * .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		 * .sendKeys(Keys.RETURN).build().perform();
		 */

		act.contextClick(driver.findElement(By.linkText("Settings"))).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WebElement elementOpen =
		// driver.findElement(By.linkText("Open link in new window")); /*This
		// will select menu after right click */
		// elementOpen.click();
	}
}
