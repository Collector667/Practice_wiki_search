import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.IOException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Unpars {



    public static void main(String[] args, String inputline) throws IOException {


//        Page page = new Gson().fromJson( inputline, Page.class);
//        System.out.println(page.title);
//        System.out.println(inputline);
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//        System.out.println(page.title);
//       ObjectMapper objectMapper = new ObjectMapper();
//       SearchInfo employee = new SearchInfo();
//       objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//       employee = objectMapper.readValue(inputline, SearchInfo.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonClass p = new JsonClass();
        JsonClass person = mapper.readValue(inputline, JsonClass.class);


        System.out.println(person);
    }
}

