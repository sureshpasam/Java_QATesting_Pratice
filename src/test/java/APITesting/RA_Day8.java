package APITesting;

import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RA_Day8 {
    @Test
    void test_createUser(ITestContext context) {
        Faker faker = new Faker();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", faker.name().firstName());
        jsonObject.put("gender", "Male");
        jsonObject.put("email", faker.internet().emailAddress());
        jsonObject.put("status", "inactive");

        String bearerToken = "";
        int id = given().headers("Authorization", "Bearer " + bearerToken)
                .contentType("application/json")
                .body(jsonObject.toString())
                .when().post("https://gorest.co.in/public/v2/users")
                .jsonPath().getInt("id");


        System.out.println("Successfully get the ID values in the response " + id);
        context.setAttribute("user_id", id);// access the value in the test level
        //context.getSuite().setAttribute("user_id","id"); Access the value in the suite level

    }
}
