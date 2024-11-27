/*package Dipanjana.tests;

public class submitordertest_copy {
	Code Below:-



	package rahulshettyacademy.SeleniumFrameworkDesign;



	import java.time.Duration;

	import java.util.List;



	import org.junit.Assert;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import rahulshettyacademy.pageobjects.CartPage;

	import rahulshettyacademy.pageobjects.CheckoutPage;

	import rahulshettyacademy.pageobjects.ConfirmationPage;

	import rahulshettyacademy.pageobjects.LandingPage;

	import rahulshettyacademy.pageobjects.ProductCatalogue;



	public class SubmitOrderTest {



	// Scenario is to find ZARA COAT 3 and click Add to cart


	public static void main(String[] args) throws InterruptedException {


	String productName = "ZARA COAT 3";

	WebDriverManager.chromedriver().setup();// ChromeDriver will be automatically downloaded based on Chrome browser

	// // version

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.manage().window().maximize();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	LandingPage landingPage = new LandingPage(driver);// Send the driver to Landing Page Class, and there create

	// constructor to catch it and initialise the class level

	// driver

	landingPage.goTo();// Open the URL in the Browser

	ProductCatalogue productCatalogue = landingPage.loginApplication("Godofautomation@gmail.com", "Automation$1");

	// Log into the apllication and we know after login we will land on

	// Productcatalogue Page

	List<WebElement> products = productCatalogue.getProductList();// get all the Products List

	productCatalogue.addProductToCart(productName);// add the product into the cart page

	CartPage cartPage = productCatalogue.goToCartPage(); // Clicking on cart button gives you CartPage object

	Boolean match = cartPage.VerifyProductDisplay(productName);

	Assert.assertTrue(match);

	CheckoutPage checkoutPage = cartPage.goToCheckout();// On clicking on Checkout button It gives you CheckoutPage

	// object

	checkoutPage.selectCountry("india");

	ConfirmationPage confirmationPage = checkoutPage.submitOrder();// It gives you ConfirmationPage Object

	String confirmMessage = confirmationPage.getConfirmationMessage();

	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	System.out.println("Test Case Passed");

	driver.close();

	}

	}

}*/
