
package fligths;

import java.util.List;

public class ServiceFlights {

    private List<List<String>> listOfRoutes;
    private String searchFlight;
    public ServiceFlights(final List<List<String>> listOfRoutes, final String searchFlight) {
        this.listOfRoutes = listOfRoutes;
        this.searchFlight = searchFlight;
    }
    public void findFlightFromCity(List<List<String>> listOfRoutes, String searchFlight) {
        String trace = "";
        for ( int i = 0; i < listOfRoutes.size(); i++ ) {
            if ( listOfRoutes.get(i).indexOf(searchFlight) == 0 ) {
                System.out.println(listOfRoutes.get(i));
            }
        }
    }
    public void findFlightOverCity(List<List<String>> listOfRoutes, String searchFlight) {
        for ( int i = 0; i < listOfRoutes.size(); i++ ) {
            if ( listOfRoutes.get(i).indexOf(searchFlight) > 0 && listOfRoutes.get(i).indexOf(searchFlight) < listOfRoutes.get(i).size()-1 ) {
                System.out.println(listOfRoutes.get(i));
            }
        }
    }
    public void findFlightToCity(List<List<String>> listOfRoutes, String searchFlight) {
        for ( int i = 0; i < listOfRoutes.size(); i++ ) {
            if ( listOfRoutes.get(i).indexOf(searchFlight) == listOfRoutes.get(i).size()-1 ) {
                System.out.println(listOfRoutes.get(i));
            }
        }
    }
}