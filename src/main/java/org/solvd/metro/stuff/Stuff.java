package org.solvd.metro.stuff;

public class Stuff {

    private enum State {
        DRIVER,
        INSTRUCTOR,
        CASHIER,
        CLEANER,
        SECURITY,
        STATION_MANAGER
    }

    private String name;
    private State state;

    public Stuff(String name, State state) {
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
