package org.solvd.metro.transfer;

import org.solvd.metro.passenger.Passenger;
import org.solvd.metro.schedule.Schedule;
import org.solvd.metro.station.Station;

public class Transfer {

    private Schedule schedule;
    private Passenger passenger;

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
