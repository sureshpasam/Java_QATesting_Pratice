package APITesting;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class RA_Day5 {
    //Approch 1
    @Test(priority = 1)
    public void testXMLParse() {
        given()
                .when().get("http://restapi.adequateshop.com/api/Traveler?page=1")
                .then().statusCode(200)
                //.header("content-type", "application/xml; charset=utf-8").log().all();

                .header("content-type", "application/xml; charset=utf-8")
                .body("TravelerinformationResponse.page", equalTo("1"))
                .body("TravelerinformationResponse.travelers.Travelerinformation[0].name", equalTo("Developer"));

    }

    //Approch 2
    @Test(priority = 2)
    public void testXMLParse2() {

        Response res = given().when().get("http://restapi.adequateshop.com/api/Traveler?page=1");

        Assert.assertEquals(res.getStatusCode(), 200, "Successfully the status code");
        Assert.assertEquals(res.header("content-type"), "application/xml; charset=utf-8", "Successfully verify the header validation");
        Assert.assertEquals(res.xmlPath().get("TravelerinformationResponse.page"), "1", "Successfully verify the body node value");
        Assert.assertEquals(res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name"), "Developer", "Successfully verify the body node value");


    }

    @Test(priority = 3)
    public void testXMLParse3() {
        Response response = given().when().get("http://restapi.adequateshop.com/api/Traveler?page=1");
        XmlPath xmlPath = new XmlPath(response.asString());
        List<String> list = xmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation");

        System.out.println("Size of the travalers " + list.size());
        Assert.assertEquals(list.size(), 10, "Size not equal");
        // verify the all traverlsers names
        List<String> list_names = xmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
        for (String name : list_names) {
            System.out.println("List of the travaler names " + name);
            if (name.equals("vano")) {
                Assert.assertEquals(name, "vano", "not equals the name ");
                System.out.println("Successfully verify the perticular name " + name);
            }

        }
    }
        @Test(priority = 4)
        public void testXMLParseSingleFileUpload() {
            File myfile = new File("location of file name");

            given().multiPart("file",myfile).contentType("multipart/form-data")
                .when().post("").then().statusCode(200).body("fileName",equalTo("Test1.txt")).log().all();
        }

    @Test(priority = 5)
    public void testXMLParseSinglemultiFileUpload() {
        File myfile = new File("location of file name");
        File myfile1 = new File("location of file name");
        File filesddd[] ={myfile,myfile1};
        given().multiPart("files",myfile)
                .multiPart("files",myfile1)
                .multiPart("files",filesddd)
                .contentType("multipart/form-data")
                .when().post("").then().statusCode(200).body("[0].fileName",equalTo("Test1.txt"))
                .body("[1].fileName",equalTo("Test2.txt"))
                .log().all();
    }
    @Test(priority = 6)
    public void testXMLParseFileDownload() {


        given()
                .when().get("pass the path api with file name").then().statusCode(200)
                .log().body();
    }



}
