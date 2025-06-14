package APITesting;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class compareTwoEnvsRespose {


    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        String qaResponse = getApiResponse("https://reqres.in/api/users");
        String prodResponse = getApiResponse("https://reqres.in/api/users/2");

        JsonNode qaNode = mapper.readTree(qaResponse);
        JsonNode prodNode = mapper.readTree(prodResponse);
        JsonNode patch = getJsonNode(qaNode, prodNode);


        // JsonDiff is a utility that computes the difference between two JSON nodes.
        // You may need to include a library for JsonDiff, such as 'com.github.java-json-tools:json-patch'.

        if (patch.isEmpty()) {
            System.out.println("API responses MATCH!");
        } else {
            System.out.println("API responses do NOT match!");
            System.out.println("--- DIFF ---");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patch));
        }
    }

    private static JsonNode getJsonNode(JsonNode qaNode, JsonNode prodNode) {
        JsonNode patch = JsonDiff.asJson(qaNode, prodNode);
        return patch;
    }

    // Same as before
    private static String getApiResponse(String url) {
        Response response = given()
                .when()
                .get(url);

        return response.asString();
    }

}
