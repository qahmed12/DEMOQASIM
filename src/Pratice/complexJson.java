package Pratice;

import io.restassured.path.json.JsonPath;

public class complexJson {
	
	public  static JsonPath rawToJson()
	{
	   JsonPath js=new JsonPath(API.getData());
	   return js;
	}

}