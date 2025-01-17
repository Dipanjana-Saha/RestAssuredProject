import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		//WINDOW TRAVERSING PARENT TO CHILD AND VISE VERSA 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipanjana Saha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		//how to move from parent to child window
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator(); //[parentid,childid,subchildid]
		String parentId =it.next();//[parentID]
		String childId=it.next();//[childid]
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailID= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
	}

}
