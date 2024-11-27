import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import java.util.Arrays;

import POJO_demo.Api;
import POJO_demo.GetCourse;
import POJO_demo.WebAutomation;
import groovy.transform.stc.POJO;
import io.restassured.path.json.JsonPath;

public class oAuthTest {

public static void main(String[] args) {
	String[] courseTitles= {"Selenium Webdriver Java","Cypress","Protractor"};

// TODO Auto-generated method stub

String response = given()
.formParams("client_id", "692183103107-" + "p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParams("grant_type", "client_credentials")
.formParams("scope", "trust").
when().log().all().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
System.out.println(response);

JsonPath js = new JsonPath(response);
String accessToken = js.getString("access_token");

GetCourse gc = given().queryParams("access_token", accessToken)
.when().log().all().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourse.class);
System.out.println(gc);
System.out.println(gc.getLinkedIn());
System.out.println(gc.getInstructor());
//give me the price if the course
List<Api> apiCourses=gc.getCourses().getApi();
for(int i=0;i<apiCourses.size();i++) {
	if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"));{
		System.out.println(apiCourses.get(i).getPrice());
	}
}
//get the courses names of webautomation 1st way
/*List<WebAutomation> webAutomationTitles=gc.getCourses().getWebAutomation();
for(int j=0;j<webAutomationTitles.size();j++) {
	String titles=webAutomationTitles.get(j).getCourseTitle();
	System.out.println(titles);
}*/
//get the courses names of webautomation 2nd way
ArrayList<String> a=new ArrayList<String>();
List<POJO_demo.WebAutomation> w=gc.getCourses().getWebAutomation();

for(int j=0;j<w.size();j++) {
	a.add(w.get(j).getCourseTitle());
}
//converting array to arrayList
List<String> expectedList = Arrays.asList(courseTitles);
Assert.assertTrue(a.equals(expectedList));


}

}





/*import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;


public class oAuthTest {


public static void main(String[] args) {


// TODO Auto-generated method stub


String response = given()
.formParams("client_id", "692183103107-" + "p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParams("grant_type", "client_credentials")
.formParams("scope", "trust").
when().log().all().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
System.out.println(response);


JsonPath js = new JsonPath(response);
String accessToken = js.getString("access_token");


String resp2 = given().log().all().queryParams("access_token", accessToken)
.when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();


System.out.println(resp2);


}


}*/
