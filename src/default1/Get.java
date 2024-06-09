package default1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123").queryParam("place_id","37f60a6bc2854f33cd23992655d49b7c").header("Content-Type","application/json")
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);

	}

}
