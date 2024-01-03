import java.util.Scanner;

public class CelsiusToFahringheit {

    public static void convert() {
        double temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Inter temperature in Celsius: ");

        temperature = input.nextDouble();
        temperature = (temperature * 9 / 5.0) + 32;

        System.out.println("The temperature in Fahringheit3 is: " + temperature);
    }
}
