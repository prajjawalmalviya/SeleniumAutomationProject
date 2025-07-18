package ThePrimStep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(table).build().perform();

		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Total row =" + row.size());

		List<WebElement> cell = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		System.out.println("Total Cell =" + cell.size());

		for(int i=2; i<row.size(); i++) {
			for(int j=1; j<cell.size(); j++) {
				String data = table.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
			
				System.out.print(data  +"   |  ");
			}
			System.out.println();
			
		}

		driver.quit();

	}

}
