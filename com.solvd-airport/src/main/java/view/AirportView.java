package view;

import bin.Airport;
import bin.AirportExtended;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.implemented.AirportImpl;
import services.jaxb.JaxB;
import util.Constants;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AirportView {

    private final static Logger LOGGER = LogManager.getLogger(AirportView.class);

    private static final String option1 = "1. Get Airport by id";
    private static final String option2 = "2. List all Airports";
    private static final String option3 = "3. Create Airport";
    private static final String option4 = "4. (IN PROGRESS)";
    private static final String option5 = "5. (IN PROGRESS)";
    private static final String option6 = "6. Go Back";


    public void AirportMenu(Connection conn){
        

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
                        int id = sc0.nextInt();
                        airportImpl.getAirport(id);
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
