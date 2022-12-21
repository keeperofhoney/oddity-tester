//imports the scanner which allows for user input
import java.util.Scanner;

// actual class thingy
public class oddityV3 {

  public static void main(String[] args) {

    //this bool allows for the while loop to keep going until it's reasigned
    boolean running = true;
    //What needs to be entered to end the program
    String exit = "exit";
    
    System.out.println(" - Welcome to keeper's first java program - ");
    System.out.println(" - To exit the program, enter 'exit' - ");

    //I guess I gotta deal with this recursion bullshit so here I goes I guess
    while (running == true) {

      // allows for the user input
      Scanner input = new Scanner(System.in);
      System.out.println("**Enter your number**");

      //the try function attempts to run the program, but if it fails will send it to the catch
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

      //will run if the initial program fails (if they dont enter an integer)
      catch (Exception e) {

        String value = input.next();
        boolean exitTrue = (value.equals(exit));

        //ends the program if it sees that "exit" is entered
        if (exitTrue == true) {

          break;

        }

        //Continues the program if any other random crap is entered
        else {

          System.out.println("Please enter a valid integer");  

        }


      }

    }
  }
}
