package com.talentech.jasonServer;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class localServerAPITest {
	
	@Test(enabled = false)
	public void simpleGet(){
		Response resp = given().
						when().
						get("http://localhost:3000/posts");
		System.out.println(resp.asString());
	}//end of simpleGet
	
	@Test (enabled = false)
	public void simplePost(){
		Response resp = given().
						body("{\"id\": \"2\","
								+ " \"title\":\"Super man\", "
								+ "\"author\":\"Mahbub\" }").
						when().
						contentType(ContentType.JSON).
						post("http://localhost:3000/posts");
		System.out.println(resp.asString());
						
	}
	
	@Test(enabled = false)
	public void simplePostObj(){
		bodyContent bc = new bodyContent();
		bc.setId("3");
		bc.setTitle("Spider Man");
		bc.setAuthor("Nivan");
		
		Response resp = given().
						body(bc).
						when().
						contentType(ContentType.JSON).
						post("http://localhost:3000/posts");
						
		System.out.println(resp.asString());
	}//end of simplePostObj
	
	@Test(enabled = false)
	public void simplePut(){
		
		bodyContent bc = new bodyContent();
		
		bc.setId("3");
		bc.setTitle("Amazing Spider Man");
		bc.setAuthor("Nivan");
		
		Response resp = given().
						body(bc).
						when().
						contentType(ContentType.JSON).
						put("http://localhost:3000/posts/3");
		System.out.println(resp.asString());
						
		
	}
	
	@Test(enabled = false)
	public void simplePatch(){
		
		bodyContent bc = new bodyContent();
		bc.setAuthor("Nivan Siddique");
		
		Response resp = given().
						body(bc).
						when().
						contentType(ContentType.JSON).
						patch("http://localhost:3000/posts/3");
		System.out.println(resp.asString());
						
		
	}
	
	@Test(enabled = true)
	public void simpleDelete(){
		Response resp = given().
						when().
						delete("http://localhost:3000/posts/3");
		System.out.println(resp.asString());
						
		
	}

}
