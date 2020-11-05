
package fligths;

import java.util.List;

public class SystemFlights {
    private List<Flight> listOfFlights;
    public SystemFlights(final List<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }
    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }
}