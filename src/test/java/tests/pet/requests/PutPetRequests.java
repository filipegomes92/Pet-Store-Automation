package tests.pet.requests;

import base.BaseTest;
import io.restassured.response.Response;
import tests.pet.payloads.AddNewPetPayloads;

import static io.restassured.RestAssured.given;

public class PutPetRequests extends BaseTest {


    public Response PutPet(int id, int idCategory, String nameCategory, String name, String urlPhoto, int idTag, String nameTag, String status) {
        return (Response)
                given()
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .body(AddNewPetPayloads.AddNewPet(id, idCategory, nameCategory, name, urlPhoto, idTag, nameTag, status).toString())
                        .when()
                        .put("pet");
    }
}