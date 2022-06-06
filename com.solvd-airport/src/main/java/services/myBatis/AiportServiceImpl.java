package services.myBatis;

import dao.IDAOAirport;
import bin.Airport;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.AirportService;

import java.util.List;

public class AiportServiceImpl extends AbsSQLSession implements AirportService {

    private static final Logger LOGGER = LogManager.getLogger(AiportServiceImpl.class);

    @Override
    public void delete(int id) {
        try(SqlSession session = sqlSession()){
            IDAOAirport airport = session.getMapper(IDAOAirport.class);
            airport.delete(id);
            session.commit();
        }

    }

    @Override
    public void create(Airport a) {

        try(SqlSession session = sqlSession()){
            IDAOAirport airport = session.getMapper(IDAOAirport.class);
            airport.save(a);
            session.commit();
        }
    }

    @Override
    public void update(int id, Airport a) {

        try(SqlSession session = sqlSession()){
            IDAOAirport airport = session.getMapper(IDAOAirport.class);
            airport.update(id, a);
            session.commit();
        }

    }


    @Override
    public Airport getAirport(int id) {

        try (SqlSession session = sqlSession()){
            IDAOAirport airport = session.getMapper(IDAOAirport.class);
            Airport a = airport.getById(id);
            return a;
        }
    }

    @Override
    public List<Airport> getAll() {
        return null;
    }
}
