package tests.store.requests;

import base.BaseTest;
import io.restassured.response.Response;
import tests.store.payloads.StoreOrderPayloads;


import static io.restassured.RestAssured.given;
import static tests.store.payloads.StoreOrderPayloads.BodyStoreOrder;

public class PostStoreOrderRequests extends BaseTest {

    StoreOrderPayloads storeOrderPayloads = new StoreOrderPayloads();

    public Response PostOrder() {
        return (Response)
                given()
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .body(BodyStoreOrder(20, 90, 2, "2024-11-13T01:28:18.341+0000", "pending", true).toString())
                        .when()
                        .post("store/order");
    }

    public Response InvalidOrder() {
        return (Response)
                given()
                        .body("teste")
                        .when()
                        .post("store/order");
    }
}