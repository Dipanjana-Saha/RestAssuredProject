package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeTest
	public void before() {
		System.out.println("I will execute 1st");
	}
	@Parameters({"URL", "APIKey/Username"})
	@Test
	public void Demo(String urlname, String key) {
		System.out.println("Hello");
		System.out.println(urlname); // printing the value which are stored in string

		System.out.println(key);
	}
	@Test
	public void Demo2() {
		System.out.println("Bye");
	}
	@AfterTest
	public void after() {
		System.out.println("I will execute last");
		
	}
}
