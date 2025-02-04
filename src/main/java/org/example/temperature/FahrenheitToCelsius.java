package org.example.temperature;

public class FahrenheitToCelsius {
    public float convert(float fahrenheit) throws TemperatureBelowZeroKelvinException {
        if (fahrenheit < -459.67f) {
            throw new TemperatureBelowZeroKelvinException();
        }
        float celsius = (float) ((fahrenheit - 32.0) * 5 / 9);
        return Math.round(celsius * 100.0) / 100.0f;
    }
}
