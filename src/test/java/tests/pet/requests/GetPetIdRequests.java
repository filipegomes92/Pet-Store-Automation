package tests.pet.requests;

import base.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPetIdRequests extends BaseTest {

    public Response GetPetPorID(int id) {
        return (Response)
                given()
                        .header("accept", "application/json")
                        .get("pet/" + id);
    }
}