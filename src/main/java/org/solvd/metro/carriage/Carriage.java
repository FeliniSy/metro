package org.solvd.metro.carriage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carriage {

    private final int id;
    private List<Integer> quantityOfSeats;
    private Map<Integer, String> seats;

    List<Integer> reservedSeats;

    public Carriage(int id, int quantityOfSeats) {
        this.id = id;
        this.quantityOfSeats = List.of(quantityOfSeats);
        this.seats = new HashMap<>();
        this.reservedSeats = new ArrayList<>();

        for (int i = 1; i <= quantityOfSeats; i++) {
            this.seats.put(i, "2nd class");
        }
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "id=" + id +
                ", quantityOfSeats=" + quantityOfSeats +
                ", seats=" + seats +
                ", reservedSeats=" + reservedSeats +
                '}';
    }

    public void changeSeatName(int seatNumber, String newName) {
        this.seats.put(seatNumber, newName);
    }

    public int getId() {
        return id;
    }

    public boolean isReservedSeat(int seatNumber) {
        return reservedSeats.contains(seatNumber);
    }

    public boolean takeSeat(int seatNumber) {
        boolean result = false;
        if (!reservedSeats.contains(seatNumber)) {
            reservedSeats.add(seatNumber);
            result = true;
        }
        return result;
    }
}