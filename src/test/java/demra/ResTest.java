package demra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ResTest {
	@Test
	public void api() throws InterruptedException {
		RestAssured.baseURI="";
		RequestSpecification req=RestAssured.given();
		req.request(Method.GET,"/ccc");
		//RequestSpecification request=req.auth().preemptive().basic(" ","");
		
		
		Response rs=req.get("http://testsite.com/Callback?parameter=test");
		Thread.sleep(5000);
		System.out.println("status code is:"+" "+rs.getStatusCode());
        System.out.println("body is :"+" "+rs.getBody().asString());
        System.out.println(rs.getHeader("contentType"));
}
	
void vv() {
	RestAssured.baseURI="";
	RequestSpecification req=RestAssured.given();
	req.request(Method.POST,"");
	
}



}
