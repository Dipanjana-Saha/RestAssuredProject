package Dipanjana.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.annotations.Test;

import Dipanjana.TestComponents.BaseTest;
import Dipanjana.pageobjects.CartPage;
import Dipanjana.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups= {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException {

		// WebDriverManager.chromedriver().setup();//it is not getting invoked
		//String productName = "ZARA COAT 3";

		landingpage.loginAplication("dipanjanasaha1998@gmail", "Dipa#1998");
		Assert.assertEquals("Incorrect email or password.", landingpage.getErrorMessage());
		//driver.close();
		//Thread.sleep(5000L);

	}
	

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException 
	{
		/*String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingpage.loginAplication("dipanjanasaha1998@gmail.com", "Dipa#1998");
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);*/
		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingpage.loginAplication("rahulshetty@gmail.com", "Iamking@000");
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
	}

}
