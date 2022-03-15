package Q1;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        CircleWithException circle = new CircleWithException();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter radius: ");
            try {
                // .next() - Since you may not get a double entered, best to read in a String,
                // then attempt to convert it to a double.
                double inputRadius = Double.parseDouble(input.next());
                circle.setRadius(inputRadius);
                break; // will only get to here if input was a double
            } catch (NumberFormatException e) {
                System.out.println("Caught Numnber Format: Not a number, please re-enter radius.");
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Illegal Argument: " + e.getMessage());
            }
        }
        System.out.println("\nThe circle radius is: " + circle.getRadius());

        try {
            System.out.println("The circle area is: " + circle.getArea());
            System.out.println("The circle diameter is: " + circle.getDiameter());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
        input.close();
    }
}