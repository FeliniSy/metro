package org.solvd.metro.station;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private int id;
    private String address;
    private String city;

    private List<Station> neighbors;

    public Station(int id, String address, String city) {
        this.id = id;
        this.address = address;
        this.city = city;
        neighbors = new ArrayList<Station>();
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", neighbors=" + neighbors +
                '}';
    }

    public String getAddress() {
        return address;
    }
}
