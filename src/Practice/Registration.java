package ThePrimStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://eroomrent.in/reg.php");

		WebElement ele3 = driver.findElement(By.linkText("Register for rent"));
		ele3.click();
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.xpath("//input[@name='txtfullname']"));
		ele4.sendKeys("Prajjawal");

		WebElement ele5 = driver.findElement(By.id("txtmobile"));
		ele5.sendKeys("7869116182");

		WebElement ele6 = driver.findElement(By.id("txtpass"));
		ele6.sendKeys("Ram@1234");

		WebElement ele7 = driver.findElement(By.id("txtEmail"));
		ele7.sendKeys("prajjawalmalviya@gmail.com");

	}

}
