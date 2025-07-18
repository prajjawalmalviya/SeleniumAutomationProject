package ThePrimStep;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robotclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement chooseFile = driver.findElement(By.id("singleFileInput"));
		Actions action = new Actions(driver);
		action.moveToElement(chooseFile).click().perform();

		String file = ("C:\\Users\\Admin\\Downloads\\Prajjawal_AutomationQA.pdf");
		StringSelection f1 = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f1, null);

		Robot rb = new Robot();
		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
