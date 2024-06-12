package Pratimaaa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);

		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		System.out.println(email);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(email);
//		
		
		// System.out.println(driver.findElement(By.linkText("mailto:mentor@rahulshettyacademy.com")).getText());

	}

}
