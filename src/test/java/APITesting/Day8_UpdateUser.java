package APITesting;

import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Day8_UpdateUser {
    @Test
    void test_UpdateUser(ITestContext context) {
        Faker faker = new Faker();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", faker.name().firstName());
        jsonObject.put("gender", "Female");
        jsonObject.put("email", faker.internet().emailAddress());
        jsonObject.put("status", "active");
        int id = (int) context.getAttribute("user_id");;
        String bearerToken = "8d12be1be3bb0ebb8219b46b196bb0c7c6538e63a8fc1c48288f0079718fdda9";
         given().headers("Authorization", "Bearer " + bearerToken)
                .contentType("application/json")
                .pathParam("id", id)
                .body(jsonObject.toString())
                .when().put("https://gorest.co.in/public/v2/users/{id}")
                .then().statusCode(200).log().all();

        System.out.println("Successfully Updated the user Based on the Id " + id);


    }
}
