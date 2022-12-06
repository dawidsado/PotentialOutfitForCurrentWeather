package Seasons;

import Interfaces.DataAboutWeather.GetCurrentSeason;
import Seasons.AllSeasonsAsEnum.Seasons;
import WeatherAPI.WeatherForecastUsingAPI;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.time.LocalDate;

public class SpecificDataAboutCurrentSeason extends WeatherForecastUsingAPI implements GetCurrentSeason {
    //Data based on temperatures in Poland in 2021, from IMGW.pl

    final static double avgWinterTemperature = 0.36;
    final static double avgSpringTemperature = 7.06;
    final static double avgSummerTemperature = 19.06;
    final static double avgAutumnTemperature = 9.53;
    private Seasons currentSeason;
    private int currentMonth;//with use of LocalDate class
    private double avgTemperature;

    {
        currentMonth = LocalDate.now().getMonthValue();
    }

    public SpecificDataAboutCurrentSeason() throws UnirestException {
        super();
    }

    @Override
    public void getCurrentSeason() {
        switch (currentMonth){
            case 12:
            case 1:
            case 2:
                currentSeason = Seasons.WINTER;
                avgTemperature = avgWinterTemperature;
                break;
            case 3:
            case 4:
            case 5:
                currentSeason = Seasons.SPRING;
                avgTemperature = avgSpringTemperature;
                break;
            case 6:
            case 7:
            case 8:
                currentSeason = Seasons.SUMMER;
                avgTemperature = avgSummerTemperature;
                break;
            case 9:
            case 10:
            case 11:
                currentSeason = Seasons.AUTUMN;
                avgTemperature = avgAutumnTemperature;
                break;
        }
        System.out.println("Currently is: " + currentSeason + " " + LocalDate.now() + "\n" + "Average temperature (based on data from last year) was: " + avgTemperature + " C");
        System.out.println(getCurrentTemperature() + '\n' + getCurrentOverallConditions());
    }
}
