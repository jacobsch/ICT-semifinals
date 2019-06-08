import java.util.Scanner;
import java.util.*;
 
public class main {
 
    /*
     * Jacob Schwartz Semifinal Project for ICT12
     */
    public static void main(String[] args) {
        String lines = "|------------------------------------|";
        String name;
        String answer;
        double areaToPaint;
        double vatougiosSplat = 20.0;
        double length;
        double height;
        double areaOne;
        double areaTwo;
        double areaThree;
        double areaFour;
        double areaFinal;

        // Intro and Name
        System.out.println("Welcome to the Vatougios Splat Paint Co.");
        System.out.println("We are going to start with your name?");
        Scanner intro = new Scanner(System.in); // Initializing the Scanner
        name = intro.nextLine(); // Prompt for name
        intro.close(); // Closing the Scanner so we can create a new one later with less issues
        System.out.println("Hi "+ name+" welcome to Vatougios Splat!");

        System.out.println("");
        System.out.println(name+", Vatougios Splat only paints houses that have 4 walls that need to be painted.");
        Scanner prompt = new Scanner(System.in);

        // First wall
        System.out.println("What is the length of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops "+name+" please enter a number!");
            prompt.next();
        }
        length = prompt.nextDouble();
        System.out.println("What is the height of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops "+name+" please enter a number!");
            prompt.next();
        }
        height = prompt.nextDouble();
        areaOne = height*length;
        System.out.println(name+" the area for your first wall is " + areaOne + "m^2");

        System.out.println("Do you have a window you want to subtract from this walls area?");
        System.out.println("");
        Scanner bool = new Scanner(System.in);
        answer = bool.nextLine();
        answer = answer.toLowerCase();
        if (answer == "y" || answer == "yes") {
            System.out.println("yeeee");
        }
    }
}