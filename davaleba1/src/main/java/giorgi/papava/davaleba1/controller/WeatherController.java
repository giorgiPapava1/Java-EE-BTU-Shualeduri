package giorgi.papava.davaleba1.controller;

import giorgi.papava.davaleba1.model.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather-controller")
public class WeatherController {

    public List<Weather> generateWeathers() {
        List<Weather> weatherList=new ArrayList<>();
        weatherList.add(new Weather(35,"Paris",321,52,321));
        weatherList.add(new Weather(15,"Tokyo",5234,231,643));
        return weatherList;
    }

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeathers() {
        return generateWeathers();
    }

    @GET
    @Path("/get-city/{city-name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getStudent(@PathParam("city-name") String cityName) {
        Weather weatherForReturn = null;
        for(Weather city: getWeathers()) {
            if(city.getCityName().equals(cityName)) {
                weatherForReturn = city;
            }else {
                weatherForReturn =  new Weather(0, "NOT FOUND", 0, 0, 0);
            }
        }
        return weatherForReturn;
    }

    @POST
    @Path("addWeather")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addWeather(Weather weather) {
        System.out.println(weather.toString());
    }



    @GET
    @Path("/getWeather/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeather(@PathParam("id") int id) {
        System.out.println(id);
        return new Weather(id,"PARIS",212,6534,21);
    }
}
