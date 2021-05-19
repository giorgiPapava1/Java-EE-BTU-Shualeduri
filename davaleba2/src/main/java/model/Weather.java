package model;

public class Weather {

    private int weatherWeatherTemperature;

    private String city;

    private int windSpeed;

    private int humidity;

    private int weatherPressure;

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public int getHumidity() {
        return humidity;
    }

    public int getWeatherPressure() {
        return weatherPressure;
    }

    public void setWeatherPressure(int weatherPressure) {
        this.weatherPressure = weatherPressure;
    }

    public Weather() {

    }

    public Weather(int weatherWeatherTemperature, String city, int windSpeed,int humidity , int weatherPressure) {
        this.weatherPressure = weatherPressure;

        this.city = city;

        this.weatherWeatherTemperature = weatherWeatherTemperature;

        this.humidity = humidity;

        this.windSpeed = windSpeed;

    }

    public int getWeatherWeatherTemperature() {
        return weatherWeatherTemperature;
    }

    public void setWeatherWeatherTemperature(int weatherWeatherTemperature) {
        this.weatherWeatherTemperature = weatherWeatherTemperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", city='" + city + '\'' +
                ", weatherPressure=" + weatherPressure +
                "weatherWeatherTemperature=" + weatherWeatherTemperature +
                '}';
    }

}
