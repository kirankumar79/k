package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MulWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		testMultipleWindows();
	}
	
	 
	public static void testMultipleWindows() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//
//		// To open browser
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		// To maximize browser
		driver.manage().window().maximize();
		// To open Naukri website with multiple windows
		//driver.get("http://www.naukri.com/");
		driver.get("http://www.flipkart.com/");
		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of
		// Strings
		Set<String> set = driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If
			// not equal, we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
	}
}