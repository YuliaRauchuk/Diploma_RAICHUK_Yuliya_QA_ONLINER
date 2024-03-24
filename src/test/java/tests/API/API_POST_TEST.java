package tests.API;

import io.qameta.allure.Attachment;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;


@Log4j2
public class API_POST_TEST {

    public static final String URL_POST = "https://catalog.onliner.by/sdapi/cart.api/detached-cart/add";
    @Attachment
    @Test
    public void verifyPostRequest() throws IOException, InterruptedException {

        given()
                .header("Content-Type", "application/json")
                .body("{\"position_id\":\"20693:3973834001\",\"product_id\":\"3973834\",\"product_key\":\"tvq255\",\"shop_id\":\"20693\",\"quantity\":\"1\"}")
                .when()
                .log().all()
                .post(URL_POST)
                .then()
                .log().all()
                .statusCode(200);
    }
}