package Pratimaaa;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		//April 23
	
		System.out.println(driver.findElement(By.cssSelector(".elementor-field.elementor-size-sm.elementor-field-textual.elementor-date-field.flatpickr-input")).getText());


//		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
//		{
//		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//		}
//
//
//		List<WebElement> dates= driver.findElements(By.className("day"));
//		
//		//Grab common attribute//Put into list and iterate
//		int count=driver.findElements(By.className("day")).size();
//
//		for(int i=0;i<count;i++)
//		{
//		String text=driver.findElements(By.className("day")).get(i).getText();
//		if(text.equalsIgnoreCase("21"))
//		{
//		driver.findElements(By.className("day")).get(i).click();
//		break;
//		}
//
//		}
//		

	}

}
