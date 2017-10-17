package com.talentech.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;

public class simpleApiTest {
	
	@Test
	public void simpleApi(){
		Response resp = given().
						param("q", "Jackson Heights").
						param("appid", "a0844153b87b318b0896bed1166feb7c").
						when().
						get("http://api.openweathermap.org/data/2.5/weather");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(200, resp.getStatusCode());
	}

}
