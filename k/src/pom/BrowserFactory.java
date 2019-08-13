package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static  WebDriver startBrowser(String browser, String url) {
		// TODO Auto-generated method stub
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();

		driver.get(url);

		
		return driver;
	}

}
