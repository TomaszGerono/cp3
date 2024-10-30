package temperature_conversion;

public class temperatureConversionTest {
    public static void main(String[] args) {

        System.out.println("25 C in K: " + temperatureConversion.CelsiusToKelvin(25));
        System.out.println("25 C in F: " + temperatureConversion.CelsiusToFahreheit(25));

        System.out.println("100 F in K " + temperatureConversion.FahrenheitToKelvin(100));
        System.out.println("100 F in C " + temperatureConversion.FahrenheitToCelsius(100));

        System.out.println("0 K in C: " + temperatureConversion.KelvinToCelsius(0));
        System.out.println("0 K in F: " + temperatureConversion.KelvinToFahreheit(0));
    }
}
