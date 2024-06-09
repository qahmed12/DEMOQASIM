package default1;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class Basics {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response1=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(json.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response1);
		JsonPath js=ReusbaleMehtod.rawToJson(response1);
		String place=js.getString("place_id");
		
		//Update
		
		String response2=given().log().all().queryParam("key","qaclick123").queryParam("place_id",place).header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+place+"\",\r\n"
				+ "\"address\":\"Zakir Nagar OKHLA New Delhi 110025\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated")).extract().response().asString();
		
		System.out.println(response2);
		
		//get details
		
		
		String response3=given().log().all().queryParam("key","qaclick123").queryParam("place_id",place)
		
		.when().get("maps/api/place/get/json")
		.then().statusCode(200).extract().response().asString();
		
		System.out.println(response3);
		
		 js=ReusbaleMehtod.rawToJson(response3);
		
		System.out.println(js.getString("address"));
		
		
		
		
		
		
		
		
		
		

	}

	
}
