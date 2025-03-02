package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.traversal.Iterator;

public class PR1WeatherStationDataQueue {

    private Queue<WeatherStationData> queue;

    public PR1WeatherStationDataQueue(int size) {
        newQueue(size);
    }
    public void newQueue(int size) {
        queue = new QueueArrayImpl<>(size);
    }

    public Queue<WeatherStationData> getQueue() {
        return this.queue;
    }

    public void add(WeatherStationData w) {
        this.queue.add(w);
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
}
