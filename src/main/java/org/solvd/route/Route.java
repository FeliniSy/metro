package org.solvd.route;

import org.solvd.station.Station;

import java.util.LinkedList;

public class Route {

    LinkedList<Station> stations;

    public Route(){
        stations = new LinkedList<>();
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void printRoute() {
        System.out.println("Route: ");
        for (Station station : stations) {
            System.out.println(station);
        }
    }
}
