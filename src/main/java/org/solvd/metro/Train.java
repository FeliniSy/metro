package org.solvd.metro;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int number;
    private List<Carriage> carriages;

    public Train(int number) {
        this.number = number;
        this.carriages = new ArrayList<Carriage>();
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", carriages=" + carriages +
                '}';
    }


    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }
}
