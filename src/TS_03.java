import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_03 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='topicItem']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='cn_add.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='topicItem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='convert_speed.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='param0']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='navBox-0']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
	

}
