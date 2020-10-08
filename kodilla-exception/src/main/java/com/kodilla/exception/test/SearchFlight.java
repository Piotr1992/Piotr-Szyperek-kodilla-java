package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportMap = new HashMap<>();

        airportMap.put("Dubaj (DXB)", false);
        airportMap.put("Los Angeles (LAX)", true);
        airportMap.put("Tokio Haneda (HND)", false);
        airportMap.put("Londyn Heathrow (LHR)", true);
        airportMap.put("Paryż. Lotnisko im. Charlesa de Gaulle'a (CDG)", false);

        Boolean searchAirport = airportMap.get("Tokio Haneda (HND)");

        if ( searchAirport ) {
            System.out.println("Departure airport: " + flight.getDepartureAirport() + " arrival airport: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport doesn't accesible!");
        }

    }


    public static void main(String[] args) {

        Flight flight = null;
        SearchFlight sf = new SearchFlight();

        try {
            sf.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Fligth can't done: "+e.getMessage());
        }

    }

}
