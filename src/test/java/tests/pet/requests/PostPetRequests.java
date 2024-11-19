package tests.pet.requests;

import base.BaseTest;
import io.restassured.response.Response;
import tests.pet.payloads.AddNewPetPayloads;

import static io.restassured.RestAssured.given;
import static tests.pet.payloads.AddNewPetPayloads.AddNewPet;

public class PostPetRequests extends BaseTest {
    AddNewPetPayloads addNewPetPayloads =  new AddNewPetPayloads();
    public Response PostPet(int id, int idCategory, String nameCategory, String name, String urlPhoto, int idTag, String nameTag, String status){
        return
        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(AddNewPet(id,idCategory,nameCategory,name,urlPhoto,idTag,nameTag,status).toString())
                .when()
                .post("pet");
    }
}