package org.jacoco.test.report;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

public class AppTest {

	@Test
	public void testSample() {
		String requestPayLoad = "{	\"userName\":\"Mukileshwar\",	\"passwd\":\"testpass\"}";
		given()
        .contentType("application/json")
        .body(requestPayLoad)
        .when().post("http://localhost:8090/v1/testApp/login").then()
        .statusCode(200);
	}
}
