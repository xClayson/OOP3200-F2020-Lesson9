/*
 * Author
 * Date

 */

package ca.durhamcollege;
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
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);

    }
}
