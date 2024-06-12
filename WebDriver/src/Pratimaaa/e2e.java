package Pratimaaa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='DEL']")).click();
//		Thread.sleep(2000);
//		
//	//	Thread.sleep(2000);)
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-activez")).click();
//		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
//if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
//			
//			System.out.println("its enabled");
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertFalse(false);
//		}
//driver.findElement(By.id("divpaxinfo")).click();
////Thread.sleep(2000);
//driver.findElement(By.id("hrefIncChd")).click();
//int i = 1;
//while(i<5) {
//	driver.findElement(By.id("hrefIncAdt")).click();
//	i++;
//}
////for(int i=1;i<5;i++) {
////	driver.findElement(By.id("hrefIncAdt")).click();
////}
//
//driver.findElement(By.id("btnclosepaxoption")).click();
//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	//driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();

	}

}
