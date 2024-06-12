package Pratimaaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		// value.size();
		int sum = 0;
		for (int i = 0; i < value.size(); i++) {
			sum = sum + Integer.parseInt(value.get(i).getText());

		}
	
		String total = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int totals = Integer.parseInt(total);
		System.out.println(totals);
		Assert.assertEquals(sum, total);
			}
}
