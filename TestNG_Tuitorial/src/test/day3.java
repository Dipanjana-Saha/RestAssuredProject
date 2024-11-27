package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	

	@Test
	public void WebloginCarLoan() {
		System.out.println("webloginCar");
		
	}
	@BeforeMethod
	public void execute()
	{
		System.out.println("I will execute after each method");
	}
	@BeforeSuite
	public void before() {
		System.out.println("I will execute above all");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCar");
	}
	@Test(dataProvider="getData")
	public void MobileSignIn(String username ,String password) {
		System.out.println("MobileSignin");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(enabled=false)
	public void MobileSignOut() {
		System.out.println("MobileSignout");
	}
	@Test(dependsOnMethods= {"WebloginCarLoan","MobileLoginCarLoan"})
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICar");
	}
	@DataProvider
	public Object[][] getData() {
		
		//1st combiantion - username password - good credit history= row
				//2nd - username password  - no crdit history
				// 3rd - fraudelent credit history
				Object[][] data= new Object[3][2];
				//1st set 
				data[0][0]="firstsetusername";
				data[0][1]="firstpassword";
				//couloumns in the row are nothing but values for that particualar combination(row)
				
				//2nd set
				data[1][0]= "secondsetusername";
				data[1][1]= "secondpassword";
				
				//3rd set
				data[2][0]="thirdsetusername";
				data[2][1]="thirdpassword";
				return data;

	}

}
