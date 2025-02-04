package org.example.temperature;

public class TemperatureBelowZeroKelvinException extends Exception {
    public TemperatureBelowZeroKelvinException() {
        super("Temperature cannot be below 0 K!");
    }
}
