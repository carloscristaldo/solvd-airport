package services.jaxb;

import bin.Airport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static javax.xml.bind.JAXBContext.newInstance;

public class JaxB {

    public static Airport unmarshalAirport(){

    try {
        File file = new File("src/main/resources/airport.xml");
        JAXBContext jaxbContext = newInstance(Airport.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Airport airport = (Airport) unmarshaller.unmarshal(file);


        return airport;
    } catch (JAXBException e) {
        e.printStackTrace();
    }
    return null;
}


    public static void marshalAirport(Airport airport){

        try {
            File file = new File("src/main/resources/airport.xml");
            JAXBContext jaxbContext = newInstance(Airport.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.marshal(airport, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
