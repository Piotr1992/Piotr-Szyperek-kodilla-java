
package fligths;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceFlights {

    public void findAllFlightFromCity(List<Flight> listOfFlights, String searchFlight, List<String> searchAllFlightFromCity, List<String> searchAllFlightToCity) {
        for ( int i = 0; i < searchAllFlightFromCity.size(); i++ ) {
            if ( searchAllFlightFromCity.get(i).equals(searchFlight) ) {
                System.out.println(searchFlight + " -> " + searchAllFlightToCity.get(i));
            }
        }
    }
    public void findAllFlightToCity(List<Flight> listOfFlights, String searchFlight, List<String> searchAllFlightFromCity, List<String> searchAllFlightToCity) {
        for ( int i = 0; i < searchAllFlightToCity.size(); i++ ) {
            if ( searchAllFlightToCity.get(i).equals(searchFlight) ) {
                System.out.println(searchAllFlightFromCity.get(i) + " -> " + searchFlight);
            }
        }
    }
    public void findAllFlightOverCity(List<Flight> listOfFlights, String searchFlight, List<String> searchAllFlightFromCity, List<String> searchAllFlightToCity) {
        boolean checkToCity = false;
        boolean checkFromCity = false;
        Map<String, String> mapFlight = new HashMap<String, String>();
        String varFlight = "";
        String[] tabFlight2 = new String[100];
        int ind = 0;
        int indTo = 0;
        int indFrom = 0;
        for ( int i = 0; i < searchAllFlightToCity.size(); i++ ) {
            checkToCity = searchAllFlightToCity.get(i).equals(searchFlight);
            if ( checkToCity ) {
                indTo++;
            }
        }
        for ( int i = 0; i < searchAllFlightFromCity.size(); i++ ) {
            checkFromCity = searchAllFlightFromCity.get(i).equals(searchFlight);
            if ( checkFromCity ) {
                indFrom++;
            }
        }
        for (int i = 0; i < searchAllFlightToCity.size(); i++) {
            checkToCity = searchAllFlightToCity.get(i).equals(searchFlight);
            if (checkToCity) {
                for(int j=0; j<indFrom; j++) {
                    varFlight = searchAllFlightFromCity.get(i) + " -> " + searchFlight;
                    tabFlight2[ind] = varFlight;
                    ind++;
                }
            }
        }
        ind = 0;
        for(int j=0; j<indTo; j++) {
            for (int i = 0; i < searchAllFlightFromCity.size(); i++) {
                checkFromCity = searchAllFlightFromCity.get(i).equals(searchFlight);
                if (checkFromCity) {
                    varFlight = " -> " + searchAllFlightToCity.get(i);
                    tabFlight2[ind] += varFlight;
                    ind++;
                }
            }
        }
        for(int i=0; i<100; i++) {
            if( tabFlight2[i] != null && !tabFlight2[i].startsWith(" -> ") &&
                !tabFlight2[i].contains("null") && helpFunction(tabFlight2[i], " -> ") > 1 ) {
                System.out.println(tabFlight2[i]);
            }
        }
    }
    public int helpFunction(String str, String findStr) {
        int lastIndex = 0;
        int count = 0;
        while(lastIndex != -1){
            lastIndex = str.indexOf(findStr,lastIndex);
            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }
}