package APITesting;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;


//https://reqres.in/api/users?page=2&id=5
public class RA_Day3_Quey_PathParam {
    // @Test(priority = 1)
    void testPathAndQueryParam() {
        given()
                .pathParam("myPath", "users") // Path param
                .queryParam("page", 2)//query param
                .queryParam("id", 5)
                .when()
                .get("https://reqres.in/api/{myPath}")
                .then().statusCode(200).log().all();

    }

    // @Test(priority = 2)
    void testCookies() {
        given()
                .when()
                .get("https://www.google.co.in/")
                .then().statusCode(200).cookie("AEC").log().all();


    }

    // @Test(priority = 3)
    void testAllCookies() {

        // single cookie validation if know the cookie name
         /*
        given().when().get("https://www.google.co.in/").then().statusCode(200).cookie("AEC");


          */

        // Get the all the cookies, store to map and retirive the cookie name and values
        Response response = given()
                .when()
                .get("https://www.google.co.in/");

        System.out.println("AEC cookie name single cookie name" + response.getCookie("AEC"));
        Map map = response.getCookies();
        System.out.println("All Cookies::: " + response.getCookies());
        System.out.println("All Cookies::: " + map);
        System.out.println("cookie value ::: " + map.get("1P_JAR"));

        Set s = map.keySet();
        for (Object o : s) {
            System.out.println("Cookie name is :" + o + "=" + map.get(o));
        }
    }

   // @Test(priority = 4)
    void testHeaderInfo() {

        /*
         // single headers validation if know the header name
        given()
                .when()
                .get("https://www.google.co.in/")
                .then()
                .header("Content-Type", "text/html; charset=ISO-8859-1")
                .header("Content-Encoding", "gzip")
                .and()
                .header("Server", "gws")
                .log().all();




        given()
                .when()
                .get("https://www.google.co.in/")
                .then()
                .header("Content-Type", "text/html; charset=ISO-8859-1")
                .header("Content-Encoding", "gzip")
                .and()
                .header("Server", "gws")
                .log().cookies();


        given()
                .when()
                .get("https://www.google.co.in/")
                .then()
                .header("Content-Type", "text/html; charset=ISO-8859-1")
                .header("Content-Encoding", "gzip")
                .and()
                .header("Server", "gws")
                .log().headers();
*/
// get the all header values and validate


        Response response = given()
                .when()
                .get("https://www.google.co.in/");

        System.out.println("Get the single header content: " + response.getHeader("Date"));

        Headers headers = response.getHeaders();

        System.out.println("Sizee:: " + headers.size());

        for (Header hd : headers) {

            System.out.println("Header Name : " + hd.getName() + " Header Value:: " + hd.getValue());
        }

    }

    @Test(priority = 4)
    public void testLogs() {
      //  given().when().get("https://www.google.co.in/").then().statusCode(200).log().all();// this print the all the information, cookis,header repose also

    //   given().when().get("https://www.google.co.in/").then().statusCode(200).log().body();// print only response
   //     given().when().get("https://www.google.co.in/").then().statusCode(200).log().cookies();// print only cookies
        given().when().get("https://www.google.co.in/").then().statusCode(200).log().headers();// print only response

    }
}

