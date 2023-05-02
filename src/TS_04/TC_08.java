package TS_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_08 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Click on Math for Everyone option.
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(3000);

		// Click on Compound Interest.
		driver.findElement(By.xpath("//*[@href='compinterest.html']")).click();
		Thread.sleep(3000);

		// Calculation
		driver.findElement(By.xpath("//*[@name='principal']")).sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='interest']")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='compound']")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='desired_time']")).sendKeys("4");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);

		// Click on Back
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();

		driver.close();

	}

}
