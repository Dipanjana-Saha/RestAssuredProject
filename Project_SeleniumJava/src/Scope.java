import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// 1.Give me the count of links on the page
		// 2.count of the footer section

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		// TODO Auto-generated method stub
		// 3.
		WebElement coulmndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulmndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < coulmndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coulmndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(7000L);
		}
		// opens all the tab and take out the title of the page
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
