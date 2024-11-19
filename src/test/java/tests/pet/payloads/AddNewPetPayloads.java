package tests.pet.payloads;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.json.JSONObject;

@JsonDeserialize
public class AddNewPetPayloads {

    public static JSONObject AddNewPet(int id, int idCategory, String nameCategory, String name, String urlPhoto, int idTag, String nameTag, String status) {
        JSONObject payload = new JSONObject();
        JSONObject category = new JSONObject();
        JSONObject tags = new JSONObject();

        String[] photoUrls = {urlPhoto};
        category.put("id", idCategory);
        category.put("name", nameCategory);
        tags.put("id", idTag);
        tags.put("name", nameTag);
        JSONObject[] tagsArray = {tags};

        payload.put("id", id);
        payload.put("category", category);
        payload.put("name", name);
        payload.put("photoUrls", photoUrls);
        payload.put("tags", tagsArray);
        payload.put("status", status);

        return payload;
    }
}

