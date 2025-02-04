package org.example.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FahrenheitToCelsiusTest {
    FahrenheitToCelsius fahrenheitToCelsius;

    @Test
    public void shouldConvertRoomTemperature() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = 68, expectedCelsius = 20;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldConvertFreezingPoint() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = 32, expectedCelsius = 0;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldConvertBoilingPoint() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = 212, expectedCelsius = 100;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldConvertNegativeTemperature() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = -40, expectedCelsius = -40;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldConvertAbsoluteZeroTemperature() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = -459.67f, expectedCelsius = -273.15f;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldConvertHighTemperature() throws TemperatureBelowZeroKelvinException {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float celsius, fahrenheit = 1000, expectedCelsius = 537.78f;
        celsius = fahrenheitToCelsius.convert(fahrenheit);
        Assertions.assertEquals(expectedCelsius, celsius);
    }

    @Test
    public void shouldNotConvertAbsoluteZeroTemperature() {
        fahrenheitToCelsius = new FahrenheitToCelsius();
        float fahrenheit = -500;

        TemperatureBelowZeroKelvinException exception = assertThrows(
                TemperatureBelowZeroKelvinException.class,
                () -> fahrenheitToCelsius.convert(fahrenheit)
        );

        Assertions.assertEquals("Temperature cannot be below 0 K!", exception.getMessage());
    }
}