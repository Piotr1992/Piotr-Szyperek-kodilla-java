
package fligths;

import java.util.ArrayList;

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
        ServiceFlights serviceFlights = new ServiceFlights(systemFlights.getListOfFlights(), "");
        serviceFlights.findAllFlightFromCity(systemFlights.getListOfFlights(), "Warszawa");
        serviceFlights.findAllFlightToCity(systemFlights.getListOfFlights(), "Poznań");
        serviceFlights.findAllFlightOverCity(systemFlights.getListOfFlights(), "Warszawa");     //  Poznań
    }
}
