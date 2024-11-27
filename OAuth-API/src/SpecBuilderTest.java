import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import POJO_demo.AddPlace;
import POJO_demo.Location;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilderTest {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//use set not get for serialization
		AddPlace p=new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsites("https://rahulshettyacademy.com");
		p.setName("Dipanjana");
		//we have array list so to make  ArrayList to list when we have to pass arrays of info
		//make obj of list "myList" and put in the setter 
		List<String> myList=new ArrayList<String>();
		p.setTypes(myList);
		myList.add("shoe park");
		myList.add("shop");
		
		
		//location wants Location class obj
		//1st we have to make a obj and then put the obj in the set location
		Location loc=new Location();
		p.setLocation(loc);
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123")
				.setContentType(ContentType.JSON).build();
		ResponseSpecification resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		
		
		RequestSpecification res=given().spec(req)
				//addPlace is our main class
				//simply pass the obj of java
				.body(p);
		
				Response response=res.when().post("/maps/api/place/add/json")
				.then().spec(resspec).extract().response();
		
		String responseString=response.asString();
		System.out.println(responseString);

	}

}
