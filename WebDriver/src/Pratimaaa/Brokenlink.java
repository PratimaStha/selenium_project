package Pratimaaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> list = driver.findElements(By.cssSelector(".gf-li a:nth-child(1)"));
		for (int i = 0; i < list.size(); i++) {
			String link = list.get(i).getAttribute("href");
			System.out.println(link);
		}

	}

}
