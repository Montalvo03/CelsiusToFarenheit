package org.example;
public class ConversorTemperatura {
    public double celsiusToFahrenheit(double celsius) {
        // Fórmula de conversión de Celsius a Fahrenheit: (C × 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        // Ejemplo de uso
        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = conversor.celsiusToFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " grados Celsius son " + temperaturaFahrenheit + " grados Fahrenheit.");
    }
}