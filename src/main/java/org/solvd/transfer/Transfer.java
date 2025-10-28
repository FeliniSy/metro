package org.solvd.transfer;

import org.solvd.passenger.Passenger;
import org.solvd.schedule.Schedule;
import org.solvd.station.Station;

public class Transfer {

    Schedule schedule;
    Passenger passenger;

    public Transfer(Passenger passenger, Schedule schedule) {
        this.passenger = passenger;
        this.schedule = schedule;
    }

    public void makeTransfer() {
        boolean started = false;

        for (Station st : schedule.getRoute().getStations()) {
            if (st.equals(passenger.getFromStation())) {
                started = true;
                System.out.println("Passenger " + passenger.getPassengerId() + " started journey from: " + st.getAddress());
            }

            if (started) {
                System.out.println("Passing through: " + st.getAddress());
            }

            if (st.equals(passenger.getToStation())) {
                System.out.println("Passenger " + passenger.getPassengerId() + " arrived at: " + st.getAddress());
                break;
            }
        }
    }
}
