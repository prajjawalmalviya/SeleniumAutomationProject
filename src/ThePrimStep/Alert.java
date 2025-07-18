package ThePrimStep;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		
		WebElement a= driver.findElement(By.id("name"));
		a.sendKeys("Nikhil");
		Thread.sleep(3000);		
		WebElement ele = driver.findElement(By.id("alertbtn"));
		ele.click();
	
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
