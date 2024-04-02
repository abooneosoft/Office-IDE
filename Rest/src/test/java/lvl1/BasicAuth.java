package lvl1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/* Pre- Requesites
 * import some static packages manually from rest assured website
 *  
 using-
  given() -> Content type, set cookies, add auth,add param, set headers info etc...
  when() -> get,put,post,delete requests
  then() -> validate status code, extract responses, extract cookies/headers&response body etc....
  
*/
public class BasicAuth {
	
	@Test
	void getUser() {
		given().auth().basic("postman", "password")
		
		.when().get("https://postman-echo.com/basic-auth")
		.then().statusCode(200).log().all();
		}

}
