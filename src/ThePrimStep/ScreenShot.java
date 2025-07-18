package ThePrimStep;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException  {
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot sc =(TakesScreenshot) driver;
		File get =sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("D://ScreenFacebook.png");
		
		FileUtils.copyFile(get, destination);
		
		if(destination.createNewFile()) {
			System.out.println("File Created ="+destination.getName());
		}
		else {
			System.out.println("File already Exist");
		}

	}

}
