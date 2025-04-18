package task1;

import java.util.Scanner;
public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("---------------------");
        System.out.println("Choose input temperature scale:");
        System.out.println("1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int inputChoice = scanner.nextInt();
        System.out.print("Enter temperature value: ");
        double inputTemp = scanner.nextDouble();
        System.out.println("1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int outputChoice = scanner.nextInt();
        double result = 0.0;
        boolean valid = true;
        if (inputChoice == outputChoice) {
            result = inputTemp;
        } else {
            switch (inputChoice) {
                case 1: //Celsius
                    if (outputChoice == 2)
                        result = celsiusToFahrenheit(inputTemp);
                    else if (outputChoice == 3)
                        result = celsiusToKelvin(inputTemp);
                    else
                        valid = false;
                    break;
                case 2: //Fahrenheit
                    if (outputChoice == 1)
                        result = fahrenheitToCelsius(inputTemp);
                    else if (outputChoice == 3)
                        result = fahrenheitToKelvin(inputTemp);
                    else
                        valid = false;
                    break;
                case 3: //Kelvin
                    if (outputChoice == 1)
                        result = kelvinToCelsius(inputTemp);
                    else if (outputChoice == 2)
                        result = kelvinToFahrenheit(inputTemp);
                    else
                        valid = false;
                    break;
                default:
                    valid = false;
                    System.out.println("Invalid input scale selected.");
            }
        }
        if (valid) {
            System.out.printf("Converted temperature: %.2f\n", result);
        } else {
            System.out.println("Conversion not possible with the selected options.");
        }
    }
}