package org.solvd.metro;

public class Transfer {

    private Staff driver;
    private Schedule schedule;
    private Passenger passenger;

    public Transfer(Staff driver, Passenger passenger, Schedule schedule) {
        this.driver = driver;
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
