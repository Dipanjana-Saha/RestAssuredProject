import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import POJO_demo.AddPlace;
import POJO_demo.Location;
import io.restassured.response.Response;

public class serializeTest {

	public static void main(String[] args) {
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
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		Response res=given().log().all().queryParam("key","qaclick123")
				//addPlace is our main class
				//simply pass the obj of java
				.body(p)
				.when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).extract().response();
		
		String responseString=res.asString();
		System.out.println(responseString);

	}

}
