public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");

        fahrenheit = 77;
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is " + celsius + "°C");
    }
}
