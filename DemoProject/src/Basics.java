import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReUsableMethods;
import files.payload;

		// TODO Auto-generated method stub
		//Validate if Add Place API is working as expected
		//ADD A PLACE AND UPDATE THE PLACE WITH NEW ADDRESS.
		//add place>>>update place with new address>>get place to validate if the new address is present
				

public class Basics {
	 
	public static void main(String[] args) throws IOException {
 
		RestAssured.baseURI = "https://rahulshettyacademy.com";
 
		RestAssured.useRelaxedHTTPSValidation();
 
		Response output = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Dipanjana Saha\\OneDrive\\addPlace.json"))))
				/*("{\n" + "  \"location\": {\n" + "    \"lat\": -38.383494,\n" + "    \"lng\": 33.427362\n"
						+ "  },\n" + "  \"accuracy\": 50,\n" + "  \"name\": \"Frontline house\",\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\n" + "  \"types\": [\n"
						+ "    \"shoe park\",\n" + "    \"shop\"\n" + "  ],\n"
						+ "  \"website\": \"http://google.com\",\n" + "  \"language\": \"French-IN\"\n" + "}\n" + "")*/
				.when().post("/maps/api/place/add/json").then().log().all().extract().response();
				
		
		  System.out.println(output.asString());
		  JsonPath js = new JsonPath(output.asString());//for parsing json
		  String placeID=js.getString("place_id");
		  System.out.println(placeID);
		  
		  //update Place
		  String newAddress="Summer Walk,Africa";
		  given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{\r\n"
		  		+ "\"place_id\":\""+placeID+"\",\r\n"
		  		+ "\"address\":\""+newAddress+"\",\r\n"
		  		+ "\"key\":\"qaclick123\"\r\n"
		  		+ "}")
		  .when().put("/maps/api/place/update/json")
		  .then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"/*"Update address operation failed, looks like the data doesn't exists"*/));
		  
		  //Get Place
		Response getResponse= given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID)
		 .when().get("/maps/api/place/get/json")
		 .then().log().all().statusCode(200).extract().response();
		String getlocationResponse=getResponse.asString();
		System.out.println(getlocationResponse);
		
		JsonPath js1=ReUsableMethods.rawToJson(getlocationResponse);
		String actualAddress=js1.getString("address");
		System.out.println(actualAddress);
		//cucumber junit,testng
		Assert.assertEquals(actualAddress, newAddress);
		
	}
 
}
