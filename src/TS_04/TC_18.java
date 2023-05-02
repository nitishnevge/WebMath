package TS_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_18 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Click on Math for Everyone option.
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(2000);

		// click on Cost of electricity.
		driver.findElement(By.xpath("//*[@href='kwh.html']")).click();

		// Calculation
		driver.findElement(By.xpath("//*[@name='watts']")).sendKeys("1452");
		driver.findElement(By.xpath("//*[@name='time']")).sendKeys("24");
		driver.findElement(By.xpath("//*[@name='tunit']")).click();
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center[2]/select/option[2]"))
				.click();
		driver.findElement(By.xpath("//*[@name='cost']")).sendKeys("1.00");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		// Click on Back
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();

		driver.close();
	}

}
