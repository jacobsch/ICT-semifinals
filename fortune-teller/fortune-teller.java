import java.util.Scanner;
import java.util.*;
 
public class fortuneTeller {
 
    /**
     * Jacob Schwartz and Owen Holman Semifinal Project for ICT12
     */

    // method for generating the UI
    public static void mainMenu() {
        String lines = "|------------------------------------|"; // lines string part 
        System.out.println(lines); // printing lines
        System.out.println("|          Fortune Teller Main Menu         |"); // printing the menu
        System.out.println(lines); // printing lines
        System.out.println("|1 Add an item to your JahCart       |"); // printing the menu
        System.out.println("|2 Remove an item from your JahCart  |"); // printing the menu
        System.out.println("|3 View the items in your JahCart    |"); // printing the menu
        System.out.println("|4 View items, add Total and Checkout|"); // printing the menu
        System.out.println("|5 Empty your JahCart                |"); // printing the menu
        System.out.println("|6               Exit                |"); // printing the menu
        System.out.println(lines); // printing lines
        System.out.println("|     Please select a menu option    |"); // printing the menu
        System.out.println(lines); // printing lines
    }

    // method for generating final price
    public static String getRandomPrice() {

    }

    public static void main(String[] args) {
        // Initalize most datatypes

        do // start of do while loop
        {   
            scan = new Scanner(System.in); // initializing the scanner called scan
            mainMenu();
            //choice = scan.nextInt();
            // while loop verfying that the input is an integer
            while(!scan.hasNextInt()) {
                System.out.println("Input is not an integer. Please enter a valid input!");
                scan.next(); // calling the scanner if not an int to try again
                generateSpacing(); // calling the method to give whitespace
                mainMenu(); // calling the method to bring the UI
            }
            choice = scan.nextInt(); // calling the scanner to find a choice in the UI
            scan.close(); // closing the scanner to prevent errors

            prompt = new Scanner(System.in); // initializing the scanner called scan
            switch (choice) //switch
            {
            case 1:
                // OPTION 1 - Add an Item
                System.out.print('\f'); // clears the screen
                break; // the break to case 1
            case 2:
                //OPTION 2 - Remove an Item
                System.out.print('\f'); // clears the screen
                break; // the break to case 2
            case 3:
                //OPTION 3 - View Items
                System.out.print('\f'); // clears the screen
                break; // the break to case 3
            case 4:
                //OPTION 4 - Checkout
                System.out.print('\f'); // clears the screen
                stay = false; // setting this boolean to false will end the loop
                break; // the break to case 4
            case 5:
                
                break; // the break to case 5
            case 6:
                //Exit
                System.out.print('\f'); // clears the screen
                System.out.println("Thank you for visiting our digital shopping cart!"); // prints to the user
                stay = false; // setting this boolean to false will end the loop
                break; // the break to case 6
            default:
            // default for error control
                System.out.print('\f'); // clears the screen
                System.out.println("Sorry, your request was not between 1 and 6. Please enter a valid input."); // prints to user the error
                stay = true; // setting the loop to true so the user can retry
                generateSpacing(); // calling the method
            }
        prompt.close(); // closing the prompt scanner to prevent bugs
        } while(stay); // end of do while loop with the parameter stay
    } // end of main method
} // end of class
// end of program