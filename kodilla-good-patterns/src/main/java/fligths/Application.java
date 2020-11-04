
package fligths;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Flight flight = new Flight();
        List<List<String>> listOfFlights = flight.fly();
        String searchCity = "Gdynia";   //"Warszawa"     //"Kraków";
        ServiceFlights serviceFlights = new ServiceFlights(listOfFlights, searchCity);
        serviceFlights.findFlightFromCity(listOfFlights, searchCity);
        serviceFlights.findFlightToCity(listOfFlights, searchCity);
        serviceFlights.findFlightOverCity(listOfFlights, searchCity);
    }
}



/*
*
*       Routes of flights:
*
        Warszawa -> Kraków
        Gdańsk -> Kraków -> Wrocław
        Katowice -> Poznań -> Szczecin
        Białystok -> Zakopane
        Sopot -> Kielce -> Rzeszów
        Lódź -> Gdynia
*/