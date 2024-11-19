package tests.pet.requests;

import base.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPetStatusRequests extends BaseTest {

    public Response GetpetBystatus(String status) {
        return (Response)
                given()
                        .header("accept", "application/json")
                        .when()
                        .get("pet/findByStatus?status=" + status);
    }
}