package hubDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "kirankumars1";
  public static final String AUTOMATE_KEY = "pNApqTP1B74GTPyYyzGk";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

//    DesiredCapabilities caps = new DesiredCapabilities();
//    caps.firefox();
    DesiredCapabilities cap = DesiredCapabilities.firefox();
    cap.setPlatform(Platform.XP);

    WebDriver driver = new RemoteWebDriver(new URL(URL), cap);
    driver.get("http://www.google.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();

  }
}