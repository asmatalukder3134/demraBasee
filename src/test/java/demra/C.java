package demra;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class C {
	public void api() {
	RequestSpecification req=RestAssured.given();
	RequestSpecification request=req.auth().preemptive().basic("", "");
	request.contentType(ContentType.JSON);
	ValidatableResponse i=request.get("http://restapi.demoqa.com/utilities/weather/city/<City>").then().statusCode(200).log().all();
	//request.get("").then().statusCode(200).log().all();
	System.out.println("");
	
	
	Map map=new HashMap();
	map.put(1, "");
	
	request.body(map.toString());
	
	Response rs=request.post("");
	request.get("").then().statusCode(200).log().all();
	Cookies co=rs.getDetailedCookies();
	for(Cookie c:co) {
		c.getValue();
		c.getName();
		c.getMaxAge();
		c.getExpiryDate();
		c.hasExpiryDate();
	}
	
	
	
	
	rs.getHeader("content type").compareTo("");
	boolean b=rs.getHeader("server").contains("");
	rs.then().statusCode(200);
	Cookie co=rs.getDetailedCookie("");
	JsonPath j=new JsonPath("");
	String s=j.getString("");
	int g=j.getInt("");
	
	
}}
