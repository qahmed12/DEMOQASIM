package default1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PutClass {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://rahulshettyacademy.com";
		 String str=given().log().all().queryParam("key","qaclick123").queryParam("place_id","37f60a6bc2854f33cd23992655d49b7c").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\"37f60a6bc2854f33cd23992655d49b7c\",\r\n"
				+ "\"address\":\"Zakir Nagar OKHLA New Delhi 110025\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		 
		 System.out.println(str);
		JsonPath js=new JsonPath(str);
		//System.out.println(js.getString(address));
		

	}

}
