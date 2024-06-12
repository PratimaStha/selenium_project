package Pratimaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.np/");
		
		 Actions a = new Actions(driver);
		// WebElement move = driver.findElement(By.id("topActionCustomCare"));
	a.moveToElement(driver.findElement(By.id("q"))).click().keyDown(Keys.SHIFT).sendKeys("jacket").build().perform();
	driver.findElement(By.className("search-box__button--1oH7")).click();
		// a.moveToElement(move).contextClick().build().perform();

	}

}
