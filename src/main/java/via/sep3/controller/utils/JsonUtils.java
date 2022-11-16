package via.sep3.controller.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonUtils {
    public static String convertToJson(Object input) throws JsonProcessingException{
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.registerModule(new JavaTimeModule());

            String reportsAsJson;
            reportsAsJson = mapper.writeValueAsString(input);

            return reportsAsJson;
        } catch (JsonProcessingException e) {
            //We should talk about this
            throw new RuntimeException(e);
        }
    }
}
