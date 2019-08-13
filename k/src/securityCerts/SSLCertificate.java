package securityCerts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) throws InterruptedException {
/*
		// It create firefox profile
		FirefoxProfile profile = new FirefoxProfile();

		// This will set the true value
		profile.setAcceptUntrustedCertificates(true);

		// This will open firefox browser using above created profile
		WebDriver driver = new FirefoxDriver(profile);

		driver.get("pass the url as per your requirement");
*/
		
		ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.setAcceptInsecureCerts(true);

//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		 
		// Set ACCEPT_SSL_CERTS  variable to true
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// Set the driver path
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
//		 
//		// Open browser with capability
		WebDriver driver=new ChromeDriver(options);
//		
//		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(cap);
		
//		File file = new File("C:/selenium/selenium/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
//		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		WebDriver driver = new InternetExplorerDriver(cap);




		
		driver.get("https://www.cacert.org/");
/*		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("moreInfoContainer")).click();
		Thread.sleep(2000);
		driver.navigate().to("javascript:document.getElementById('overridelink').click();");
		System.out.println("done :)");		
		
	*/	
	}

}