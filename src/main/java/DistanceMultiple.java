/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        // Create scanner classes
        Scanner scanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for the number of runs
        System.out.print("\nHow many times would you like to run the program?  ");

        int numRuns = inputScanner.nextInt();

        for (int j = 0; j < numRuns; j++)
        {
            // Prompt the user for the coordinate pairs
            System.out.print("\nEnter two coordinate pairs: ");
            String coordinates = scanner.nextLine();

            // Remove parentheses
            coordinates = coordinates.substring(1, coordinates.length() - 1);

            // Split each of the points by the middle ( and )
            String[] pairs = coordinates.split("\\)\\(");

            // Split by commas
            String[] set1 = pairs[0].split(",");
            String[] set2 = pairs[1].split(",");

            // Store numbers to variables
            double x1 = Double.parseDouble(set1[0]);
            double y1 = Double.parseDouble(set1[1]);
            double x2 = Double.parseDouble(set2[0]);
            double y2 = Double.parseDouble(set2[1]);

            // Compute distance
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Output distance
            System.out.print("\nDistance: " + distance + "\n");
        }
        // Exit the program
        System.out.print("\n\n\n");
        return;    
        return;
    }
}