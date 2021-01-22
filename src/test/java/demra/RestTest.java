package demra;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTest extends Base{
	public void valid() {
		
		rest();
		RestAssured.baseURI="http://testsite.com/Callback?parameter";
		request.request(Method.PUT, "/City");
		
		request.contentType(ContentType.JSON);
		
		String b=rs.getBody().asString();
		System.out.println("body:"+b);
	}
	
	public void statuscode() {
		int code=rs.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("we are equal");}

	public void contentType() {
		String content=rs.getHeader("content-type");
		Assert.assertEquals(content, "");
		System.out.println("we are equal");
		
	}
	public void contentEndcodding() {
		String content=rs.getHeader("contentEndcodding");
		Assert.assertEquals(content, "");
		System.out.println("we are equal");
	
}
	public void server() {
		String content=rs.getHeader("content-type");
		Assert.assertEquals(content, "");
		System.out.println("we are equal");

}}
