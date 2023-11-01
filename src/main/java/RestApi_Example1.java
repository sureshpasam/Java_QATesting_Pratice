

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class RestApi_Example1 {

	@SuppressWarnings("unused")
	@Test
	public void getDetails() {
		RestAssured.baseURI ="https://maps.googleapis.com";
		ResponseAwareMatcher<Response> additionalMatchers = null;
		RestAssured.given().param("location", "-33.8670522,151.1957362").
		param("radius", "500").param("key", "AIzaSyCI9MWIDgrP4P-GNAJrsn3eMN5RnmWxQfA").
	    when().get("/maps/api/place/nearbysearch/json").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	    body("results[0].geometry.location.lat", additionalMatchers);
		ObjectMapper map = new ObjectMapper();
		

	}

	/*RestAssured.baseURI ="http://ergast.com/api/f1/2017/circuits.json";
	RequestSpecification request =RestAssured.given();
	Response res = request.get();
	String b = res.getBody().asString();
	System.out.println("Body is---->"+b);
	JsonPath p = res.jsonPath();
	//System.out.println("Suresh"+p.getList("$['MRData'].['CircuitTable'].Circuits[1].circuitId"));
	List<String> lis = p.getList("MRData.CircuitTable.Circuits.circuitId");
	lis.forEach(l->System.out.println("C is ==>"+l));*/
	
	//==================================
	 /*JSONParser par = new JSONParser();
        try {
        	//Object obj = par.parse(new File("C:\\\\Users\\\\Nisum\\\\Desktop\\\\canvas.json"));
        	//Object ss = par.parse("C:\\Users\\Nisum\\Desktop\\canvas.json");
        	Object ss1 =par.parse(new java.io.FileReader("C:\\Users\\Nisum\\\\Desktop\\canvas.json"));
        	//JSONObject jobj = (JSONObject) ss1;
        	System.out.println("fhdsad"+ss1);
        }catch (Exception e) {
        	// TODO: handle exception
        	System.out.println("Exception ::"+e.getMessage());
        }*/
	
}
