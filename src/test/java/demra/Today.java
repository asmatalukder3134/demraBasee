package demra;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Today {
	public void rest() {
		RequestSpecification request=RestAssured.given();
		request.auth().preemptive().basic("", "");
		
		request.contentType(ContentType.JSON);
		Map map=new HashMap();
		map.put("uname", "asma");
		map.put("id", "234");
		map.put("add", "nnnn");
		
		request.body(map.toString());
		Response res=request.post("url");
		
		res.getStatusCode();
		JsonPath jsonpath=res.jsonPath();
		jsonpath.getString("");
		jsonpath.get("");
		String contentEndCodding=res.getHeader("content end codding");
		
		
		
		
		
		
		
		
		Response rs=request.get("url");
		int i=rs.getStatusCode();
		
		
		
		
		if(i==200) {
			System.out.println("we are same"); 
			
		}
		Assert.assertEquals(200, i);{
			System.out.println("we are equal");
		}
		
		
		rs.getBody().asString();
		rs.getHeaders();
		Map<String,String> c=rs.getCookies();
		Cookies co=rs.getDetailedCookies();
		
		for(Cookie coo:co) {
			String cname=coo.getName();
			
			
		}
		
		
	}

}
