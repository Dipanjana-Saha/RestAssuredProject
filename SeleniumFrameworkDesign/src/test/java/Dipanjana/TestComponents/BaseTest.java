package Dipanjana.TestComponents;

import org.testng.annotations.AfterMethod;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Dipanjana.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public LandingPage landingpage;

	public WebDriver initializeDriver() throws IOException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//Dipanjana//resources//GlobalData.properties");
		pro.load(fis);
		//String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :pro.getProperty("browser");
		String browserName = pro.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();}
		/*	ChromeOptions options=new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			if(browserName.contains("headless")){
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			//driver.manage().window().setSize(new Dimension(1440,900));
			driver.manage().window().setSize(new org.openqa.selenium.Dimension(1440, 990));


		} 
		/*	if (browserName.contains("headless")) {	
			WebDriverManager.chromedriver().setup();		
	                ChromeOptions options = new ChromeOptions();	
			options.addArguments("--headless");	
			driver = new ChromeDriver(options);
	//driver.manage().window().setSize(new Dimension(1440,990));      
	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(1440, 990));		
	}*/
	 
	else if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();		
	}
/*		else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
			// edge
		}*/

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		return driver;

	}
	//getJsonDataToMap
	public List<HashMap<String,String>> jsonDataToMap(String filePath) throws IOException {
		//read json to string
		String jsonContent=FileUtils.readFileToString(new File(filePath),
				StandardCharsets.UTF_8);
		//string to hashmap
		ObjectMapper mapper = new ObjectMapper();
		  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
	      });
		  return data;
	}
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	}

	@BeforeTest(alwaysRun=true)
	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();
		landingpage = new LandingPage(driver);
		landingpage.goTo();
		return landingpage;
	}
	
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
}
