package com.talentech.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class simpleGetRespApi {
	
	@Test(enabled = false)
	public void getEntireResp(){
		Response resp = given().
					param("zip", "11377").
					param("appid", "a0844153b87b318b0896bed1166feb7c").
					when().
					get("http://api.openweathermap.org/data/2.5/weather");
		//System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		//System.out.println(resp.asString());
		
					
	}
	
	@Test (enabled = false)
	public void validateHumidity(){
		int humidity = given().
					param("zip", "11377").
					param("appid", "a0844153b87b318b0896bed1166feb7c").
					when().
					get("http://api.openweathermap.org/data/2.5/weather").
					then().
					contentType(ContentType.JSON).
					extract().
					path("main.humidity");
					
		if (humidity==57){
			System.out.println("The API Returns right humidity");
		}//end if
		else
		{
			System.out.println("The API Do Not Returns right humidity");
		}//end else		
	}
	
	@Test (enabled = true)
	public void localApi(){
		Response resp = given().
					when().
					get("http://localhost:3000/post");
		System.out.println(resp.asString());

	}//end of method

}
