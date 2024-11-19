package tests;

import base.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import suites.AllTests;
import tests.pet.requests.GetPetStatusRequests;

import static org.hamcrest.Matchers.greaterThan;

public class GetPetByFindStatusTests extends BaseTest {

    GetPetStatusRequests getPetStatusRequests = new GetPetStatusRequests();

    @Test
    @Category(AllTests.class)
    public void ValidaBuscaPetPorStatusPeding() {
        getPetStatusRequests.GetpetBystatus("pending")
                .then()
                .statusCode(200)
                .body("size", greaterThan(0));
    }
}