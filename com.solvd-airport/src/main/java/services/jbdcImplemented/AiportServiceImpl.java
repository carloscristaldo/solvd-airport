package services.jbdcImplemented;

import bin.Airport;
import dao.IDAOAirport;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.AirportService;
import services.myBatis.AbsSQLSession;

import java.util.List;

public class AiportServiceImpl extends AbsSQLSession implements AirportService {

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Airport a) {

    }

    @Override
    public void update(int id, Airport a) {

    }

    @Override
    public Airport getAirport(int id) {
        return null;
    }

    @Override
    public List<Airport> getAll() {
        return null;
    }
}
