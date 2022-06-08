package vemuCollege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vemu.org");
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[10]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("full_name")).sendKeys("Purushotham");
		Thread.sleep(2000);
		driver.findElement(By.name("email_id")).sendKeys("techlearn.india@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_no")).sendKeys("9000109120");
		driver.findElement(By.className("button-default")).click();
		

	}

}
