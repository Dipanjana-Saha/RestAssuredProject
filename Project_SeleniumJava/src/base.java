import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

	//	addItems(driver, veggies);

	}

//	public static void addItems(WebDriver driver, String[] veggies)

	{

		//int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemNeededList = Arrays.asList(veggies);
			if (itemNeededList.contains(formatedName)) {
			//	j++;

//			if (name.contains("Cucumber")) {XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}we dont have to use this line as we are converting array to arraylist
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			//	if (j == veggies.length) {
				//	break;
			//	}

			}
		}
		// TODO Auto-generated method stub

	}

}
