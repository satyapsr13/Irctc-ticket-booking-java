package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private Integer trainNo;
    private List<List<Integer>> seats;

    private Map<String, Time> stationTimes;
    private List<String> stations;

    // No-argument constructor
    public Train() {
    }

    // All-argument constructor
    public Train(String trainId, Integer trainNo, List<List<Integer>> seats,
                 Map<String, Time> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    // Getters
    public String getTrainId() {
        return trainId;
    }

    public Integer getTrainNo() {
        return trainNo;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public Map<String, Time> getStationTimes() {
        return stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    // Setters
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public void setTrainNo(Integer trainNo) {
        this.trainNo = trainNo;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public void setStationTimes(Map<String, Time> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getTrainInfo() {
        return "Train Id: " + trainId + " Train No: " + trainNo;
    }
}
