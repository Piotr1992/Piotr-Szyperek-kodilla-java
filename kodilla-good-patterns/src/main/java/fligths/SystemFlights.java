
package fligths;

import java.util.List;

public class SystemFlights {

    private List<List<String>> listOfRoutes;
    public SystemFlights(final List<List<String>> listOfRoutes) {
        this.listOfRoutes = listOfRoutes;
    }
    public void addRoute(List<String> Route) {
        listOfRoutes.add(Route);
    }
    public List<List<String>> getListOfRoutes() {
        return listOfRoutes;
    }
}