package APITesting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RA_Day6 {

    //@Test(priority = 1)
    public void jsonSchemaValidation() {
        given()
                .when().get("path of the API")
                .then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("pathofschemafilelocation"));

    }

    //@Test(priority = 2)
    public void xmlSchemaValidation() {
        given()
                .when().get("http://restapi.adequateshop.com/api/Traveler")
                .then().assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("C:\\Users\\sures\\Desktop\\Traverlers.xsd"));

    }

    // Pojo -> Serialize--> JSON Object -- De-Seralize ----> POjo

    @Test(priority = 3)
    public void Serialization() throws JsonProcessingException {
        // Created java object using pojo class
        POJO_PostRequest_SettersGetters data = new POJO_PostRequest_SettersGetters();
        data.setName("Suresh Pasam");
        data.setLocation("hyd");
        data.setPhone("97035333394");
        String[] courseArr = {"Java", "Python"};
        data.setCourses(courseArr);
        // convert java object ---> json object ( Serialization)
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        System.out.println("java object to Json Object " + json);
    }

    @Test(priority = 4)
    public void Deserialization() throws JsonProcessingException {// json to pojo
        // Created java object using pojo class


        String jsonData = "{\n" +
                "  \"name\" : \"Suresh Pasam\",\n" +
                "  \"location\" : \"hyd\",\n" +
                "  \"phone\" : \"97035333394\",\n" +
                "  \"courses\" : [ \"Java\", \"Python\" ]\n" +
                "} ";

        // convert json data --> pojo object
        ObjectMapper objectMapper = new ObjectMapper();
        POJO_PostRequest_SettersGetters pojo = objectMapper.readValue(jsonData, POJO_PostRequest_SettersGetters.class);
        System.out.println("Name is:  " + pojo.getName());
        System.out.println("Location is:  " + pojo.getLocation());
        System.out.println("Mobile is:  " + pojo.getPhone());
        System.out.println("Get Courses is1:  " + pojo.getCourses()[0]);
        System.out.println("Get Courses is2:  " + pojo.getCourses()[1]);


    }
}
