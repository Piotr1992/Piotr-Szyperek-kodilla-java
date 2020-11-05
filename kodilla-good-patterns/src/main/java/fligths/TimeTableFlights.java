
package fligths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTableFlights {

    public void showTableFlights() {
        SystemFlights systemFlights = new SystemFlights(new ArrayList<>());
        systemFlights.addFlight(new Flight("Kraków", "Warszawa"));
        systemFlights.addFlight(new Flight("Warszawa", "Białystok"));
        systemFlights.addFlight(new Flight("Gdańsk", "Warszawa"));
        systemFlights.addFlight(new Flight("Warszawa", "Zakopane"));
        systemFlights.addFlight(new Flight("Wrocław", "Poznań"));
        systemFlights.addFlight(new Flight("Poznań", "Lublin"));
        systemFlights.addFlight(new Flight("Olsztyn", "Poznań"));
        systemFlights.addFlight(new Flight("Poznań", "Szczecin"));

        List<String> searchAllFlightFromCity = systemFlights.getListOfFlights().stream().map(s->s.getFromCity()).collect(Collectors.toList());
        List<String> searchAllFlightToCity = systemFlights.getListOfFlights().stream().map(s->s.getToCity()).collect(Collectors.toList());

        ServiceFlights serviceFlights = new ServiceFlights();
        serviceFlights.findAllFlightFromCity(systemFlights.getListOfFlights(), "Warszawa", searchAllFlightFromCity, searchAllFlightToCity);
        serviceFlights.findAllFlightToCity(systemFlights.getListOfFlights(), "Poznań", searchAllFlightFromCity, searchAllFlightToCity);
        serviceFlights.findAllFlightOverCity(systemFlights.getListOfFlights(), "Warszawa", searchAllFlightFromCity, searchAllFlightToCity);     //  Poznań
    }
}
