package javaScriptExecutor;

import io.restassured.RestAssured;

public class APIUsingRestAssured {

	public static void main(String[] args) {

	int code=RestAssured.get("https://www.google.com/").statusCode();
    System.out.println(code);
		
	}

}
