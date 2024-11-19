package tests;

import base.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import suites.AllTests;
import tests.pet.requests.PutPetRequests;

import static org.hamcrest.CoreMatchers.equalTo;

public class PutPetTests extends BaseTest {

    PutPetRequests putpetrequests = new PutPetRequests();

    @Test
    @Category(AllTests.class)
    public void ValidaAlterarPetComSucesso() {
        putpetrequests.PutPet(90, 90, "gato", "FilipetesteIJ 9", "teste", 90, "teste", "pending")
                .then()
                .statusCode(200)
                .body("name", equalTo("FilipetesteIJ 9"));
    }
}