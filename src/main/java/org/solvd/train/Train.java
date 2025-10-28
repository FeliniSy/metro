package org.solvd.train;

import org.solvd.carriage.Carriage;

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
}
