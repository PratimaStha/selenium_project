package Pratimaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));

		// driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[1]")).click();
		// instead of this we use
		driver.findElement(
				By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Delhi (DEL)']"))
				.click();
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-default.ui-state-highlightui-state-highlight")).click();
//	driver.findElement(By.className("ui-state-default-ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		// a[@text='Delhi (DEL)'])[1]")

//		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
		// driver.findElement(By.id("hrefIncChd")).click();
		// int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		for(int i=1;i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		

		// driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz
		// r-1wtj0ep")).click();

	}

}
