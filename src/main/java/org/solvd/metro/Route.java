package org.solvd.metro;

import java.util.LinkedList;

public class Route {

    private LinkedList<Station> stations;

    public Route(){
        stations = new LinkedList<>();
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    @Override
    public String toString() {
        return "Route{" +
                "stations=" + stations +
                '}';
    }

    public void printRoute() {
        System.out.println("Route: ");
        for (Station station : stations) {
            System.out.println(station);
        }
    }
}
