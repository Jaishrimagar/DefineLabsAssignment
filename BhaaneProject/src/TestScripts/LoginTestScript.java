package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestScript {

	public static void main(String[] args) {

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// launch web application
		driver.get("https://www.bhaane.com/");
		// click on cross button
		driver.findElement(By.id("mdiv")).click();
		//click on account
		driver.findElement(By.xpath("//li[text()='account']")).click();
		//enter the email
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("jaishreemagar9@gmail.com");
		//enter the password
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Norman@123");
		//click on login
		driver.findElement(By.xpath("(//button[text()='submit'])[1]")).click();
		//close the browser
		driver.quit();

	}

}
