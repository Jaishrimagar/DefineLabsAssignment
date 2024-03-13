package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTestScript {

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
		// click on dresses
		driver.findElement(By.xpath("(//a[@href='https://www.bhaane.com/dresses'])[2]")).click();
		// click on first dress
		driver.findElement(By.xpath("(//img[@class='img-normal lazy loaded'])[1]")).click();
		// click on addToBag
		driver.findElement(By.xpath("(//span[text()='add to bag'])[1]")).click();
		// click on GotoCart
		driver.findElement(By.xpath("//a[text()='go to cart']")).click();
		// click on cross button to remove the product from the cart
		driver.findElement(By.xpath("(//button[@class='btn btn-sm xs no-border'])[1]")).click();
		// close the browser
		driver.quit();
		
	}

}
