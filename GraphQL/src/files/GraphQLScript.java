package files;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
public class GraphQLScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//8125
		int characterId=8125;
		String response=given().log().all().header("content-type:","application/json")
		.body("{\"query\":\"query($characterId: Int!, $episodeId: Int!) {\\n  character(characterId: $characterId) {\\n    name\\n    gender\\n    status\\n    id\\n  }\\n  location(locationId: 8) {\\n    name\\n    dimension\\n  }\\n  episode(episodeId: $episodeId) {\\n    name\\n    air_date\\n    episode\\n  }\\n  characters(filters: {name: \\\"Rahul\\\"}) {\\n    info {\\n      count\\n    }\\n    result {\\n      name\\n      type\\n    }\\n  }\\n}\\n\",\"variables\":{\"characterId\":"+characterId+",\"episodeId\":1}}")
		.when().post("https://rahulshettyacademy.com/gq/graphql")
		.then().extract().response().asString();
		
		System.out.println(response);
		JsonPath js= new JsonPath(response);
		String characterName=js.getString("data.character.name");
		Assert.assertEquals(characterName, "Atanu");
		
		//mutation
		String newCharacter="Atanu";
		String mutationResponse=given().log().all().header("content-type:","application/json")
				.body("{\"query\":\"mutation($locationName:String!,$characterName:String!) {\\n  createLocation(location: {name: $locationName, type: \\\"Southzone\\\", dimension: \\\"234.65\\\"}) {\\n    id\\n  }\\n  createCharacter(character:{name:$characterName,type:\\\"Indian\\\",status:\\\"single\\\",species:\\\"human\\\",gender:\\\"female\\\",image:\\\"nice\\\",originId:12374,locationId: 12374})\\n  {\\n    id\\n  }\\n  \\n  deleteLocations(locationIds: [12379,14]){\\n    locationsDeleted\\n    \\n  }\\n  \\n}\\n\",\"variables\":{\"locationName\":\"Japan\",\"characterName\":\""+newCharacter+"\"}}")
				.when().post("https://rahulshettyacademy.com/gq/graphql")
				.then().extract().response().asString();
				
				System.out.println(mutationResponse);
				}

}
