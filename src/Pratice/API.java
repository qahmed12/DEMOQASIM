package Pratice;

import io.restassured.path.json.JsonPath;

public class API {
	
	public static String getData()
	{
		return "{\r\n"
				+ "  \"dashboard\": {\r\n"
				+ "   \"purchaseAmount\": 950,\r\n"
				+ "   \"website\": \"rahulshettyacademy.com\"\r\n"
				+ "   },\r\n"
				+ "\r\n"
				+ "\"courses\" : [\r\n"
				+ "   {\r\n"
				+ "   \"title\": \"selenium Python\",\r\n"
				+ "   \"price\": 50,\r\n"
				+ "   \"copies\": 6\r\n"
				+ "   },\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "   \"title\": \"cypress\",\r\n"
				+ "   \"price\": 40,\r\n"
				+ "   \"copies\": 4\r\n"
				+ "   },\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "   \"title\": \"RPA\",\r\n"
				+ "   \"price\": 45,\r\n"
				+ "   \"copies\":10\r\n"
				+ "   }\r\n"
				+ "]\r\n"
				+ "}";
	}

}
