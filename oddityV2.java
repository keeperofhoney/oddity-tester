//imports the scanner which allows for user input
import java.util.Scanner;

// actual class thingy
public class oddityV2 {

  public static void main(String[] args) {

    //this bool allows for the while loop to keep going until it's reasigned
    boolean running = true;

    System.out.println(" - Welcome to keeper's first java program - ");

    //I guess I gotta deal with this recursion bullshit so here I goes I guess
    while (running == true) {

      // allows for the user input
      Scanner input = new Scanner(System.in);
      System.out.println("**Enter your number**");

      try {

        //makes value the user input, nextDouble ensures it's a double
        double value = input.nextDouble();

        //This checks if the value input is even or odd by seeing if there is a remainder after dividing by two
        double oddity = value % 2;

        //these two are pretty self evident
        if (oddity == 0) { 

          System.out.println(value + " is even");
    
        }
    
        else {
    
          System.out.println(value + " is odd");
    
        }

        //this will end the program after it completes, but I want it to go on forever
        //running = false;

      }

      catch (Exception e) {

        System.out.println("Please enter a valid integer");

      }

    }
  }
}
