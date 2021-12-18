package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTwo {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		test2();

	}

	public static void test2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//user//Desktop//Automation//Automation_tutorial//ChromeDriver//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://difc.globaltradingnetwork.com/web/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rifki");

		driver.findElement(By.id("form-input-live-p")).sendKeys("1234");
		driver.findElement(By.id("LoginButton")).click();
		System.out.println(
				"You have made {1} unsuccessful login attempt(s). Maximum retry attempts allowed for this account is 5. If 5 attempts are exceeded, then your account will be locked.\r\n +");

	}

}
