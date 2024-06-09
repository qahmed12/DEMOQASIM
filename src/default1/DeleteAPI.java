package default1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class DeleteAPI {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.when().post("maps/api/place/delete/json")
		.then().log().all().assertThat().statusCode(200);
		


	}

}
