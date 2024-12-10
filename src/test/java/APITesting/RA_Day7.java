package APITesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RA_Day7 {
    //@Test(priority = 1)
    public void testBasicAuthentication() {
        given().auth().basic("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200)
                .body("authenticated", equalTo(true)).log().all();
        System.out.println("Successfully authenticated for Basic ");
    }

    // @Test(priority = 2)
    public void testDigestAuthentication() {
        given().auth().digest("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200)
                .body("authenticated", equalTo(true)).log().all();
        System.out.println("Successfully authenticated for Digest ");
    }

    //@Test(priority = 3)
    public void testPreemtiveAuthentication() {
        given().auth().preemptive().basic("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200)
                .body("authenticated", equalTo(true)).log().all();
        System.out.println("Successfully authenticated for preemptive ");

    }

    //@Test(priority = 4)
    public void testBearerTokenAuthentication() {

        String bearerToken = "";
        given().headers("Accept", "application/vnd.github+json")
                .headers("Authorization", "Bearer " + bearerToken)
                .headers("X-GitHub-Api-Version", "2022-11-28")
                .when().get("https://api.github.com/user/repos")
                .then().statusCode(200).log().all();

        System.out.println("Successfully authenticated for Bearer Token ");


    }

    //@Test(priority = 5)
    public void testOAuth1Authentication() {
        given()
                .auth().oauth("", "", "", "")// This is for OAuth1.0 Authentication
                .when().get("")
                .then().statusCode(200).log().all();
        System.out.println("Successfully authenticated for Oauth1 Token ");
    }

   // @Test(priority = 6)
    public void testOAuth2Authentication() {
        given()
                .auth().oauth2("")// This is for OAuth1.0 Authentication
                .when().get("https://api.github.com/user/repos")
                .then().statusCode(200).log().all();
        System.out.println("Successfully authenticated for Oauth2 Token ");
    }

    //@Test(priority = 7)
    public void testAPIKeyAuthentication() {

        // Method 1

        /*
        given()
                .queryParam("", "")
                .when().get("")
                .then().statusCode(200).log().all();
        System.out.println("Successfully authenticated for Oauth2 Token ");
         */

        // Method 2

        given()
                .queryParam("", "")
                .pathParam("", "")
                .queryParam("", "")
                .queryParam("", "")
                .when().get()
                .then().log().all();

    }
}
