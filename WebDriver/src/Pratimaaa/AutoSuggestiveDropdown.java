package Pratimaaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))	.click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("autosuggest")).sendKeys("chi");
		Thread.sleep(2000);
	//	driver.findElements(null)
		List<WebElement> options = driver.findElements(By.cssSelector("li[class= 'ui-menu-item'] a"));

	 driver.findElement(By.cssSelector("li[class= 'ui-menu-item'] a"));
		
		 for(WebElement option : options) {
			 if(option.getText().equalsIgnoreCase("china")) {
				 option.click();
			 break;
			 }
		 }
		 
		 Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 
		 
		 
		
	}

}
