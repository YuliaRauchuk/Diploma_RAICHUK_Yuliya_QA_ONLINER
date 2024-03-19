package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;


public class getRequest {
    //public static final String URL_GET = "https://regres.in/";
  public static void main(String[] args) throws IOException, InterruptedException {
        Response response = RestAssured
                .given()
                .get("https://www.onliner.by")
                .andReturn();
                response.prettyPrint();

       System.out.println(response.statusCode());
       System.out.println(response.body());
    }
}
