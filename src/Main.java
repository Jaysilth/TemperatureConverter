import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Code to convert temperature to celcius or to farenheit
        Scanner scanner = new Scanner(System.in);

        // declare variables

        double temp;
        double newTemp;
        String unit;

        // ask user input

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to celcius or farenheit (C or F): ");
        unit = scanner.next().toUpperCase();

       newTemp= (unit.equals("C")) ? (temp - 32) * 5/9 : (temp *5/9) + 32;

        System.out.printf("%.1f %s", newTemp , unit);
        scanner.close();
    }
}
