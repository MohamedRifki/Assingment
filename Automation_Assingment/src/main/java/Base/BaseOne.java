package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOne {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		test1();

	}

	public static void test1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//user//Desktop//Automation//Automation_tutorial//ChromeDriver//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://difc.globaltradingnetwork.com/web/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("  ");

		driver.findElement(By.id("form-input-live-p")).sendKeys("  ");
		driver.findElement(By.id("LoginButton")).click();

	}

}
