package org.solvd.station;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private int id;
    private String address;
    private String city;

    List<Station> neighbors;

    public Station(int id, String address, String city) {
        this.id = id;
        this.address = address;
        this.city = city;
        neighbors = new ArrayList<Station>();
    }

    public String getAddress() {
        return address;
    }
}
