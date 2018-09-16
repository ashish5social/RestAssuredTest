package testSuite;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.*; 
import io.restassured.response.Response;


public class RestTest {

	@Test
	public void Test1() {
		
	   Response resp = RestAssured.get("https://reqres.in/api/users?page=2"); 

	   UserResult result = resp.getBody().as(UserResult.class);
	   User[] users = result.data; 
	   for(User u : users) {
		   System.out.println("user id: "+ u.id);
	   }
	   	
	}
	
}





