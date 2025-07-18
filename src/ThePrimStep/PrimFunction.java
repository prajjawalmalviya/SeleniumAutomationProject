package ThePrimStep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://eroomrent.in/");
		String url = driver.getCurrentUrl();
		System.out.println("URL- " + url);
		String title = driver.getTitle();
		System.out.println("Title- " + title);
		String pagesource = driver.getPageSource();
		System.out.println("PageSource " + pagesource);
		
		//To count All Links Which is present in the application  
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total Link= " + link.size());
		
		//To count header Links
		WebElement header = driver.findElement(By.tagName("nav"));
		int a = header.findElements(By.tagName("a")).size();
		System.out.println("Total Header Link= " + a);
		
		//To count footer Links
		WebElement footer = driver.findElement(By.tagName("footer"));
		int b = footer.findElements(By.tagName("a")).size();
		System.out.println("Total Footer Link= " + b);

		for (WebElement obj : link) {
			System.out.println("Present links on Webpage  = "+ obj);
		}

		 driver.quit();

	}

}
