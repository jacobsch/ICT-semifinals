import java.util.Scanner; // importing the scanner
import java.util.*;
 
 // start of fortuneTeller class
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
        System.out.println("The mayan fortune is telling me some very strong stuff!");
        System.out.println();
        System.out.println("In approximately 3 months you will be hit by a bus!");
        System.out.println("Then there is only a 20% you survive the crash!");
        System.out.println("Have a good day!");
    }

    public static void chinese() {
        System.out.print('\f');
        System.out.println("The chinese fortune teller has some very bad news...");
        System.out.println();
        System.out.println("Unfortunately in 36 hours you and Owen Holman will be dating");
        System.out.println("Try to keep it positive after that! Not much else is happening in your life");
    }

    public static void zodiac() {
        System.out.print('\f');
        System.out.println("The zodiac fortune! You came to the right place!!");
        System.out.println();
        System.out.println("There is only good stuff in your fortune");
        System.out.println("As it sits right now you will live a long life!");
        System.out.println("Have lots of wealth!");
        System.out.println("and won't see Owen Holman in a long time!");
    }

    // random method
    public static void random() {
        Random randomNumb = new Random(); // init random class
        int numb = randomNumb.nextInt(3); // random number from random between 0-2
        if (numb == 0) {
            System.out.println("The Magic Genie has chosen the Mayan fortune for you!"); // print
            // try catch for delay
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            mayan(); // this part is executed when an exception occurs
            }
            mayan();
        }
        if (numb == 1) {
            System.out.println("The Magic Genie has chosen the Chinese fortune for you!"); // print
            // try catch for delay
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            chinese(); // this part is executed when an exception occurs
            }
            chinese();
        }
        if (numb == 2) {
            System.out.println("The Magic Genie has chosen the Zodiac fortune for you!"); // print
            // try catch for delay
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
            zodiac(); // this part is executed when an exception occurs
            }
            zodiac();
        }
        else {
            // try catch for delay
            try {
            Thread.sleep(2000);
            } 
            catch(InterruptedException e) {
                System.out.println("Oops! The genie is sleeping!");
            }
        }
    }

    // start of main method
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