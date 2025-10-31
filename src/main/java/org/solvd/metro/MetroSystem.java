package org.solvd.metro;

import org.solvd.metro.carriage.Carriage;
import org.solvd.metro.passenger.Passenger;
import org.solvd.metro.route.Route;
import org.solvd.metro.schedule.Schedule;
import org.solvd.metro.station.Station;
import org.solvd.metro.ticket.Ticket;
import org.solvd.metro.train.Train;
import org.solvd.metro.transfer.Transfer;

import java.time.Duration;
import java.time.LocalDateTime;

public class MetroSystem {

    public static void main(String[] args) {

        Carriage c1 = new Carriage(1,20);
        Carriage c2 = new Carriage(2,25);
        Carriage c3 = new Carriage(3,30);

        Station a = new Station(1,"rioni", "Kutaisi");
        Station b = new Station(2,"Kutaisi railway", "Kutaisi");
        Station c = new Station(3,"Kutaisi international airport", "kopitnari");
        Station d = new Station(4,"didube", "tbilisi");
        Station e = new Station(5,"vagzali", "tbilisi");

        Passenger p1 = new Passenger(201,b,d);
        p1.getTicket(Ticket.ONETIME);

        Train t1 = new Train(404);
        t1.addCarriage(c1);
        t1.addCarriage(c3);

        Route kutaisi_tbilisi = new Route();
        kutaisi_tbilisi.addStation(a);
        kutaisi_tbilisi.addStation(b);
        kutaisi_tbilisi.addStation(c);
        kutaisi_tbilisi.addStation(d);
        kutaisi_tbilisi.addStation(e);

        Schedule schedule1 = new Schedule(
                LocalDateTime.of(2025,11,2,9,15),
                a,
                LocalDateTime.of(2025,11,2,13,15),
                e,
                Duration.ofHours(4),
                t1,
                kutaisi_tbilisi
        );

        Transfer transfer1 = new Transfer(p1, schedule1);
        transfer1.makeTransfer();
    }
}
