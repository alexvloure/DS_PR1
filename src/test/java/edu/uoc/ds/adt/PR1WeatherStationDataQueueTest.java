package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
//import edu.uoc.ds.adt.model.WeatherStationDataSummaryItem;
import edu.uoc.ds.adt.model.WeatherStationDataSummaryItem;
import edu.uoc.ds.adt.util.CSVReader;
import edu.uoc.ds.adt.util.DateUtils;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1WeatherStationDataQueueTest {
    private static final int SIZE  = 1304;
    PR1WeatherStationDataQueue pr1q;

    @Before
    public void setUp() {
        this.pr1q = new PR1WeatherStationDataQueue(SIZE, new String[]{"BARCELONA", "GIRONA"});
        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    private void fillQueue() {
        CSVParser csvParser = CSVReader.getCVSParser("src/test/resources/weatherData.csv");
        for (CSVRecord record : csvParser) {
            WeatherStationData weatherData = new WeatherStationData(
                    DateUtils.getLocalDateTime(record.get("lastUpdated")),
                    record.get("weatherStation.name"),
                    record.get("weatherStation.province"),
                    Double.parseDouble(record.get("weatherStation.location.coordinates.0")),
                    Double.parseDouble(record.get("weatherStation.location.coordinates.1")),
                    Double.parseDouble(record.get("avgAirTemperature")),
                    Double.parseDouble(record.get("precipitation")),
                    Double.parseDouble(record.get("minAirTemperature")),
                    Double.parseDouble(record.get("maxAirTemperature"))
            );
            pr1q.add(weatherData);
        }
    }

    @org.junit.Test
    public void queueTest() {
        assertEquals(SIZE, this.pr1q.getQueue().size());

        WeatherStationData weatherData1 = this.pr1q.getQueue().poll();

        Assert.assertEquals("MANRESA", weatherData1.getStationName());
        Assert.assertEquals(0, weatherData1.getPrecipitation(), 0);
        Assert.assertEquals(18.4, weatherData1.getAvgAirTemperature(), 0);

        WeatherStationData weatherData2 = this.pr1q.getQueue().poll();
        Assert.assertEquals("MANRESA", weatherData2.getStationName());
        Assert.assertEquals(0, weatherData2.getPrecipitation(), 0);
        Assert.assertEquals(17.0, weatherData2.getAvgAirTemperature(), 0);


        Assert.assertEquals(1.09, pr1q.getMeanPrecipitation(),0.05);
        Assert.assertEquals(15.96, pr1q.getMeanAvgAirTemperature(),0.05);
    }

    @org.junit.Test
    public void queueTest2() {
        assertEquals(SIZE, this.pr1q.getQueue().size());

        WeatherStationDataSummaryItem dataInfo1 = this.pr1q.getWeatherStationDataSummaryItem("BARCELONA");
        Assert.assertEquals(730, dataInfo1.getAccumulatedPrecipitation(),0.05);
        Assert.assertEquals(16.94, dataInfo1.getMeanAvgAirTemperature(),0.05);
        Assert.assertEquals(719, dataInfo1.numRows());

        WeatherStationDataSummaryItem dataInfo2 = this.pr1q.getWeatherStationDataSummaryItem("GIRONA");
        Assert.assertEquals(690.5, dataInfo2.getAccumulatedPrecipitation(),0.05);
        Assert.assertEquals(14.76, dataInfo2.getMeanAvgAirTemperature(),0.05);
        Assert.assertEquals(585, dataInfo2.numRows());
    }



    @After
    public void release() {
        this.pr1q = null;
    }
}



