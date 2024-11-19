package tests;

import base.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import suites.AllTests;
import tests.pet.requests.GetPetIdRequests;
import tests.pet.requests.PostPetRequests;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetPetIdTests extends BaseTest {
    GetPetIdRequests getpetidrequests = new GetPetIdRequests();
    static PostPetRequests postPetRequests = new PostPetRequests();

    @Test
    @Category(suites.AllTests.class)
    public void ValidaBuscaDePetPorIDComSucesso() {
        getpetidrequests.GetPetPorID(90)
                .then()
                .statusCode(200)
                .body("id", equalTo(90))
                .body("status", equalTo("pending"));
    }

    @Test
    @Category(AllTests.class)
    public void ValidaBuscadePetPorIDInvalido() {
        getpetidrequests.GetPetPorID(75163636)
                .then()
                .statusCode(404)
                .body("message", equalTo("Pet not found"));
    }

    @BeforeClass
    public static void CriaPet() {
        postPetRequests.PostPet(90, 90, "Gato", "Cachorro Teste", "teste.com", 90, "felinos", "pending")
                .then()
                .statusCode(200)
                .body("id", equalTo(90));
    }
}