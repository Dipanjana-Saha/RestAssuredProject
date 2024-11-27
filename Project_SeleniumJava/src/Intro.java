import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

//		firefox launcg----geckodriver
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dipanjana Saha\\Documents\\gekodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		edge lanuch-----edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dipanjana Saha\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		

		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
//		driver.quit();
//		System.out.println("dipanjana");
		
		// TODO Auto-generated method stub

	}

}
