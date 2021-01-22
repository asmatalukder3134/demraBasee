package demra;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class Basee {
	public void restTest() {
		RestAssured.baseURI="";
		RequestSpecification request=RestAssured.given();
		request.request(Method.OPTIONS);
	}

}
