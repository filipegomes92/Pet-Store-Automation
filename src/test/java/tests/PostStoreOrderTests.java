package tests;

import base.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import suites.AllTests;
import tests.store.requests.PostStoreOrderRequests;

import static org.hamcrest.Matchers.equalTo;

public class PostStoreOrderTests extends BaseTest {
    PostStoreOrderRequests postStoreOrderRequests = new PostStoreOrderRequests();

    @Test
    @Category(suites.AllTests.class)
    public void ValidaPedidoCompraPetComSucesso() {
        postStoreOrderRequests
                .PostOrder()
                .then()
                .statusCode(200)
                .body("id", equalTo(20))
                .body("petId", equalTo(90));
    }

    @Test
    @Category(AllTests.class)
    public void ValidaPedidoComprainvalido() {
        postStoreOrderRequests
                .InvalidOrder()
                .then()
                .statusCode(400);
    }
}