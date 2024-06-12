package Pratimaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		// driver.navigate().back();

	}

}
