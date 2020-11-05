
package fligths;

public class Flight {
    private String fromCity;
    private String toCity;
    Flight(final String fromCity, final String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }
    public String getFromCity() {
        return fromCity;
    }
    public String getToCity() {
        return toCity;
    }
}
