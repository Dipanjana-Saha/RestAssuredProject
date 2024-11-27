package Dipanjana.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Dipanjana.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement userEmail =driver.findElement(By.id("userEmail"));
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
	//.ng-tns-c4-28.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	public  ProductCatalogue loginAplication(String email, String password) {
		userEmail.clear();
		userEmail.sendKeys(email);
		passwordEle.clear();
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue  productCatalogue=new ProductCatalogue(driver);
		return productCatalogue; 
	}
/*	public ProductCatalogue loginAplication(String email, String password) { //rahulsheety code mpdified

		userEmail.clear();

		userEmail.sendKeys(email);

		passwordEle.clear();

		passwordEle.sendKeys(password);

		submit.click();

		ProductCatalogue productCatalogue=new ProductCatalogue(driver);

		return productCatalogue;

		}*/
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

}
