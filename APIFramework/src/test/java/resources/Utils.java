package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	//reusable methods
	static RequestSpecification req;
	
	
	public RequestSpecification requestSpecifications() throws IOException {
		//loging all the req,response to a file
		if(req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		req=new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key","qaclick123")
				.setContentType(ContentType.JSON).build();
		return req;
		}
		return req;
	}
	
	public static String  getGlobalValue(String key) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dipanjana Saha\\eclipse-workspace\\APIFramework\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		

	}
	
	public String getJsonPath(Response response,String key) {
		
		String resp=response.asString();
	   JsonPath  js= new JsonPath(resp);
	   return js.get(key).toString();
	}
	

}

