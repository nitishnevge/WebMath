import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_02 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("navBox-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("navBox-2")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("navBox-3")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navBox-4")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navBox-5")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navBox-6")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("navBox-7")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='navBox-0']")).click();
        Thread.sleep(3000);
        
        driver.close();
        	
	}

}
