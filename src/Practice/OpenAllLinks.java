package ThePrimStep;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAllLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://facebook.com/");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		Iterator it = link.iterator();

		ArrayList<String> allLink = new ArrayList<String>();
		int a = 0;
		int b = 0;

		for (int i = 0; i < link.size(); i++) {
			WebElement obj = (WebElement) link.get(i);
			String s = obj.getAttribute("href");
			if (s.equals(" ") || s.equals("#")) {
				a++;
			} else {
				b++;
			}
			allLink.add(s);
			System.out.println(s);
		}
		for (Object obj1 : allLink) {
			driver.navigate().to(obj1.toString());
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().refresh();
		}

		System.out.println("Total Link =" + link.size());
		System.out.println("Total working Link =" + b);
		System.out.println("Total Notworking Link =" + a);
		
		
		

	}

}
