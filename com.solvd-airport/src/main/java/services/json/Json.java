package services.json;

import bin.Airport;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Json {
    private final static Logger LOGGER = LogManager.getLogger(Json.class);

    public static void jsonService(File file){
        ObjectMapper om = new ObjectMapper();

        try{
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, Airport.class);
            List<Airport> players = om.readValue(file,type);
            LOGGER.info(players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
