package File;

import io.restassured.path.json.JsonPath;

public class ReusbaleMethod {
	
	public static JsonPath rawToJson(String response)
	{
		
		JsonPath js=new JsonPath(response);
		return js;
	}

}
