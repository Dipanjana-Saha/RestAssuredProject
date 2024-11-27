package Dipanjana.stepDefinations;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Dipanjana.TestComponents.BaseTest;
import Dipanjana.pageobjects.CartPage;
import Dipanjana.pageobjects.CheckoutPage;
import Dipanjana.pageobjects.ConfirmationPage;
import Dipanjana.pageobjects.LandingPage;
import Dipanjana.pageobjects.ProductCatalogue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImpl extends BaseTest{
	public LandingPage landingpage;
	public ProductCatalogue productCatalogue;
	public ConfirmationPage confirmationPage;
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page()throws IOException {
		landingpage=launchApplication();
	}
	 @Given("^Logged in with username (.+) and  password(.+)$")
	 public void logged_in_username_and_password(String username,String password){
		 productCatalogue = landingpage.loginAplication(username,password);
			
	 }
	@When("^I add product  (.+) to Cart$")
	public void i_add_product_to_cart(String productName)throws InterruptedException {
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
	}
	@When("^Checkout (.+) and submit the order$")
	public void checkout_submit_the_order(String productName) {
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		confirmationPage = checkoutPage.submitOrder();
	}
	//Then "THANKYOU FOR THE ORDER." message is displayed on confirmation page
	@Then("{string} message is displayed on confirmation page")
	public void message_displayed_confirmationPage(String string) {
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
	}
	 @Then("^\"([^\"]*)\" message is displayed$")
	    public void something_message_is_displayed(String strArg1) throws Throwable {
	   
	    	Assert.assertEquals(strArg1, landingpage.getErrorMessage());
	    	driver.close();
	    }	


}