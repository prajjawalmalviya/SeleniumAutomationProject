package ThePrimStep;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class NavigateAndAction extends RegistrationTutorialNinja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigateAndAction obj = new NavigateAndAction();
		obj.setup();
		obj.registerUser();

	
		obj.driver.manage().window().maximize();
		obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		obj.driver.navigate().to("https://www.facebook.com/");
		obj.driver.navigate().back();

		WebElement ele = obj.driver.findElement(By.linkText("Desktops"));
		Actions action = new Actions(obj.driver);
		action.moveToElement(ele).build().perform();

		WebElement ele1 = obj.driver.findElement(By.linkText("Laptops & Notebooks"));
		action.moveToElement(ele1).build().perform();

		WebElement ele2 = obj.driver.findElement(By.linkText("Components"));
		action.moveToElement(ele2).build().perform();

		WebElement ele3 = obj.driver.findElement(By.linkText("Tablets"));
		ele3.click();
		obj.driver.navigate().back();

		WebElement ele4 = obj.driver.findElement(By.linkText("Software"));
		ele4.click();
		obj.driver.navigate().back();

		WebElement ele5 = obj.driver.findElement(By.linkText("Phones & PDAs"));
		ele5.click();
		obj.driver.navigate().back();

		WebElement ele6 = obj.driver.findElement(By.linkText("Cameras"));
		ele6.click();
		obj.driver.navigate().back();

		WebElement ele7 = obj.driver.findElement(By.linkText("MP3 Players"));
		action.moveToElement(ele7).build().perform();
		obj.driver.quit();

	}

}
