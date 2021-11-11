package deserializer;

import com.google.gson.*;
import dtos.WikipediaArticleDTO;

import java.lang.reflect.Type;

public class WikipediaArticleDeserializer implements JsonDeserializer<WikipediaArticleDTO> {
    @Override
    public WikipediaArticleDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String title = jsonObject.get("title").getAsString();
        String description = jsonObject.get("description").getAsString();
        int pageid = jsonObject.get("pageid").getAsInt();
        String extract = jsonObject.get("extract").getAsString();
        String url = jsonObject.get("content_urls").getAsJsonObject().get("desktop").getAsJsonObject().get("page").getAsString();
        String thumbnail_source = jsonObject.get("thumbnail").getAsJsonObject().get("source").getAsString();
        return new WikipediaArticleDTO(title, description, pageid, extract, url, thumbnail_source);
    }
}
