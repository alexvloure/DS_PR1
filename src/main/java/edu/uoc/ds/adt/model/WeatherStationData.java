package edu.uoc.ds.adt.model;

import java.time.LocalDateTime;

public class WeatherStationData {

    private LocalDateTime lastUpdated;
    private String stationName;
    private String province;
    private double latitude;
    private double longitude;
    private double avgAirTemperature;
    private double precipitation;
    private double minAirTemperature;
    private double maxAirTemperature;

    public WeatherStationData(LocalDateTime lastUpdated, String stationName, String province,
                              double latitude, double longitude,
                              double avgAirTemperature, double precipitation,
                              double minAirTemperature, double maxAirTemperature) {
        this.lastUpdated = lastUpdated;
        this.stationName = stationName;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
        this.avgAirTemperature = avgAirTemperature;
        this.precipitation = precipitation;
        this.minAirTemperature = minAirTemperature;
        this.maxAirTemperature = maxAirTemperature;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAvgAirTemperature() {
        return avgAirTemperature;
    }

    public void setAvgAirTemperature(double avgAirTemperature) {
        this.avgAirTemperature = avgAirTemperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getMinAirTemperature() {
        return minAirTemperature;
    }

    public void setMinAirTemperature(double minAirTemperature) {
        this.minAirTemperature = minAirTemperature;
    }

    public double getMaxAirTemperature() {
        return maxAirTemperature;
    }

    public void setMaxAirTemperature(double maxAirTemperature) {
        this.maxAirTemperature = maxAirTemperature;
    }
}