package Pratice;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class ParsingComplexJSON {

	public static void main(String[] args) {
		
		int i=0;
		JsonPath js=new JsonPath(API.getData());
		
		//courses size
		System.out.println(js.getInt("courses.size()"));
		
		//print purchase amount
		
		System.out.println(js.getInt("dashboard.purchaseAmount"));
		
		
		//title of first course
		System.out.println(js.getString("courses[0].title"));
		
		// print all the course title and their prices 
		
		
		for(i=0;i<js.getInt("courses.size()");i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
			System.out.println(js.getInt("courses["+i+"].price"));
		}
		
		//print no. of copies sold by RPA Course
		
		System.out.println(js.getString("courses[2].title"));
		System.out.println(js.getInt("courses[2].copies"));
		
		// verify sum of all course prices matches with Purchase Amount
		
		int sum=0;
		for(i=0;i<js.getInt("courses.size()");i++)
		{
			sum=sum+js.getInt("courses["+i+"].price");
			
		}
		
		System.out.println(sum);
		System.out.println(js.getInt("dashboard.purchaseAmount"));
		
		Assert.assertEquals(sum,js.getInt("dashboard.purchaseAmount"));
		
			
		
		
		
	}

}
