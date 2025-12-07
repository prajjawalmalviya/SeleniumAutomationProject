package ThePrimStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	
	public static void main(String[] args) {
		

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li[1]/a"));
		String a= ele.getAttribute("title");
		String b = "Sign up for Facebook";
		
		if(a.equals(b)) {
			
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		

	}

}
