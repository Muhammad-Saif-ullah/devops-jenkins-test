import java.util.Scanner;

public class weather {
    // Attributes of the Weather class
    private String condition;
    private double temperature;
    private double humidity;

    // Constructor
    public weather(String condition, double temperature, double humidity) {
        this.condition = condition;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Getter and setter methods
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    // Method to display weather information
    public void displayWeather() {
        System.out.println("Weather Condition: " + condition);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }

    // Main method to test the Weather class with user input
    public static void main(String[] args) {
        // Creating a Weather object with user input
        weather todayWeather = new weather("Rainy", 26.3, 52);

        // Displaying the weather information
        todayWeather.displayWeather();
    }
}
