import java.util.Scanner; // importing the Scanner
import java.util.*; // importing everything else
 
 // main class
public class paintAHouse {
 
    /*
     * Jacob Schwartz Semifinal Project for ICT12
     */

    // method to find walls area
    public static double getWallArea(){
        Scanner prompt = new Scanner(System.in); // opening the scanner called prompt

        // First wall
        System.out.println("What is the length of your first wall in meters?"); // printing the preprompt message

        // ensure prompt has a double
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!"); // the message for the reprompt
            prompt.next();
        }
        double length = prompt.nextDouble();
        System.out.println("What is the height of your first wall in meters?");
        // ensure prompt has a double
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!"); // the message for the reprompt
            prompt.next()
        }
        double height = prompt.nextDouble(); // the prompt

        double area = length * height; // new area value

        System.out.println(); // white space
        System.out.println("What is the area of your window in m^2?");
        System.out.println("If there are no windows enter 0");
        // ensure prompt has a double
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!"); // the message for the reprompt
            prompt.next();
        }
        double window = prompt.nextDouble(); // the prompt

        System.out.println(); // white space
        System.out.println("What is the area of your door in m^2?");
        System.out.println("If there are no doors enter 0");
        // ensure prompt has a double
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!"); // the message for the reprompt
            prompt.next();
        }
        double door = prompt.nextDouble(); // the prompt

        area = area - door; // new area value subtracting the door
        prompt.close(); // closing the Prompt
        return area; // returning the area value
    } // ending of the method to find area

    public static void main(String[] args) {
        // Variable declaration
        String name;
        double areaToPaint;
        double vatougiosSplat = 20.0;
        double areaTotal;
        String unit = "m2";

        // Intro
        System.out.println("Welcome to the Vatougios Splat Paint Co.");
        // Name
        System.out.println("We are going to start with your name?");
        Scanner intro = new Scanner(System.in); // Initializing the Scanner
        name = intro.nextLine(); // Prompt for name
        intro.close(); // Closing the Scanner so we can create a new one later with less issues
        System.out.println("Hi "+ name+" welcome to Vatougios Splat!"); // Welcome message

        System.out.println(); // white space
        System.out.println(name+", Vatougios Splat only paints houses that have 4 walls that need to be painted."); // message

        System.out.println(); // white space
        System.out.println("Wall #1!"); // first wall
        double areaOne = getWallArea(); // creating a variable equal to the method being run
        System.out.print('\f'); // clears the screen
        System.out.println(name+" the area for your first wall is " + areaOne + unit);

        System.out.println(); // white space
        System.out.println("Wall #2!"); // next wall
        double areaTwo = getWallArea(); // creating a variable equal to the method being run
        areaTotal = areaOne + areaTwo; // new area total
        System.out.println(name+" the area for your second wall is " + areaTwo + unit);
        System.out.print('\f');
        System.out.println("Your current total area is " + areaTotal + unit);

        System.out.println(); // white space
        System.out.println("Wall #3!"); // next wall
        double areaThree = getWallArea(); // creating a variable equal to the method being run
        areaTotal = areaTotal + areaThree; // new area total
        System.out.println(name+" the area for your third wall is " + areaThree + unit);
        System.out.print('\f'); // clears the screen
        System.out.println("Your current total area is " + areaTotal + unit);

        System.out.println(); // white space
        System.out.println("Wall #4!"); // next wall
        double areaFour = getWallArea(); // creating a variable equal to the method being run
        areaTotal = areaTotal + areaFour; // new area total
        System.out.println(name+" the area for your fourth and final wall is " + areaFour + unit);
        System.out.print('\f'); // clearing the screen
        System.out.println("The total paintable surface is " + areaTotal + unit);
        System.out.println(); // white space

        System.out.println("Now lets do some calculations " + name + "!!"); // next part of the program
        double gallons = areaTotal/10; // double gallons equal the total area divided by 10
        gallons = Math.ceil(gallons); // rounding up the variable

        System.out.println(name + ", your house requires just about " + gallons + " of paint to cover your house fully.");
        double paintPrice = gallons * 40; // the amount of gallons * 40$
        paintPrice = paintPrice - 0.01; // bringing the value to .99
        System.out.println("Vatougios Splat will paint your house for an incredible deal of $40 per gallon"); // message
        System.out.println("bringing the total paint price to $" + paintPrice); // message
        System.out.println(); // white space
        System.out.println("Have a good day " +name +"!"); // exit message
    }
}