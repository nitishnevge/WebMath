package TS_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Click on Math for Everyone option.
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(3000);

		// Click on Retirement.
		driver.findElement(By.xpath("//*[@href='retire.html']")).click();
		Thread.sleep(3000);

		// Calculation
		driver.findElement(By.xpath("//*[@name='salary']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='start']")).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='contrib']")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='raise']")).sendKeys("120");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='return']")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='years']")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);

		// Click on Back
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
