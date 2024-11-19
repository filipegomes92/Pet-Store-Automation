package tests.store.payloads;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.json.JSONObject;

@JsonDeserialize
public class StoreOrderPayloads {

    public static JSONObject BodyStoreOrder(int id, int petid, int quantity, String shipDate, String status, boolean complete) {

        JSONObject payload = new JSONObject();

        payload.put("id", id);
        payload.put("petId", petid);
        payload.put("quantity", quantity);
        payload.put("shipDate", shipDate);
        payload.put("status", status);
        payload.put("complete", complete);
        return payload;
    }
}