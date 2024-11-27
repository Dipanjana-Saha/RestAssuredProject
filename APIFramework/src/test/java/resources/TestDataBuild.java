package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
    public AddPlace addPlacePayload(String name,String language,String address) {
    	
    	//serailization concept used
    	//reusable test datas
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress(address);
        p.setLanguage(language);
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsites("https://rahulshettyacademy.com");
        p.setName(name);
        
        // Create a list for the types and set it in the AddPlace instance
        List<String> myList = new ArrayList<>();
        myList.add("shoe park");
        myList.add("shop");
        p.setTypes(myList);
        
        // Create a Location instance and set it in the AddPlace instance
        Location loc = new Location();
        loc.setLat(-38.383494);
        loc.setLng(33.427362);
        p.setLocation(loc);
        
        return p;
    }
    public String deletePlacePayload(String placeId) {
    	return "{\r\n   \"place_id\":\""+placeId+"\"\r\n}";
    }
}

