package APITesting;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RA_Day2 {

    // First approch
    @Test(priority = 1)
    void testPostUsingHashMapApproch() {
        HashMap data = new HashMap<>();
        data.put("name", "suresh");
        data.put("location", "hyd");
        data.put("phone", "9703533390");
        String courseArr[] = {"Java", "Python"};
        data.put("courses", courseArr);

        given().contentType("application/json").body(data)
                .when().post("")
                .then().statusCode(201).body("name", equalTo("suresh"))
                .body("location", equalTo("hyd"))
                .body("phone", equalTo("9703533390"))
                .body("courses[0]", equalTo("Java"))
                .body("courses[1]", equalTo("Python"))
                .header("content-type", "application/json; charset=utf-8")
                .log().all();

    }

    @Test(priority = 2)
    public void deleteUser() {
        when().delete("https://reqres.in/api/users/" + 5).then().statusCode(204).log().all();
        System.out.println("Successfully deleted the user ");


    }

    // second approch -
    @Test(priority = 3)
    void testPostUsingOrgJson() {
        JSONObject data1 = new JSONObject();
        data1.put("name", "suresh");
        data1.put("location", "hyd");
        data1.put("phone", "9703533390");
        String courseArr[] = {"Java", "Python"};
        data1.put("courses", courseArr);

        given().contentType("application/json").body(data1.toString())
                .when().post("")
                .then().statusCode(201).body("name", equalTo("suresh"))
                .body("location", equalTo("hyd"))
                .body("phone", equalTo("9703533390"))
                .body("courses[0]", equalTo("Java"))
                .body("courses[1]", equalTo("Python"))
                .header("content-type", "application/json; charset=utf-8")
                .log().all();

    }

    // Third approch -
    @Test(priority = 3)
    void testPostUsingPOJO() {
        POJO_PostRequest_SettersGetters data = new POJO_PostRequest_SettersGetters();
        data.setName("Suresh Pasam");
        data.setLocation("hyd");
        data.setPhone("97035333394");
        String courseArr[] = {"Java", "Python"};
        data.setCourses(courseArr);

        given().contentType("application/json").body(data)
                .when().post("")
                .then().statusCode(201).body("name", equalTo("suresh"))
                .body("location", equalTo("hyd"))
                .body("phone", equalTo("9703533390"))
                .body("courses[0]", equalTo("Java"))
                .body("courses[1]", equalTo("Python"))
                .header("content-type", "application/json; charset=utf-8")
                .log().all();

    }

    // Fouth approch External json file

    @Test(priority = 4)
    void testPostExternalJsonFiles() throws FileNotFoundException {
        File f = new File(".\\Body.json");
        FileReader fr = new FileReader(f);
        JSONTokener jt = new JSONTokener(fr);
        JSONObject data =new JSONObject(jt);
        given().contentType("application/json").body(data.toString())
                .when().post("")
                .then().statusCode(201).body("name", equalTo("suresh"))
                .body("location", equalTo("hyd"))
                .body("phone", equalTo("9703533390"))
                .body("courses[0]", equalTo("Java"))
                .body("courses[1]", equalTo("Python"))
                .header("content-type", "application/json; charset=utf-8")
                .log().all();

    }

}
/*
Day 2: API Testing | RestAssured | Creating Post Request Payloads in Multiple Ways

Post:
How many ways we create request body

1. Hashmap
2. using org.json
3. using POJO[Plain Old Java Object) - create separate class for this getter and setts
4. using external json file

-------------------
JSon-server ran with sample create students.json file

1. approch
2. using org.json  dependency
 */
