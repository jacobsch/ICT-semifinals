import java.util.Scanner; // importing the scanner
import java.util.*; // the rest of what's needed
 
 // start of departmentCost class
public class departmentCost {
 
    /**
     * Jacob Schwartz Semifinal Project for ICT12
     */

    // start of main method
    public static void main(String[] args) {

        System.out.println("Welcome to the department store wage calc!");

        Scanner numWorkers = new Scanner(System.in);
        System.out.println("How many workers are there?");

        while(!numWorkers.hasNextInt()) {
            System.out.println("Input is not an integer. Please enter a valid input!");
            numWorkers.next(); // calling the scanner if not an int to try again
        } // end of while loop
        int workers = numWorkers.nextInt();
        numWorkers.close();

    for (int i=0;i<workers ;i++ ) {
        Scanner price = new Scanner(System.in);

        System.out.println("What is the wage $?");
        while(!price.hasNextInt()) {
            System.out.println("Input is not an integer. Please enter a valid input!");
            price.next(); // calling the scanner if not an int to try again
        } // end of while loop
        int wage = price.nextInt();

        price.close();

        Scanner time = new Scanner(System.in);
        System.out.println("How many hours did they work?");

        while(!time.hasNextInt()) {
            System.out.println("Input is not an integer. Please enter a valid input!");
            time.next(); // calling the scanner if not an int to try again
        } // end of while loop
        int hours = time.nextInt();

        int totalCosts = wage * hours;

        System.out.println("Your total cost for wages is " + totalCosts);
        System.out.println();
        System.out.println();
    }
    System.out.println("Goodbye");
    } // end of main method
} // end of class
// end of program