package section03.main;
import java.util.Map;
import spark.Spark;
import com.fasterxml.jackson.databind.ObjectMapper;
import section03.backend.CharacterCounter;

public class Webservice {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
//        System.out.println("The program is running");
        Spark.get("/main", (req, res) -> {
            res.type("application/json");
            try{
                String value = req.queryMap("value").value();
                value = (value == null ? "" : value);
                Map<Character, Integer> map = CharacterCounter.counterCharacters(value);
                return mapper.writeValueAsString(map);
            } catch (Exception e) {
                e.printStackTrace();
                return "{}";
            }
        });
    }
}
