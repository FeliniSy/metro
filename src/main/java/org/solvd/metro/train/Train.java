package org.solvd.metro.train;

import org.solvd.metro.carriage.Carriage;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int number;
    private List<Carriage> carriages;

    public Train(int number) {
        this.number = number;
        this.carriages = new ArrayList<Carriage>();
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", carriages=" + carriages +
                '}';
    }

    public void addCarriage(Carriage carriage) {
        this.carriages.add(carriage);
    }
}
