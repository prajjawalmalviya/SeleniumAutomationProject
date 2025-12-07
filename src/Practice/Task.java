//package ThePrimStep;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.interactions.Actions;
//
//public class Task extends SelectClassDropdown {
//
//	public static void main(String[] args) throws Exception {
//
//		Task obj = new Task();
//		obj.setup();
//		obj.SelectClassDropdown();
//		obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		WebElement  link = obj.driver.findElement(By.tagName("a"));
//		List<WebElement> links =link.findElements(By.tagName("a"));
//		obj.driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> window = obj.driver.getWindowHandles();		
//		List<String> handles = new ArrayList<String>();			
//		handles.addAll(window);
//
//		obj.driver.get("https://eroomrent.in/");
//
//		WebElement ele = obj.driver.findElement(By.linkText("FAQ"));
//		ele.click();
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		WebElement a = obj.driver.findElement(By.linkText("Contact Us"));
//		a.click();
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		WebElement b = obj.driver.findElement(By.partialLinkText("Rent"));
//		Actions ac = new Actions(obj.driver);
//		ac.moveToElement(b).perform();
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		obj.driver.navigate().to("https://eroomrent.in/reg.php");
//		obj.driver.navigate().back();
//		obj.driver.navigate().to("https://eroomrent.in/login.php");
//
//		WebElement d = obj.driver.findElement(By.partialLinkText("Broker-G"));
//		Actions ac2 = new Actions(obj.driver);
//		ac2.moveToElement(d).perform();
//
//		WebElement e = obj.driver.findElement(By.linkText("Register Here"));
//		e.click();
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		obj.driver.navigate().to("https://eroomrent.in/brokerlogin.php");
//
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		WebElement g = obj.driver.findElement(By.xpath("//a[text()='Owner-G']"));
//		Actions ac3 = new Actions(obj.driver);
//		ac3.moveToElement(g).perform();
//
//		WebElement h = obj.driver.findElement(By.linkText("Register Here"));
//		h.click();
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		obj.driver.navigate().to("https://eroomrent.in/ownerlogin.php");
//
//		obj.driver.navigate().back();
//		obj.driver.navigate().refresh();
//
//		WebElement j = obj.driver.findElement(By.linkText("About Us"));
//		j.click();
//
//		obj.driver.navigate().to("https://eroomrent.in/index.php");
//		obj.driver.navigate().refresh();
//
////		obj.driver.navigate().to("https://www.facebook.com/");
////		TakesScreenshot sc = (TakesScreenshot) obj.driver;
////		WebElement capture = obj.driver.findElement(By.xpath("//div[@class='_8esl']"));
////		File get = sc.getScreenshotAs(OutputType.FILE);
////		File destination = new File("D://Facebook.png");
////		FileUtils.copyFile(get, destination);
////
////		if (destination.createNewFile()) {
////			System.out.println("File Created =" + destination.getName());
////		} else {
////			System.out.println("File already Exist");
////		}
////		obj.driver.navigate().back();
////		obj.driver.navigate().refresh();
//		
//		
//		
//		
//
//	}
//
//}



package ThePrimStep;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class Task extends SelectClassDropdown {

    public static void main(String[] args) throws Exception {

        Task obj = new Task();
        obj.setup();
        obj.SelectClassDropdown();
        obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open Home page in original tab
        obj.driver.get("https://eroomrent.in/");

        // ========== OPEN "FAQ" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/faq.php");

        // ========== OPEN "Contact Us" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/contact.php");

        // ========== OPEN "Rent" dropdown (hover only, if needed) ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/");
        WebElement rentMenu = obj.driver.findElement(By.partialLinkText("Rent"));
        Actions action1 = new Actions(obj.driver);
        action1.moveToElement(rentMenu).perform();

        // ========== OPEN "Register" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/reg.php");

        // ========== OPEN "Login" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/login.php");

        // ========== OPEN "Broker-G" hover ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/");
        WebElement broker = obj.driver.findElement(By.partialLinkText("Broker-G"));
        Actions action2 = new Actions(obj.driver);
        action2.moveToElement(broker).perform();

        // ========== Open "Broker Register Here" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/reg.php");

        // ========== Open "Broker Login" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/brokerlogin.php");

        // ========== OPEN "Owner-G" hover ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/");
        WebElement owner = obj.driver.findElement(By.xpath("//a[text()='Owner-G']"));
        Actions action3 = new Actions(obj.driver);
        action3.moveToElement(owner).perform();

        // ========== Open "Owner Register Here" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/reg.php");

        // ========== Open "Owner Login" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/ownerlogin.php");

        // ========== OPEN "About Us" ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/about.php");

        // ========== RETURN TO HOME ==========
        obj.driver.switchTo().newWindow(WindowType.TAB);
        obj.driver.get("https://eroomrent.in/index.php");
    }
}
