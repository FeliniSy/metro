package org.solvd.metro;

public class Seat {

    private int number;
    private String type;
    private boolean reserved;

    public Seat(int number, String type) {
        this.number = number;
        this.type = type;
        this.reserved = false;
    }

    public int getNumber() {
        return number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", reserved=" + reserved +
                '}';
    }
}
