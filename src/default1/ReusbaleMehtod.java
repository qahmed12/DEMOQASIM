package default1;

import io.restassured.path.json.JsonPath;

public class ReusbaleMehtod {
	
	public  static JsonPath rawToJson(String response)
	{
	   JsonPath js=new JsonPath(response);
	   return js;
	}

}
