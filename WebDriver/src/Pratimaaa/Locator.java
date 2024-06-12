package Pratimaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String GetPassword = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

//		driver.findElement(By.id("inputUsername")).sendKeys("Pratima");
//		driver.findElement(By.name("inputPassword")).sendKeys("pratima123");
//		driver.findElement(By.className("signInBtn")).click();
//		driver.findElement(By.linkText("Forgot your password?")).click();
//
//		Thread.sleep(1000);
//		
//		
//		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Pratima");
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pratima123@gmail.com");
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("98086848");
//		
//		driver.findElement(By.className("reset-pwd-btn")).click();
		// Thread.sleep(10000);
		// driver.findElement(By.className("go-to-login-btn")).click();
//	
		// driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		// Thread.sleep(10000);
		driver.findElement(By.id("inputUsername")).sendKeys("Pratima");
		driver.findElement(By.name("inputPassword")).sendKeys(GetPassword);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		// driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		// driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.className("infoMsg")).getText();

		System.out.println(passwordText);

//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
//	     System.out.println(Arrays.toString(passwordArray));
//	     for(String a: passwordArray) {
//	    	 System.out.println(a);
//	     }
		// index0 = Please use temporary password
		// index1 = rahulshettyacademy' to Login
		// String[] PasswordArray2 = passwordArray[1].split(" ' ");
		// index0 =rahulshettyacademy
		// index1 = to Login

		String Password = passwordArray[1].split(" ' ")[0];
		System.out.println(Password);
		return Password;

	}

//4.17.0
}
