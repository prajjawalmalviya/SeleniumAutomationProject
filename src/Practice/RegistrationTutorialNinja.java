package ThePrimStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTutorialNinja {
	public WebDriver driver;

	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://tutorialsninja.com/demo/");
	}

	public void registerUser() {

		WebElement myAccount = driver.findElement(By.linkText("My Account"));
		myAccount.click();

		WebElement regist = driver.findElement(By.linkText("Register"));
		regist.click();

		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Mohit");

		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.sendKeys("Choudhary");

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("mohitchoudhary5854@gmai.com");

		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("7869116182");

		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Ram@1234");

		WebElement confirmPSWD = driver.findElement(By.id("input-confirm"));
		confirmPSWD.sendKeys("Ram@1234");

		WebElement radio = driver.findElement(By.xpath("//input[@value='0']"));
		radio.click();

		WebElement checkBox1 = driver.findElement(By.name("agree"));
		checkBox1.click();

		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		submitButton.click();
		

	}

}
