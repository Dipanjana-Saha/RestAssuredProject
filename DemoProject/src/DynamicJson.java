

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReUsableMethods;
import files.payload;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void addBook(String isb,String aisle) throws IOException {
		RestAssured.baseURI="http://216.10.245.166";
		Response response=given().log().all().header("Content-Type","application/json")
		//.body(payload.Addbook("ajhavs","8363"))//single data given
		.body(payload.Addbook(isb,aisle))//multiple data provided by data provider
		
		.when()
		.post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response();
		String responseNew=response.asString();
		System.out.println(responseNew);
		JsonPath js=ReUsableMethods.rawToJson(responseNew);
		String id=js.get("ID");
		System.out.println(id);
		//deleteBook
		
	}
	/* @Test(dataProvider="BooksData", enabled=true)
	  public void f2(String isbn, String aisle) {
		
		  RestAssured.baseURI = "http://216.10.245.166";
		  
		  Response res=  given().body(BodyPost.getDeleteBody(isbn, aisle)).log().all().when().post("/Library/DeleteBook.php").then().log().all().extract().response();
		  System.out.println("Response starts " + res.asString() + " ends");
	 "C:\Users\Dipanjana Saha\OneDrive\addPlace.json"
	  }*/
	
	@DataProvider(name="BooksData")
	public Object[][] getData(){
		return new Object[][] {{"ojfwty","9765"},{"cwetee","4256"},{"okefect","5433"}};
	}
	

}
