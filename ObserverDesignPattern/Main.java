package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        WeatherDisplay weatherDisplay1 = new WeatherDisplay();
        WeatherDisplay weatherDisplay2 = new WeatherDisplay();

        weatherService.registerObserver(weatherDisplay1);
        weatherService.registerObserver(weatherDisplay2);

        weatherService.setData("It's sunny and warm today.");
    }
}
