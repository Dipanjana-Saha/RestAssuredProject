package test;

import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebloginHomeLoan() {
		System.out.println("webloginhome");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHome");
	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHome");
	}

}