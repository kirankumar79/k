package DropDownSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.BrowserFactory;


public class VerifySortedAscendingMO {
    @Test
    public void runTestOnDocker() throws Exception {

			WebDriver driver = BrowserFactory.startBrowser("chrome","https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");			
			WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
			Select se = new Select(element);
			List<String> originalList = new ArrayList();
			for (WebElement e : se.getOptions()) {
				originalList.add(e.getText());
				System.out.println("element : " + e.getText());
			}
			//----logic block starts
			List<String> tempList= new ArrayList();
			tempList.addAll(originalList);
			
			System.out.println("originalList : " + originalList);
			System.out.println("tempList : " + tempList);
			
//			Collections.sort(tempList, Collections.reverseOrder());
			Collections.sort(tempList);
			
			System.out.println("sorted List : " + tempList);
			System.out.println("originalList again : " + originalList);
			//Assert.assertEquals(tempList, originalList);
			
			Assert.assertTrue(originalList.equals(tempList));			

    }
}