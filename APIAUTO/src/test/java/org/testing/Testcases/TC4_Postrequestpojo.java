package org.testing.Testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC4_Postrequestpojo 
{
	public static void main(String[] args) 
	{
		Addressinformation[] address = new Addressinformation[3];
		address[0]= new Addressinformation();
		address[0].setHouseno("23");
		address[0].setSector("Sector two");
		address[0].setType("Primary address");
		
		address[1]= new Addressinformation();
		address[1].setHouseno("23");
		address[1].setSector("Sector two");
		address[1].setType("Secondaary address");
	
		
		address[2]= new Addressinformation();
		address[2].setHouseno("23");
		address[2].setSector("Sector two");
		address[2].setType("Third address");
				
		
		BasicInformation obj = new BasicInformation();
		obj.setFirstname("Nilesh");
		obj.setLastname("Bisne");
		obj.setDesignation("Quality Engineer");
		obj.setAge("29");
		obj.setId("Nilu15");
		obj.setAddress(address);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("http://localhost:3000/APIStudents");
		
		System.out.println(res.asString());
		System.out.println("status code is");
		System.out.println(res.statusCode());
	}

}
