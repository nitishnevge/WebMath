package TS_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_14 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Click on Math for Everyone option.
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(3000);

		// Click on Volume
		driver.findElement(By.xpath("//*[@href='convert_volume.html']")).click();
		Thread.sleep(2000);

		// Calculation
		driver.findElement(By.xpath("//*[@name='param0']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='param1']")).click();
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[1]/select/option[4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='param2']")).click();
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/select/option[8]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);

		// Click on Back
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
