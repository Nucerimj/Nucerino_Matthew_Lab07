import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        do {
            System.out.print("Enter temperature in Fahrenheit: ");

            // Check if the input is a valid double
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // consume the invalid input
                System.out.print("Enter temperature in Fahrenheit: ");
            }

            fahrenheit = scanner.nextDouble();

            // Perform conversion
            celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + celsius);

            // Ask the user if they want to convert another temperature
            System.out.print("Do you want to convert another temperature? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
