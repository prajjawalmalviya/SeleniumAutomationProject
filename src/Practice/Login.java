package ThePrimStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement name = driver.findElement(By.id("inputUsername"));
		name.sendKeys("PRAJJAWAL");
		WebElement password = driver.findElement(By.name("inputPassword"));
		password.sendKeys("xyz@8827");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		WebElement button = driver.findElement(By.className("signInBtn"));
		button.click();
		WebElement erormsg = driver.findElement(By.className("error"));
		System.out.println(erormsg.getText());
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgotPassword.click();
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		fname.sendKeys("PRAJJAWAL MALVIYA");
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("prajjawalmalviya@gmail.com");
		WebElement cntct = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		cntct.sendKeys("7869116182");

		WebElement resertpass = driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"));
		resertpass.click();
		driver.findElement(By.xpath("//p[@class='infoMsg']"));
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();

		name.sendKeys("PRAJJAWAL");
		password.sendKeys("rahulshettyacademy");
		Thread.sleep(2000);

		button.click();

		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());

	}

}
