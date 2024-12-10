package APITesting;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Day8_DeleteUser {
    @Test
    void test_DeleteUser(ITestContext context) {
        String bearerToken = "8d12be1be3bb0ebb8219b46b196bb0c7c6538e63a8fc1c48288f0079718fdda9";
        int id = (int) context.getAttribute("user_id");
        ;
        given().headers("Authorization", "Bearer " + bearerToken)
                .pathParam("id", id)
                .when().delete("https://gorest.co.in/public/v2/users/{id}")
                .then().statusCode(204).log().all();

        System.out.println("Successfully Delete the user Based on the Id " + id);

    }
}