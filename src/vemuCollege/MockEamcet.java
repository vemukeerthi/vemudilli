package vemuCollege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MockEamcet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vemu.org");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div/div/div[1]/div/div/div[1]/a[4]/img")).click();
		driver.findElement(By.linkText("Free Demo Test")).click();
		new Select(driver.findElement(By.name("course"))).selectByValue("1");
		Thread.sleep(4000);
		new Select(driver.findElement(By.id("stream"))).selectByVisibleText("JEE Advance");
		driver.findElement(By.id("name")).sendKeys("Purushotham");
		driver.findElement(By.id("phone")).sendKeys("9980251000");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[8]/button")).click();
		

	}

}
