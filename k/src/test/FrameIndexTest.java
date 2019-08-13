package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FrameIndexTest {
	 
    static WebDriver driver;
    private String url = "http://www.londonfreelance.org/courses/frames/index.html";
 
    //Setup Driver
    @BeforeClass
    public static void setupTest() {
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
 
    @Test
    public void FrameExampleTest() {
        //Navigate to URL
        driver.manage().window().maximize();
        driver.navigate().to(url);
 
        //Switch to main frame with its index (top.html)
        //top.html is in 3rd frame so its index is 2
        driver.switchTo().frame(2);
 
        //Check the H2 tag's text is "Title bar (top.html)
        WebElement h2Tag = driver.findElement(By.cssSelector("html>body>h2"));

    }
 
    //Close Driver
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}