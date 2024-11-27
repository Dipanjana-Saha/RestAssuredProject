import static org.testng.Assert.assertEquals;

import files.payload;
import io.restassured.path.json.JsonPath;

public class CompleteJsonParse {

	public static void main(String[] args) {
		
		JsonPath js=new JsonPath(payload.CoursePrice());
		
		//1. Print No of courses returned by API
		int count=js.get("courses.size()");
		System.out.println(count);
		
		//2.Print Purchase Amount
		int totalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//3. Print Title of the first course
		//String Title=js.getString("courses.title[0]");
		String Title=js.get("courses[0].title");
		//String Title=js.get("courses[2].title");#RPA
		System.out.println(Title);
		
		//4. Print All course titles and their respective Prices(In Dynamic way)
		for(int i=0;i<count;i++) {
			System.out.println(js.get("courses["+i+"].title").toString());
			System.out.println(js.get("courses["+i+"].price").toString());
			//System.out.println(CoursePrices);
		}
		//5. Print no of copies sold by RPA Course
		for(int i=0;i<count;i++) {
			String courseTitle=js.get("courses["+i+"].title");
			if(courseTitle.equalsIgnoreCase("RPA")) {
				
				//copies sold
				int copies=js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;	
			}
		}
		

			}
		
	}


