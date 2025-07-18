package ThePrimStep;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfSpecificPart {

	public static void main(String[] args) throws IOException {

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");

		TakesScreenshot sc = (TakesScreenshot) driver;

		WebElement ele = driver.findElement(By.xpath("//div[@class='_8esl']"));
		File get = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("D://Facebook.png");

		FileUtils.copyFile(get, destination);

	}

}
