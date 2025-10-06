package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
import edu.uoc.ds.adt.model.WeatherStationDataSummaryItem;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.traversal.Iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PR1WeatherStationDataQueue {

    private Queue<WeatherStationData> queue;
    private final Set<String> validStations;

    public PR1WeatherStationDataQueue(int size, String[] stations) {
        newQueue(size);
        this.validStations = new HashSet<>();
        for (String s : stations) {
            validStations.add(s.toLowerCase());
        }
    }

    public void newQueue(int size) {
        queue = new QueueArrayImpl<>(size);
    }

    public Queue<WeatherStationData> getQueue() {
        return this.queue;
    }

    public void add(WeatherStationData w) {
        if (validStations.contains(w.getProvince().toLowerCase())) {
            this.queue.add(w);
        }
    }

    public WeatherStationData poll() {
        return this.queue.poll();
    }

    public double getMeanPrecipitation() {
        if (queue.isEmpty()) {
            return 0;
        }
        Iterator<WeatherStationData> dataIterator = queue.values();
        double totalPrecipitation = 0;
        while (dataIterator.hasNext()) {
            WeatherStationData data = dataIterator.next();
            totalPrecipitation += data.getPrecipitation();
        }
        return totalPrecipitation / queue.size();
    }

    public double getMeanAvgAirTemperature() {
        if (queue.isEmpty()) {
            return 0;
        }
        Iterator<WeatherStationData> dataIterator = queue.values();
        double totalAvgAirTemperature = 0;
        while (dataIterator.hasNext()) {
            WeatherStationData data = dataIterator.next();
            totalAvgAirTemperature += data.getAvgAirTemperature();
        }
        return totalAvgAirTemperature / queue.size();
    }

    public WeatherStationDataSummaryItem getWeatherStationDataSummaryItem(String province) {
        double sumPrecip = 0.0;
        double sumAvgTemp = 0.0;
        int count = 0;

        Iterator<WeatherStationData> it = queue.values();
        while (it.hasNext()) {
            WeatherStationData d = it.next();
            if (d.getProvince() != null && d.getProvince().equalsIgnoreCase(province)) {
                sumPrecip += d.getPrecipitation();
                sumAvgTemp += d.getAvgAirTemperature();
                count++;
            }
        }

        double meanAvgTemp = (count == 0) ? 0.0 : (sumAvgTemp / count);
        return new WeatherStationDataSummaryItem(province, sumPrecip, meanAvgTemp, count);
    }
}
