package aktions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.BrowserFactory;

public class MouseHoverMenu1 {

	public static void main(String[] args) {
/*		driver.get("https://www.skiutah.com/");
		WebElement deals = driver.findElement(By.xpath("//a[@title='Deals']"));
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		Locatable hoverItem = (Locatable) deals;
		mouse.mouseMove(hoverItem.getCoordinates());
		WebElement beginner = driver.findElement(By.xpath("//a[text()='All Deals']"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(beginner));
		Locatable clickItem = (Locatable) beginner;
		mouse.mouseDown(clickItem.getCoordinates());
		mouse.mouseUp(clickItem.getCoordinates());
		System.out.println(driver.getTitle());
		
*/
		WebDriver driver = BrowserFactory.startBrowser("chrome","https://www.amazon.com/");
		

		WebElement deptEle = driver.findElement(By.linkText("Departments"));
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		Locatable hoverItemLocatable = (Locatable) deptEle;
		mouse.mouseMove(hoverItemLocatable.getCoordinates());

		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Movies & Television')]")));  

		WebElement menuItemSelected = driver.findElement(By.xpath("//span[contains(text(),'Movies & Television')]"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(menuItemSelected));
		Locatable clickItemLocatable = (Locatable) menuItemSelected;
		mouse.mouseDown(clickItemLocatable.getCoordinates());
		mouse.mouseUp(clickItemLocatable.getCoordinates());
		System.out.println(driver.getTitle());
		
		driver.get("https://www.skiutah.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//locate the menu to hover over using its xpath
		WebElement menu = driver.findElement(By.linkText("DEALS"));
		//Initiate mouse action using Actions class
		Actions akt = new Actions(driver);
		// move the mouse to the earlier identified menu option
		akt.moveToElement(menu).build().perform();
		// wait for max of 5 seconds before proceeding.
		// until this submenu is found
		WebDriverWait wait1 = new WebDriverWait(driver, 5); 
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"top_menu\"]/ul/li[4]/ul/li[1]/ul/li[3]/a")));  
		//identify menu option from the resulting menu display and click
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"top_menu\"]/ul/li[4]/ul/li[1]/ul/li[3]/a"));
		menuOption.click();


	}

}
