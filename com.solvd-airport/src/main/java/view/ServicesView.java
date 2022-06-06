package view;

import bin.Airport;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.implemented.AirportImpl;
import services.jaxb.JaxB;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServicesView {

    private final static Logger LOGGER = LogManager.getLogger(ServicesView.class);

    private static final String option1 = "1. JAXB";
    private static final String option2 = "2. IN PROGRESS";
    private static final String option3 = "3. IN PROGRESS";
    private static final String option4 = "4. (IN PROGRESS)";
    private static final String option5 = "5. (IN PROGRESS)";
    private static final String option6 = "6. Go Back";


    public void ServicesMenu(Connection conn){


        Scanner sc0 = new Scanner(System.in);
        boolean finish = false;
        int option;
        String name;
        String shortName;
        AirportImpl airportImpl = new AirportImpl(conn);
        Airport a = new Airport();


        while (!finish) {

            LOGGER.log(Level.OFF,option1);
            LOGGER.log(Level.OFF,option2);
            LOGGER.log(Level.OFF,option3);
            LOGGER.log(Level.OFF,option4);
            LOGGER.log(Level.OFF,option5);
            LOGGER.log(Level.OFF,option6);

            try {

                LOGGER.log(Level.OFF,"Select: ");
                option = sc0.nextInt();

                switch (option) {
                    case 1:
                        LOGGER.log(Level.OFF,"Enter Airport's id for searching: ");
                        LOGGER.log(Level.OFF,"Testing Jaxb (marshaling): ");

                        Airport temp = new Airport(30, "MINSK", "MNK");
                        JaxB jaxB = new JaxB();
                        JaxB.marshalAirport(temp);

                        LOGGER.log(Level.OFF,"Object marshaled... ");

                        Airport aux = null;

                        aux = JaxB.unmarshalAirport();

                        LOGGER.log(Level.OFF,"Object un marshaled... \n");

                        LOGGER.log(Level.INFO, aux.getIdAirport() + " " + aux.getName() + " " +aux.getShortName());

                        break;
                    case 2:
                        LOGGER.log(Level.OFF,"List all Airports:");
                        airportImpl.getAll();
                        break;
                    case 3:
                        LOGGER.log(Level.OFF,"Create Airport:");
                        LOGGER.log(Level.OFF,"Enter name:");
                        name = sc0.next();
                        //clear buffer
                        sc0.nextLine();
                        LOGGER.log(Level.OFF,"Enter short name:");
                        shortName = sc0.nextLine();
                        LOGGER.log(Level.OFF,name);
                        a.setName(name);
                        a.setShortName(shortName);
                        airportImpl.create(a);

                        break;
                    case 6:
                        finish = true;
                        break;
                    default:
                        LOGGER.log(Level.WARN, "Only numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                LOGGER.log(Level.ERROR,"Wrong value. Only numbers.");
                sc0.next();
            }
        }

    }
}
