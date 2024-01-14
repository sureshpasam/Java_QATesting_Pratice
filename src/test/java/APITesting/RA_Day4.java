package APITesting;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RA_Day4 {


    @Test(priority = 1)
    public void parsingJsonResponseData() {
        // Approch 1 - this normal flow
        given().contentType("ContentType.json")
                .when().get("")
                .then().statusCode(200).header("Content-type", "application/json; charset=utf-8")
                .body("book[3].title", equalTo("Rich DAD"))
                .body("book[3].author", equalTo("suresh pasam"))
                .body("book[3].price", equalTo("500"));


        // Approch 2 -- i fwe want validate the more validation in the reponse
        // Performing the validations using the response - get the response and perfrome the validations

        Response response = given().contentType("ContentType.json")
                .when().get("");

        Assert.assertEquals(response.getStatusCode(), 200);// validation1, headder and cookie validations
        Assert.assertEquals(response.getBody().jsonPath().get("book[3].title"), "Rich DAD");// validation1, headder and cookie validations

    }

    @Test(priority = 2)
    public void testResponseValidation() {
        Boolean status = false;

        Response response = given().contentType("ContentType.json")
                .when().get("");
        JSONObject jsonObject = new JSONObject(response.toString());// convert to response to JSOn object type

        for (int i = 0; i < jsonObject.getJSONArray("book").length() - 1; i++) {
            String title = jsonObject.getJSONArray("book").getJSONObject(i).getString("title");
            String author = jsonObject.getJSONArray("book").getJSONObject(i).get("author").toString();
            String price = jsonObject.getJSONArray("book").getJSONObject(i).get("price").toString();

            if (title.equals("Rich DAD")) {
                status = true;
                break;


            }
            System.out.println("Book is found");

        }
        //Assert.assertEquals(status, true);// validation1, headder and cookie validations

// validate the total price of books
        double totalPrice = 0;

        for (int i = 0; i < jsonObject.getJSONArray("book").length() - 1; i++) {
            String price = jsonObject.getJSONArray("book").getJSONObject(i).get("price").toString();

            totalPrice = totalPrice + Double.parseDouble(price);
        }
        System.out.println("Print the total price" + totalPrice);
        Assert.assertEquals(totalPrice, 1500);// validation1, headder and cookie validations


    }
}



/*
{
"store":{
"book":[
{
"author":"Suresh Pasam",
"category":"Reference",
"price":500,
"title":"Rich DAD"

},
{
"author":"Suresh Pasam",
"category":"Reference",
"price":500,
"title":"Rich DAD"

},
{
"author":"Suresh Pasam",
"category":"Reference",
"price":500,
"title":"Rich DAD"

}

]
}
}
 */
