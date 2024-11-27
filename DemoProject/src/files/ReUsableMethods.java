package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReUsableMethods {
	
	public static JsonPath rawToJson(String getResponse) {
		
		JsonPath js1=new JsonPath(getResponse);
		return js1;
	}


}
