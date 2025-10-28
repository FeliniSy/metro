package org.solvd.schedule;

import org.solvd.route.Route;
import org.solvd.station.Station;
import org.solvd.train.Train;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Schedule {

    private LocalDateTime startTime, endTime;
    private Station startStation, endStation;
    private Duration duration;
    private Train train;
    private Route route;

    public Schedule(LocalDateTime startTime, Station startStation,
                    LocalDateTime endTime, Station endStation,
                    Duration duration, Train train, Route route) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.startStation = startStation;
        this.endStation = endStation;
        this.duration = duration;
        this.train = train;
        this.route = route;
    }

    public int getTrain() {
        return train.getNumber();
    }

    public Route getRoute() {
        return route;
    }
}
