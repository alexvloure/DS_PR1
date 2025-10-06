package edu.uoc.ds.adt.model;

public class WeatherStationDataSummaryItem {

    private final String province;
    private final double accumulatedPrecipitation;
    private final double meanAvgAirTemperature;
    private final int rows;

    public WeatherStationDataSummaryItem(String province,
                                         double accumulatedPrecipitation,
                                         double meanAvgAirTemperature,
                                         int rows) {
        this.province = province;
        this.accumulatedPrecipitation = accumulatedPrecipitation;
        this.meanAvgAirTemperature = meanAvgAirTemperature;
        this.rows = rows;
    }

    public String getProvince() {
        return province;
    }

    public double getAccumulatedPrecipitation() {
        return accumulatedPrecipitation;
    }

    public double getMeanAvgAirTemperature() {
        return meanAvgAirTemperature;
    }

    /** Number of rows used to compute this summary. */
    public int numRows() {
        return rows;
    }
}
