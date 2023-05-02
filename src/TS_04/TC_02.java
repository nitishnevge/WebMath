package TS_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//Click on  Math for Everyone option.
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(3000);
		
		// click on  Figuring a tip.
		driver.findElement(By.xpath("//*[@href='tip.html']")).click();
		Thread.sleep(3000);
		
		//Calculation
		driver.findElement(By.xpath("//*[@name='param0'] ")).clear();
		driver.findElement(By.xpath("//*[@name='param0'] ")).sendKeys("10");
		driver.findElement(By.xpath("//*[@name='param1']")).sendKeys("3000");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
				
		//Click on Back
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
