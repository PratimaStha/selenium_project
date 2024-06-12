package Pratimaaa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src,new File("C:\\Users\\prati\\Pictures"), true);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:\\SS\\ss.png"));
        driver.close();  
	}
	

}
