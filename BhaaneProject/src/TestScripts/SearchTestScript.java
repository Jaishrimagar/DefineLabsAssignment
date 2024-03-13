package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestScript {

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
		// click on search
		driver.findElement(By.xpath("//img[@class='ico trigger-search']")).click();
		// enter the product name
		driver.findElement(By.name("q")).sendKeys("shirt", Keys.ENTER);
		// close the browser
		driver.quit();
	}

}
