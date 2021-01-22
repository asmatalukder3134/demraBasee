package demra;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class Homes extends Basee {
	public void login() {
		Response rs;
		restTest();
		RestAssured.baseURI = "";
		rs = request.request(Method.GET, "");
		String body = rs.getBody().asString();
		boolean b = body.contains("");
System.out.println(b);
		System.out.println("Body is:" + "" + body);
	}

	public void getheader() {
		String contenttype = rs.getHeader("contenttype");
		if (contenttype.contains("nnnnnnnn")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void id() {

	}
}
