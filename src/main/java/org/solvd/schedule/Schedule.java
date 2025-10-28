package org.solvd.schedule;

import org.solvd.station.Station;
import org.solvd.train.Train;

import java.time.Duration;
import java.time.LocalDateTime;

public class Schedule {

    private LocalDateTime startTime,endTime;
    private Station startStation, endStation;
    private Duration duration;
    private Train train;

    public Schedule(LocalDateTime startTime, Station startStation,
                    LocalDateTime endTime, Station endStation,
                    Duration duration,Train train) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.startStation = startStation;
        this.endStation = endStation;
        this.duration = duration;
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void getNeighbor(int number){
        startStation.getNeighbor();
        endStation.getNeighbor();
    }
}
