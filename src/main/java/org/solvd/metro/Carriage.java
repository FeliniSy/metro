package org.solvd.metro;

import java.util.ArrayList;
import java.util.List;

public class Carriage {

    private int id;
    private List<Seat> seats;

    public Carriage(int id, int quantityOfSeats, String seatType) {
        this.id = id;
        this.seats = new ArrayList<>();

        for (int i = 1; i <= quantityOfSeats; i++) {
            seats.add(new Seat(i, seatType));
        }
    }

    public int getId() {
        return id;
    }

    public boolean reserveSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getNumber() == seatNumber && !seat.isReserved()) {
                seat.setReserved(true);
                return true;
            }
        }
        return false;
    }

    public void changeSeatType(int seatNumber, String newType) {
        for (Seat seat : seats) {
            if (seat.getNumber() == seatNumber) {
                seat.setType(newType);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "id=" + id +
                ", seats=" + seats +
                '}';
    }
}
