import java.util.Scanner; // importing the scanner
import java.util.*;
 
public class fortuneTeller {
 
    /**
     * Jacob Schwartz Semifinal Project for ICT12
     */

    // method for generating the UI
    public static void mainMenu() {
        String lines = "|-------------------------------------|"; // lines string part 
        System.out.println(lines); // printing lines
        System.out.println("|       Fortune Teller Main Menu      |"); // printing the menu
        System.out.println(lines); // printing lines
        System.out.println("|What type of fortune are you seeking?|"); // printing the menu
        System.out.println(lines);
        System.out.println("|1               Mayan                |"); // printing the menu
        System.out.println("|2              Chinese               |"); // printing the menu
        System.out.println("|3               Zodiac               |"); // printing the menu
        System.out.println("|4               Random               |"); // printing the menu
        System.out.println("|5               Exit                 |"); // printing the menu
        System.out.println(lines); // printing lines
        System.out.println("|     Please select a menu option     |"); // printing the menu
        System.out.println(lines); // printing lines
    }

    public static void mayan() {
        System.out.print('\f');
        System.out.println("1!!!");
    }

    public static void chinese() {
        System.out.print('\f');
        System.out.println("2!?!");
    }

    public static void zodiac() {
        System.out.print('\f');
        System.out.println("3!??!");
    }

    public static void random() {
        Random randomNumb = new Random();
        int numb = randomNumb.nextInt(3);
        if (numb == 0) {
            System.out.println("The Magic Genie has chosen the Mayan fortune for you!");
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            mayan(); // this part is executed when an exception occurs
            }
            mayan();
        }
        if (numb == 1) {
            System.out.println("The Magic Genie has chosen the Chinese fortune for you!");
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            chinese(); // this part is executed when an exception occurs
            }
            chinese();
        }
        if (numb == 2) {
            System.out.println("The Magic Genie has chosen the Zodiac fortune for you!");
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            zodiac(); // this part is executed when an exception occurs
            }
            zodiac();
        }
        else {
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
                System.out.println("Oops! The genie is sleeping!");
            }
        }
    }

    public static void main(String[] args) {
        // Initalize most datatypes
        boolean stay = true;
        do // start of do while loop
        {   
            Scanner scan = new Scanner(System.in); // initializing the scanner called scan
            mainMenu();
            //choice = scan.nextInt();
            // while loop verfying that the input is an integer
            while(!scan.hasNextInt()) {
                System.out.println("Input is not an integer. Please enter a valid input!");
                scan.next(); // calling the scanner if not an int to try again
                System.out.println();
                System.out.println();
                mainMenu(); // calling the method to bring the UI
            }
            int choice = scan.nextInt();
            scan.close(); // closing the scanner to prevent errors
            switch (choice) //switch
            {
            case 1:
                // OPTION 1 - Mayan
                System.out.print('\f'); // clears the screen
                mayan();
                stay = true;
                break; // the break to case 1
            case 2:
                //OPTION 2 - Chinese
                System.out.print('\f'); // clears the screen
                chinese();
                stay = true;
                break; // the break to case 2
            case 3:
                //OPTION 3 - Zodiac
                System.out.print('\f'); // clears the screen
                zodiac();
                stay = true;
                break; // the break to case 3
            case 4:
                //OPTION 4 - Random
                System.out.print('\f'); // clears the screen
                random();
                stay = true; // setting this boolean to false will end the loop
                break; // the break to case 4
            case 5:
                //Exit
                System.out.print('\f'); // clears the screen
                System.out.println("Thank you for coming to the Fortune Teller!!"); // prints to the user
                System.out.println("Have a nice day!");
                stay = false; // setting this boolean to false will end the loop
                break;
            default:
            // default for error control
                System.out.print('\f'); // clears the screen
                System.out.println("Sorry, your request was not between 1 and 5. Please enter a valid input."); // prints to user the error
                stay = true; // setting the loop to true so the user can retry
                System.out.println();
            }
        } while(stay); // end of do while loop with the parameter stay
    } // end of main method
} // end of class
// end of program