package courier;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestAssureClient {

    protected final String URL = "https://qa-scooter.praktikum-services.ru/api/v1";
    protected final RequestSpecification reqSpec = given()
            .header("Content-Type", "application/json")
            .baseUri (URL);
}
