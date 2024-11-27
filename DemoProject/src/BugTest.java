
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class BugTest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://dipanjanasaha1998.atlassian.net/";

        // Create a new issue
        Response output = given().log().all()
            .header("Content-Type", "application/json")
            .header("Authorization", "Basic ZGlwYW5qYW5hc2FoYTE5OThAZ21haWwuY29tOkFUQVRUM3hGZkdGME45TEVxTVFRM0ctNWdNOWRRZGdfWUJPYTREYWZiWTBoZUlUei1xRUd2Z1pWVGo1WGx6ZFJDbmoxTGZ2VlNRRUNrM2l3OXkxMHRNU0V4Q3hHVTIzUjVhQWcyeU5icDA1M29jdE5zOXNTQTNBX2d5TFZwUUF4TTdFcGRrMXZtNnpoVnJjWXZHRWZ1Yi11a3JyZkx3NWJUT3B0ekpObVJ4OGxscjFac3RBWm5EUT1DRTcyN0FENg==")
            .body("{\r\n"
                + "    \"fields\": {\r\n"
                + "       \"project\":\r\n"
                + "       {\r\n"
                + "          \"key\": \"SCRUM\"\r\n"
                + "       },\r\n"
                + "       \"summary\": \"automation\",\r\n"
                + "       \"issuetype\": {\r\n"
                + "          \"name\": \"Bug\"\r\n"
                + "       }\r\n"
                + "   }\r\n"
                + "}")
            .post("rest/api/3/issue")
            .then().log().all()
            .assertThat().statusCode(201)
            .extract().response();

        // Extract the issue ID
        String createIssueResponse = output.asString();
        System.out.println("Create Issue Response: " + createIssueResponse);
        JsonPath js = new JsonPath(createIssueResponse);
        String ID = js.getString("id");
        System.out.println("Created Issue ID: " + ID);

        // Attach a file to the issue
        given().log().all()
            .header("Authorization", "Basic ZGlwYW5qYW5hc2FoYTE5OThAZ21haWwuY29tOkFUQVRUM3hGZkdGME45TEVxTVFRM0ctNWdNOWRRZGdfWUJPYTREYWZiWTBoZUlUei1xRUd2Z1pWVGo1WGx6ZFJDbmoxTGZ2VlNRRUNrM2l3OXkxMHRNU0V4Q3hHVTIzUjVhQWcyeU5icDA1M29jdE5zOXNTQTNBX2d5TFZwUUF4TTdFcGRrMXZtNnpoVnJjWXZHRWZ1Yi11a3JyZkx3NWJUT3B0ekpObVJ4OGxscjFac3RBWm5EUT1DRTcyN0FENg==")
            .header("X-Atlassian-Token", "no-check")
            .pathParam("key", ID)
            .multiPart("file", new File("C:\\Users\\Dipanjana Saha\\Pictures\\Camera Roll\\WIN_20240126_12_55_06_Pro.jpg"))
            .post("rest/api/3/issue/{key}/attachments")
            .then().log().all()
            .assertThat().statusCode(200);
        
      
        }
}

