package org.solvd.metro.schedule;

import org.solvd.metro.route.Route;
import org.solvd.metro.station.Station;
import org.solvd.metro.train.Train;

import java.time.Duration;
import java.time.LocalDateTime;

public class Schedule {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Station startStation;
    private Station endStation;
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

    @Override
    public String toString() {
        return "Schedule{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", startStation=" + startStation +
                ", endStation=" + endStation +
                ", duration=" + duration +
                ", train=" + train +
                ", route=" + route +
                '}';
    }
}
