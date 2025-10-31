package org.solvd.passenger;

import org.solvd.station.Station;
import org.solvd.ticket.Ticket;

public class Passenger {

    private int passengerId;
    private boolean hasticket;

    Station fromStation, toStation;

    public Passenger(int passengerId, Station fromStation, Station toStation) {
        this.passengerId = passengerId;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.hasticket = false;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", hasticket=" + hasticket +
                ", fromStation=" + fromStation +
                ", toStation=" + toStation +
                '}';
    }

    public Station getFromStation() {
        return fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void getTicket(Ticket ticket) {
        hasticket = true;
    }

    public int getPassengerId() {
        return passengerId;
    }
}
