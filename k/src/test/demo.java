
/**
 * 
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Windows
 *
 */
public class demo {

	/**
	 * @param args
	 */
	static WebDriver wd;
	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.switchTo().alert();
		
/*		File file = new File("C:/selenium/selenium/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		wd = new InternetExplorerDriver();
		wd.get("http://www.flipkart.com");
*/	
	}

}
