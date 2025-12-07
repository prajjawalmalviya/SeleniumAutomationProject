package ThePrimStep;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> window = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();		
		handles.addAll(window);*/
		
		driver.get("https://www.facebook.com/");		
		System.out.println("First Tab ="+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		System.out.println("Second Tab ="+driver.getTitle());
		
		Set<String> window = driver.getWindowHandles();		
		List<String> handles = new ArrayList<String>();	
		
		handles.addAll(window);
		
		driver.quit();

		
		
		
				
		
		
		
	}

}
