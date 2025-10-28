package org.solvd.passenger;

import org.solvd.station.Station;

public class Passenger {

    private int passengerId;

    Station fromStation, toStation;

    public Passenger(int passengerId, Station fromStation, Station toStation) {
        this.passengerId = passengerId;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }
}
