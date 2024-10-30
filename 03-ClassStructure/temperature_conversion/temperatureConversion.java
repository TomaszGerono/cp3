package temperature_conversion;

public class temperatureConversion {
    // C to K -> C + 273.15
    // K to C -> K - 273.15
    // C to F -> (C * 9/5) + 32
    // F to C -> (F - 32) * 5/9
    // K to F -> (K - 273.15) * 9/5 + 32
    // F to K -> (F - 32) + 5/9 + 273.15


    static float CelsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    static float KelvinToCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    static float CelsiusToFahreheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    static float FahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    static float KelvinToFahreheit(float kelvin) {
        return (kelvin - 273.15f) * 9/5 + 32;
    }

    static float FahrenheitToKelvin(float fahrenheit) {
        return (fahrenheit - 32) + 5/9 + 273.15f;
    }
}
