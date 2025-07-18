package ThePrimStep;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://eroomrent.in/");

		WebElement faq = driver.findElement(By.partialLinkText("FAQ"));
		System.out.println(faq.getText());
		faq.click();
		

		driver.findElement(By.partialLinkText("Contact Us")).click();

		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("PRAJJAWAL");

	}

}
