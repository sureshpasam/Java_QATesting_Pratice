package apiEndpoints;

// UserEndpoints
// Created for perform Create, Read, Update, Delete requests the user API.

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class UserEndPoints2 {

    static ResourceBundle getURL() {
        return ResourceBundle.getBundle("H:\\QA_Testing\\Java_QATesting_Pratice\\src\\resources\\Routes.properties");
        //return ResourceBundle.getBundle("H:\\QA_Testing\\Java_QATesting_Pratice\\src\\resources\\Routes.properties");
    }

    public static Response CreateUser(User payload) {

        String post_url = getURL().getString("post_url");
        Response response = given().contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()

                .post(post_url);

        return response;
    }

    public static Response readUser(String UserName) {
        String get_url = getURL().getString("get_url");
        Response response = given().pathParam("username", UserName)
                .when()
                .get(get_url);

        return response;
    }

    public static Response updateUser(String userName, User payload) {
        String update_url = getURL().getString("update_url");

        Response response = given().contentType(ContentType.JSON)
                .accept(ContentType.JSON).pathParam("username", userName)
                .body(payload)
                .when()
                .put(update_url);

        return response;
    }

    public static Response deleteUser(String userName) {
        String delete_url = getURL().getString("delete_url");

        Response response = given().pathParam("username", userName)
                .when()
                .delete(delete_url);

        return response;
    }
}
