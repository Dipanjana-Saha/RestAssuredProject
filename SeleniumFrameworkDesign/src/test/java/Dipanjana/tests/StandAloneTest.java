package Dipanjana.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Dipanjana.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();//it is not getting invoked
		String productName = "ZARA COAT 3";
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		LandingPage landingpage= new LandingPage(driver);
		driver.findElement(By.id("userEmail")).sendKeys("dipanjanasaha1998@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Dipa#1998");
		driver.findElement(By.id("login")).submit();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod= products.stream().filter(product-> 
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null); //very imp concept lamda
		prod.findElement(By.xpath("//div[@class='card-body']/button[2]")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating"))); or
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();
		
		List<WebElement> cartProducts=driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match =cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(true);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		Actions a= new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".ta-results")));
		driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		// Thankyou for the order. 
		String confirmMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
