package APITesting;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestAssured {
    int id;

    @Test(priority = 1)
    public void getCall() {
        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("page", equalTo(2)).log().all();
        System.out.println("Successfully captured the response from the get call ");
    }

    @Test(priority = 2)
    public void createUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "suresh pasam");
        data.put("job", "Software Engineer");
        id = given().contentType("application/json").body(data)
                .when().post("https://reqres.in/api/users").jsonPath().getInt("id");
        //.then().statusCode(201).log().all();
       // Response s = given().contentType("application/json").body(data).when().post("https://reqres.in/api/users");
        System.out.println("Captured the id from the Post call " + id);
       // System.out.println("Captured the id from the Post call " + s.jsonPath().get());

    }

    @Test(priority = 3, dependsOnMethods = "createUser")
    public void updateUserDeatils() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "suresh");
        data.put("job", "S/W");
        given().contentType("application/json").body(data).when().put("https://reqres.in/api/users/" + id).then().statusCode(200).log().all();
        System.out.println("Captured the id from the put call ");

    }

    @Test(priority = 4)
    public void deleteUser() {
        when().delete("https://reqres.in/api/users/" + id).then().statusCode(204).log().all();
        System.out.println("Successfully deleted the user ");


    }
}

/*
Summary of the Day1:

API Testing with RestAssured

DAY 1:

RestAssured is an API/library through which we can automate RestApI

Pre-Requisites"
1. Java &Eclipse
2. Test NG
3. Maven

Dependencies:

rest-assured
json-path
json
gson
scribejava-apis
json-schema-validator
xml-schema-validator

http requests:  https://reqres.in/

get
post
put
delete

gherkin -key words

given() - This statment will pass the
content type, set cookies, add auto, add params, set headers info etc

when() -- after when statement only pass call
get,post, put, delete

then(): validation part for the then section
Validate status code, Extract Response, Extract headers and cookies, reponse boday

        Static imports:
        io.restassured.RestAssured.*
        io.restassured.matcher.RestAssuredMatchers.*
        org.hamcrest.Matchers.*


        given()
        .when()
        .then()

first parameter no need to pass the . first

        GET:
        https://reqres.in/api/users/2

        https://reqres.in/api/users?page=2

        pOST: https://reqres.in/api/users


        Payload:
        {
        "name": "morpheus",
        "job": "leader"
        }

        put: update:

        https://reqres.in/api/users/2

        {
        "name": "morpheus",
        "job": "zion resident"
        }

        Delete:

        https://reqres.in/api/users/2
        */

