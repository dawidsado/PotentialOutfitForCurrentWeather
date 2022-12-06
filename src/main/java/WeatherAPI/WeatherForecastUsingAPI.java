package WeatherAPI;

import Interfaces.ConversionFromKelvinsIntoCelsius.KelvinToCelsiusConversion;
import Interfaces.DataAboutWeather.WeatherData;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class WeatherForecastUsingAPI implements WeatherData, KelvinToCelsiusConversion {
 HttpResponse<String> response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?lat=52.2337172&lon=21.0714322&appid=463b5d4155878bad2624ffef0ef942d0").asString();
 String temperature = response.getBody().replaceAll("\\D+", "").substring(22, 27);
 static final BigDecimal CONST_TO_CONVERSION = new BigDecimal(273.15);

 public WeatherForecastUsingAPI() throws UnirestException {
 }

 @Override
 public String getCurrentTemperature() {
  return "Current temperature in Warsaw: " + temperatureInCelsius() + " C";
 }

 @Override
 public BigDecimal temperatureInCelsius() {
  BigInteger temperatureAsBI = new BigInteger(temperature);
  BigDecimal temperatureFinal = new BigDecimal(temperatureAsBI, 2);
  return temperatureFinal.subtract(CONST_TO_CONVERSION).setScale(2, RoundingMode.DOWN);
 }

 @Override
 public String getCurrentOverallConditions() {
  String cond = response.getBody().substring(67, 75);
  return "Overall conditions: " + cond.replaceAll(";$", "");
 }
}