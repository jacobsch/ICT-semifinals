import java.util.Scanner;
import java.util.*;
 
public class paintAHouse {
 
    /*
     * Jacob Schwartz Semifinal Project for ICT12
     */


    public static double wall(){
        Scanner prompt = new Scanner(System.in);

        // First wall
        System.out.println("What is the length of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops "+name+" please enter a number!");
            prompt.next();
        }
        double length = prompt.nextDouble();
        System.out.println("What is the height of your first wall in meters?");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops "+name+" please enter a number!");
            prompt.next();
        }
        double height = prompt.nextDouble();
        prompt.close();

        double area = length * height;

        System.out.println("What is the area of your window in m^2?");
        System.out.println("If there are no windows enter 0");
        while(!prompt.hasNextDouble()) {
            System.out.println("Oops "+name+" please enter a number!");
            prompt.next();
        }
        double window = prompt.nextDouble();

        return area;
    }

    public static void main(String[] args) {
        String name;
        double areaToPaint;
        double vatougiosSplat = 20.0;
        double totalArea;

        // Intro and Name
        System.out.println("Welcome to the Vatougios Splat Paint Co.");
        System.out.println("We are going to start with your name?");
        Scanner intro = new Scanner(System.in); // Initializing the Scanner
        name = intro.nextLine(); // Prompt for name
        intro.close(); // Closing the Scanner so we can create a new one later with less issues
        System.out.println("Hi "+ name+" welcome to Vatougios Splat!");

        System.out.println("");
        System.out.println(name+", Vatougios Splat only paints houses that have 4 walls that need to be painted.");

        System.out.println("Wall #1!");
        wall();
        System.out.println(name+" the area for your wall is " + area + "m^2");

        Scanner bool = new Scanner(System.in);

    }
}