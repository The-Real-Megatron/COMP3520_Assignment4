package org.example;

import java.util.Scanner;

public class RefactoredTempConvProgram {

    public static double convertCelsiusToFahrenheit(double temp)
    {
        return temp*9/5+32;
    }

    public static double convertFahrenheitToCelsius(double temp)
    {
        return (temp-32)*5/9;
    }

    public static double convertCelsiusToKelvin(double temp)
    {
        return temp+273.15;
    }

    // A print menu that makes the code easy to read and understand
    public static void printMenu()
    {
        System.out.println("---TemperatureConversionMenu---");
        System.out.println("Enter 1 if you wish to convert the temperature from Celsius to Fahrenheit");
        System.out.println("Enter 2 if you wish to convert the temperature from Fahrenheit to Celsius");
        System.out.println("Enter 3 if you wish to convert the temperature from Celsius to Kelvin");
        System.out.println("Enter 4 to exit");
        System.out.println("---------------------------------------------------------------------");
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Welcome to the temp conv app!");

        while (true)
        {
            printMenu();
            userInput = scan.nextInt();

            // This loop is here in case the user inputs the wrong choice
            // It ensures that they select a valid option from the menu
            while (userInput < 1 || userInput > 4)
            {
                System.out.println("Invalid input! Please enter a number between 1 and 4 :)");
                printMenu();
                userInput = scan.nextInt();
            }

            // If 4 is entered, the system can exit early
            if (userInput == 4)
            {
                System.out.println("Goodbye :)");
                break;
            }

            // This is here to avoid repetition of asking users for a temperature
            System.out.println("Enter the temperature you wish to convert");
            double userTemp = scan.nextDouble();

            // A switch case that makes the code cleaner
            switch (userInput)
            {
                case 1:
                    double resultFahrenheit = convertCelsiusToFahrenheit(userTemp);
                    System.out.println("Result: " + resultFahrenheit);
                    break;

                case 2:
                    double resultCelsius = convertFahrenheitToCelsius(userTemp);
                    System.out.println("Result: " + resultCelsius);
                    break;

                case 3:
                    double resultKelvin = convertCelsiusToKelvin(userTemp);
                    System.out.println("Result: " + resultKelvin);
                    break;
            }
        }

        scan.close();
    }
}
