package org.testing.Testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_PostMethod 
{
   public static void main(String[] args) 
   {
	 Response res= 
	given()
	.contentType(ContentType.JSON)
	.when() 
	.post("http://localhost:3000/APIStudents");
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		
		System.out.println("Response data is ");
		System.out.println(res.asString());
	
   }
}
