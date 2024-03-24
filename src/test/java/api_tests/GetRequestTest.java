package api_tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

@Log4j2
public class GetRequestTest {

    public static final String URL = "https://catalog.onliner.by/sdapi/kurs/api/bestrate?currency=USD&type=nbrb";

    @Test
    public void verifyPostRequest() throws IOException, InterruptedException {

        given()
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get(URL)
                .then()
                .log().all()
                .statusCode(200);
    }
}