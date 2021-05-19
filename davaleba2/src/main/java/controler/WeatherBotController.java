package controler;

import model.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherBotController {

    public List<Weather> generateWeathers() {
        List<Weather> weatherList=new ArrayList<>();
        weatherList.add(new Weather(35,"Paris",321,5231,2131));
        weatherList.add(new Weather(15,"Tokyo",232,12,63));
        return weatherList;
    }

    public static String answer(String question) {
        String result;

        switch (question) {
            case "all":
                result = "Hello. How can we help you?";
                break;
            case "Which your is it?":
                result = "10";
                break;
            default:
                result = "I have no answer to that question";
        }

        return result;
    }
}
