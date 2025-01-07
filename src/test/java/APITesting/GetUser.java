package APITesting;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUser {
    @Test
    void test_getUser(ITestContext context) {
        int id = (int) context.getAttribute("user_id");
        String bearerToken = "";


        given().headers("Authorization", "Bearer " + bearerToken)
                .pathParam("id", id)
                .when().get("https://gorest.co.in/public/v2/users/{id}")
                .then().statusCode(200).log().all();

        System.out.println("Successfully get the user detailsBased on the Id " + id);

    }
}
