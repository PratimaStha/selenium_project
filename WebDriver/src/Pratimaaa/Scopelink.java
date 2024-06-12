package Pratimaaa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class Scopelink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columnDriver = driver.findElement(By.xpath("//tr/td[1]/ul"));
		int size = columnDriver.findElements(By.tagName("a")).size();
		for(int i=1;i<size;i++) {
			
		String clickAndEnter = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickAndEnter);
			 Thread.sleep(5000);
			 }
			 Set<String> windows = driver.getWindowHandles();
			 Iterator<String>it = windows.iterator();
			 
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			// 
		
		
	}

}
