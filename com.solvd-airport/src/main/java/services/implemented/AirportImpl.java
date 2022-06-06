package services.implemented;

import bin.Airport;
import dao.IDAOAirport;
import dao.implemented.AirportDAOImpl;
import services.AirportService;

import java.sql.Connection;
import java.util.List;

public class AirportImpl implements AirportService {

    public AirportImpl() {
    }

    private Connection conn;

    public AirportImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Airport a) {
        IDAOAirport airportDAO = new AirportDAOImpl(conn);
        airportDAO.save(a);
    }

    @Override
    public void update(int id, Airport a) {

    }


    @Override
    public Airport getAirport(int id) {
        IDAOAirport airportDAO = new AirportDAOImpl(conn);
        Airport a = airportDAO.getById(id);
        return a;
    }

    @Override
    public List<Airport> getAll() {
        IDAOAirport airportDAO = new AirportDAOImpl(conn);
        List<Airport> aList = airportDAO.getAll();
        return aList;
    }
}
