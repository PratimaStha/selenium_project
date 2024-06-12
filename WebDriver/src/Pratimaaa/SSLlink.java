package Pratimaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
	
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
