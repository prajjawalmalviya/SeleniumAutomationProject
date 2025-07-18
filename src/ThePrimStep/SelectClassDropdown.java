package ThePrimStep;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {
	public WebDriver driver;

	public void setup() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void SelectClassDropdown() {

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		SelectClassDropdown obj = new SelectClassDropdown();

		driver.get("https://eroomrent.in/");

		WebElement ele1 = driver.findElement(By.id("cat"));
		Select sc1 = new Select(ele1);
		sc1.selectByVisibleText("Hostel");

		WebElement ele2 = driver.findElement(By.id("subcat"));
		Select sc2 = new Select(ele2);
		sc2.selectByIndex(1);

		WebElement ele3 = driver.findElement(By.id("location"));
		Select sc3 = new Select(ele3);

		List<WebElement> list = sc3.getOptions();

		for (int i = 1; i < list.size(); i++) {
			WebElement option = list.get(i);
			String location = option.getText().trim();


			if (!location.isEmpty() || location.length() > 0) {
				sc3.selectByIndex(i);
				System.out.println("Selected Location: " + location);
			}
		}
	}
}
