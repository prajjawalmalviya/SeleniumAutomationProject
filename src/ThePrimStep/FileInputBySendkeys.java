package ThePrimStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileInputBySendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement chooseFile = driver.findElement(By.id("multipleFilesInput"));
		Actions action = new Actions(driver);
		action.moveToElement(chooseFile).click().perform();

		String file = ("C:\\Users\\Admin\\Downloads\\Prajjawal_AutomationQA.pdf");
		chooseFile.sendKeys(file);

	}

}
