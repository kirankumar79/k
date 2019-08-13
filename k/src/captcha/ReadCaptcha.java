package captcha;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ReadCaptcha {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium\\chromedriver-win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("loginText")).click();
		File src = driver.findElement(By.id("captchaImg")).getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"/screeshots/captcha.png";
		
		FileHandler.copy(src, new File(path));
		
		

	}
}