import java.util.Scanner;
import java.util.*;
 
public class paintAHouse {
 
    /*
     * Jacob Schwartz Semifinal Project for ICT12
     */


    public static double getWallArea(){
        Scanner prompt = new Scanner(System.in);

        // First wall
        System.out.println("What is the length of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!");
            prompt.next();
        }
        double length = prompt.nextDouble();
        System.out.println("What is the height of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!");
            prompt.next();
        }
        double height = prompt.nextDouble();

        double area = length * height;

        System.out.println();
        System.out.println("What is the area of your window in m^2?");
        System.out.println("If there are no windows enter 0");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!");
            prompt.next();
        }
        double window = prompt.nextDouble();

        System.out.println();
        System.out.println("What is the area of your door in m^2?");
        System.out.println("If there are no doors enter 0");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops please enter a number!");
            prompt.next();
        }
        double door = prompt.nextDouble();

        area = area - door;
        prompt.close();
        return area;
    }

    public static void main(String[] args) {
        String name;
        double areaToPaint;
        double vatougiosSplat = 20.0;
        double areaTotal;
        String unit = "m2";

        // Intro and Name
        System.out.println("Welcome to the Vatougios Splat Paint Co.");
        System.out.println("We are going to start with your name?");
        Scanner intro = new Scanner(System.in); // Initializing the Scanner
        name = intro.nextLine(); // Prompt for name
        intro.close(); // Closing the Scanner so we can create a new one later with less issues
        System.out.println("Hi "+ name+" welcome to Vatougios Splat!");

        System.out.println("");
        System.out.println(name+", Vatougios Splat only paints houses that have 4 walls that need to be painted.");

        System.out.println();
        System.out.println("Wall #1!");
        double areaOne = getWallArea();
        System.out.print('\f');
        System.out.println(name+" the area for your first wall is " + areaOne + unit);

        System.out.println();
        System.out.println("Wall #2!");
        double areaTwo = getWallArea();
        areaTotal = areaOne + areaTwo;
        System.out.println(name+" the area for your second wall is " + areaTwo + unit);
        System.out.print('\f');
        System.out.println("Your current total area is " + areaTotal + unit);

        System.out.println();
        System.out.println("Wall #3!");
        double areaThree = getWallArea();
        areaTotal = areaTotal + areaThree;
        System.out.println(name+" the area for your third wall is " + areaThree + unit);
        System.out.print('\f');
        System.out.println("Your current total area is " + areaTotal + unit);

        System.out.println();
        System.out.println("Wall #4!");
        double areaFour = getWallArea();
        areaTotal = areaTotal + areaFour;
        System.out.println(name+" the area for your fourth and final wall is " + areaFour + unit);
        System.out.print('\f');
        System.out.println("The total paintable surface is " + areaTotal + unit);
        System.out.println();

        System.out.println("Now lets do some calculations " + name + "!!");
        double gallons = areaTotal/10;
        gallons = Math.ceil(gallons);

        System.out.println(name + ", your house requires just about " + gallons + " of paint to cover your house fully.");
        double paintPrice = gallons * 40;
        paintPrice = paintPrice - 0.1;
        System.out.println("Vatougios Splat will paint your house for an incredible deal of $40 per gallon");
        System.out.println("bringing the total paint price to $" + paintPrice);
        System.out.println();
        System.out.println("Have a good day " +name +"!");
    }
}