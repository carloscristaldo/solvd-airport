
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.ConnectionPool;
import util.exception.CustomSQLException;
import view.AirportView;
import view.ServicesView;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    private static final String option1 = "1. Airport";
    private static final String option2 = "2. (IN PROGRESS)";
    private static final String option3 = "3. (IN PROGRESS)";
    private static final String option4 = "4. (IN PROGRESS)";
    private static final String option5 = "5. Testing Services";
    private static final String option6 = "6. Terminate Program";

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean finish = false;
        int option;




        try{
            Connection conn = ConnectionPool.getInstance().getConnection();

            while (!finish) {

                LOGGER.log(Level.OFF,
                        "\n" +
                                option1  + "\n" +
                                option2 + "\n" +
                                option3 + "\n" +
                                option4 + "\n" +
                                option5 +"\n" +
                                option6 + "\n");

                try {

                    LOGGER.log(Level.OFF, "Select: ");
                    option = sn.nextInt();

                    switch (option) {
                        case 1:
                            LOGGER.log(Level.OFF, "Airport Management: ");
                            AirportView airportView = new AirportView();
                            airportView.AirportMenu(conn);
                            break;
                        case 5:
                            LOGGER.log(Level.OFF, "Testing services: ");
                            ServicesView servicesView = new ServicesView();
                            servicesView.ServicesMenu(conn);
                            break;

                        case 6:
                            finish = true;
                            break;
                        default:
                            LOGGER.log(Level.OFF, "Only numbers between 1 and 4");
                    }
                } catch (InputMismatchException e) {
                    LOGGER.log(Level.OFF, "Wrong value. Only numbers.");
                    sn.next();
                }
            }


        } catch (Exception e) {
            throw new CustomSQLException("Connection was not possible", e);
        }

    }
}
