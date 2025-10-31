package org.solvd.metro;

public class Staff {

    protected enum State {
        DRIVER,
        INSTRUCTOR,
        CASHIER,
        CLEANER,
        SECURITY,
        STATION_MANAGER
    }

    private String name;
    private State state;

    public Staff(String name, State state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
