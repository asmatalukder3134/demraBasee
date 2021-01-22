package demra;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
	
	RequestSpecification request;
	Response rs;
	public void rest() {
		RestAssured.baseURI="";
		 request=RestAssured.given();
		rs=request.request(Method.OPTIONS,"");
		
		
	}
	
	

}
