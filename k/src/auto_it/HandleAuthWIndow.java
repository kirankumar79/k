package auto_it;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAuthWIndow {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Runtime.getRuntime().exec("C:\\selenium\\AutoIT\\HandleAuthWindow.exe");
		driver.get("https://www.engprod-charter.net");
//		Thread.sleep(5000);
		
		
/*		
		String URL = "http://admin:admin@the-intenet.herokuapp.com/basic_auth";
		driver.get(URL);
		Alert alert = driver.switchTo().alert();
		alert.accept();
*/
		
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("kiran");
		


		alert.accept();

	}

}
