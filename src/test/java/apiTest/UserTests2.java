package apiTest;

import apiEndpoints.User;
import apiEndpoints.UserEndPoints2;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests2 {
    Faker faker;
    User userPayload;

    @BeforeClass
    public void setupData() {
        faker = new Faker();
        userPayload = new User();
        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5, 10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
    }

    @Test(priority = 1)
    public void testPostUser() {
        Response response = UserEndPoints2.CreateUser(userPayload);
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println("Successfully create the user ID is  " + this.userPayload.getId() + " User name is " + this.userPayload.getUsername());

    }

    @Test(priority = 2)
    public void testGetUserByName() {
        Response response = UserEndPoints2.readUser(this.userPayload.getUsername());
        response.then().log().all();
        response.statusCode();
        System.out.println("Successfully get user Information");

    }

    @Test(priority = 3)
    public void testUpdateUserByName() {
        // update data using payload

        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        Response response = UserEndPoints2.updateUser(this.userPayload.getUsername(), userPayload);
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println("Successfully Update the user ID is"+this.userPayload.getId());
        // Checking data after update

        Response responseAfterUpdate = UserEndPoints2.readUser(this.userPayload.getUsername());
        Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
        System.out.println("Successfully Update the user ID is"+this.userPayload.getId());

    }

    @Test(priority = 4)
    public void testDeleteUser() {
        Response response = UserEndPoints2.deleteUser(this.userPayload.getUsername());
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Successfully Deleted the user"+this.userPayload.getId());



    }


}
