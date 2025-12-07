package ThePrimStep;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/testrigor/testrigor-tutorial");
		// Count and print Header Links Only
		WebElement header = driver.findElement(By.tagName("header"));
		List<WebElement> a = header.findElements(By.tagName("a"));
		System.out.println("Total Header Links are= " + a.size());

		for (WebElement link : a) {
			System.out.println(link.getAttribute("href"));
		}
		// Count and print footer links only
		WebElement footer = driver.findElement(By.tagName("nav"));
		List<WebElement> b = footer.findElements(By.tagName("a"));
		System.out.println("Total Footer links are= " + b.size());

		for (WebElement obj : b) {
			System.out.println(obj.getAttribute("href"));
			
		}
		
		WebElement coloumn = driver.findElement(By.xpath("//body/footer/div[@class='container-fluid']/div[@class='row links-wrapper']/div[1]"));
		for(int i=1;i<coloumn.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
			
		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it  =	abc.iterator();
		
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		//driver.quit();

	}

	

}
