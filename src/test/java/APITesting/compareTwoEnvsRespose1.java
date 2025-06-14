package APITesting;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import static io.restassured.RestAssured.given;

public class compareTwoEnvsRespose1 {


    public static void main(String[] args) throws Exception {
        // Set base URLs
        String qaBaseUrl = "https://reqres.in/api/users";
        String prodBaseUrl = "https://reqres.in/api/users/2";

        // API endpoint to compare
        String endpoint = "/users";

        // Get Responses
        String qaResponse = getApiResponse(qaBaseUrl );
        String prodResponse = getApiResponse(prodBaseUrl);

        // Compare Responses with Result
        JSONCompareResult result = JSONCompare.compareJSON(qaResponse, prodResponse, JSONCompareMode.STRICT);

        if (result.passed()) {
            System.out.println("✅ API responses MATCH!");
        } else {
            System.out.println("❌ API responses do NOT match!");
            System.out.println("--- MISSING / EXTRA / DIFFERENCES ---");
            System.out.println(result);
        }
    }

    private static String getApiResponse(String url) {
        Response response = given()
                .when()
                .get(url);

        return response.asString();
    }

}
