package services;

import bin.Airport;

import java.util.List;

public interface AirportService {

    void delete(int id);

    void create (Airport a);

    void update(int id, Airport a);

    Airport getAirport(int id);

    List<Airport> getAll ();
}
