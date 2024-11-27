import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo_116 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the lements into list
		List<WebElement> list=driver.findElements(By.xpath("//td[1]"));
		//capture all text of webelements into new(orginal)list
		List<String> orginalList=list.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on original list step 3 --.original list
		List<String> sortedList=orginalList.stream().sorted().collect(Collectors.toList());
		//compare orginal list to sorted list
		Assert.assertTrue(orginalList.equals(sortedList));

	}

}
