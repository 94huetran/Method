package TemperatureConversion;

import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args) {
    double fahrehiet;
    double celsius;
    int choice = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.Conversion celsius to Fahrenheit: ");
            System.out.println("2.Conversion fahrenheit to celsius: ");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = scn.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input Fahrenheit need change: ");
                    fahrehiet = scn.nextDouble();
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrehiet));
                    break;
                case 2:
                    System.out.println("Input Celsius need change: ");
                    celsius = scn.nextDouble();
                    System.out.println("Fahrehiet: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        return fahrenheit;
    }
    public static double  fahrenheitToCelsius (double fahrenheit ) {
        double celsius = (9.0 / 5) * (fahrenheit + 32);
        return celsius;
    }
}
