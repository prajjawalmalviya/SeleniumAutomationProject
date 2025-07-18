package ThePrimStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jenkins.io/doc/book/installing/other/");

		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> handle = new ArrayList<String>();
		handle.addAll(window);
		

		
		

	}

}
