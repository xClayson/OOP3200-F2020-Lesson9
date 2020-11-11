/*
 * Author: Ryan Clayson (100558837)
 * Date: November 11 2020
 */

package ca.durhamcollege;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // define the scanner
        Scanner keyboard = new Scanner(System.in);

        //Input for name
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        //Input for age
        float age = 0.0f;
        //sentinel variable
        boolean isValidInput = false;

        do {
            System.out.print("Please enter your age: ");

            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <= 0.0f) || (age >=120.0f))
                {
                    System.out.println("Error: You must enter an age between 0 and 120 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.printf("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while(!isValidInput);

        //Multidimensional Array Example

        System.out.println("Multi-Dimensional Array Example");
        int rows = 8;
        int cols = 8;
        float [][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 random values: ");

        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random() * rows);
            var randCols = (int)(Math.random()) * cols;
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }

        //Output
        System.out.println();
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);
    }
}
