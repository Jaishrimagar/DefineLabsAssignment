package TestScripts;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestScript {

	public static void main(String[] args) throws InterruptedException {

		// Random class
		Random r = new Random();
		int no = r.nextInt(100);
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// launch the web application
		driver.get("https://www.bhaane.com/");
		// click on cross button
		driver.findElement(By.id("mdiv")).click();
		// click on account link
		driver.findElement(By.xpath("//li[text()='account']")).click();
		// click on signup
		driver.findElement(By.xpath("//div[text()='sign up >']")).click();
		// enter the first name
		driver.findElement(By.name("first_name")).sendKeys("jaishree");
		// enter the last name
		driver.findElement(By.name("last_name")).sendKeys("biradar");
		// enter the email
		driver.findElement(By.xpath("(//input[@name='email'])[3]")).sendKeys("jaishreemagar" + no + "@gmail.com");
		// enter the mobile no
		driver.findElement(By.name("mobile")).sendKeys("1234567899");
		// enter the password
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Jaishree@123");
		// click on submit
		driver.findElement(By.xpath("(//button[text()='submit'])[2]")).click();
		// close the browser
		driver.quit();

	}

}
