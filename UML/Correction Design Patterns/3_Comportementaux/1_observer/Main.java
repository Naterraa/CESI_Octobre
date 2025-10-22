public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer current = new CurrentConditionsDisplay();
        Observer stats = new StatisticsDisplay();

        station.addObserver(current);
        station.addObserver(stats);

        station.setMeasurements(25.4f, 60);
        station.setMeasurements(27.8f, 55);
    }
}