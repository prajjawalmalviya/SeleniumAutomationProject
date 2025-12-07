package ThePrimStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoqa.com/dragabble");
		WebElement source = driver.findElement(By.id("dragBox"));
		WebElement target = driver.findElement(By.id("Ad.Plus-970x250-2"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", source);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	

	}

}
