
package fligths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flight {

    public List<List<String>> fly() {
        List<List<String>> listOfRoutes = new ArrayList<>();
        SystemFlights systemFlights = new SystemFlights(listOfRoutes);
        List<String> routeWK = new ArrayList<>();
        routeWK.add("Warszawa");
        routeWK.add("Kraków");
        systemFlights.addRoute(routeWK);
        List<String> routeGKW = new ArrayList<>();
        routeGKW.add("Gdańsk");
        routeGKW.add("Kraków");
        routeGKW.add("Wrocław");
        systemFlights.addRoute(routeGKW);
        List<String> routeKPS = new ArrayList<>();
        routeKPS.add("Katowice");
        routeKPS.add("Poznań");
        routeKPS.add("Szczecin");
        systemFlights.addRoute(routeKPS);
        List<String> routeBZ = new ArrayList<>();
        routeBZ.add("Białystok");
        routeBZ.add("Zakopane");
        systemFlights.addRoute(routeBZ);
        List<String> routeSKR = new ArrayList<>();
        routeSKR.add("Sopot");
        routeSKR.add("Kielce");
        routeSKR.add("Rzeszów");
        systemFlights.addRoute(routeSKR);
        List<String> routeLG = new ArrayList<>();
        routeLG.add("Lódź");
        routeLG.add("Gdynia");
        systemFlights.addRoute(routeLG);
        List<List<String>> collect = systemFlights.getListOfRoutes().stream().collect(Collectors.toList());
        return collect;
    }
}
