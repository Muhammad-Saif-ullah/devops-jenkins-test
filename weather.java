import java.util.Scanner;

public class weather {
    // Attributes of the Weather class
    private String condition;
    private double temperature;
    private double humidity;

    // Constructor
    public Weather(String condition, double temperature, double humidity) {
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
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter weather condition (e.g., Sunny, Rainy): ");
        String condition = scanner.nextLine();

        System.out.print("Enter temperature in °C: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter humidity percentage: ");
        double humidity = scanner.nextDouble();

        // Creating a Weather object with user input
        Weather todayWeather = new Weather(condition, temperature, humidity);

        // Displaying the weather information
        todayWeather.displayWeather();

        // Closing the scanner
        scanner.close();
    }
}
