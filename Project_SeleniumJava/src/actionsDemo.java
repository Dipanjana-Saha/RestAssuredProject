import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000L);
		//Actions classes in selenium
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		//writing the text in upper case 2)double clicking on the entire text to select it
		a.moveToElement(driver.findElement(By.className("Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Moves to specific elements 2)contextClick()is use to right click on the selected item
		a.moveToElement(move).contextClick().build().perform();
	
	}

}
