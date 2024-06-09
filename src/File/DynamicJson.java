package File;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DynamicJson {
	
	
	/*@Test(dataProvider="getData")
	public void addBook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String Response=given().header("contentType","appication/json")
		.body(Payload.addBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200)
		 .extract().response().asString();
		
		System.out.println(Response);
		
		JsonPath js=ReusbaleMethod.rawToJson(Response);
		System.out.println(js.getString("Msg"));
		System.out.println(js.getString("ID"));
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] ob=new Object[2][2];
		
		ob[0][0]="ABC3";
		ob[0][1]="103";
		ob[1][0]="ABC4";
		ob[1][1]="104";
		
		return ob;
	}
	
	*/
	
	
	 
	/* @Test
	public void deleteBook()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String Response=given().queryParam("ID","ABC4104").header("Content-Type","application/json")
		.body("{\r\n"
				+ " \r\n"
				+ "\"ID\" : \"ABC4104\"\r\n"
				+ " \r\n"
				+ "} ")
		.when().post("Library/DeleteBook.php")
		
		.then().assertThat().statusCode(200).body("msg ",equalTo("book is successfully deleted"))
		 .extract().response().asString();
		
		System.out.println(Response);*/
		
		/*given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.when().post("maps/api/place/delete/json")
		.then().log().all().assertThat().statusCode(200);}*/
		
	
	@Test
	public void getBookData()
	{
		RestAssured.baseURI="http://216.10.245.166/";
		String Response=given().queryParam("ID","ABC4104")
		
		.when().get("Library/GetBook.php")
		
		.then().assertThat().statusCode(200)
		 .extract().response().asString();
		
		System.out.println("Hello" +Response);
	}
	
		
	
}

