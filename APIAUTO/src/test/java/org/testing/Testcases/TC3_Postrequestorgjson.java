package org.testing.Testcases;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC3_Postrequestorgjson 
{

	public static void main(String[] args) 
	{
		JSONObject inner1=new JSONObject();
		inner1.put("sectr","23");
		inner1.put("Wardno.", "35");
		inner1.put("Dist", "Bhandara");
		
		JSONObject inner2=new JSONObject();
		inner2.put("sectr","23");
		inner2.put("Wardno.", "35");
		inner2.put("Dist", "Bhandara");
		
		JSONArray outerarray=new JSONArray();
		outerarray.put(0, inner1);
		outerarray.put(1, inner2);
		
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Nilesh");
		outer.put("Lastname", "Bisne");
		outer.put("designation", "TL");
		outer.put("Adress", outerarray);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post(" http://localhost:3000/APIStudents");
		
		System.out.println("status code is");
		System.out.println(res.statusCode());
	}
	

}
