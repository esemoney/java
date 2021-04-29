// rock paper scissors game
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RockPaperScissors
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your name?  ");
    String name = sc.next();

    // greetings
    System.out.println("Hello "+ name + " welcome to Rock, Paper, Scissors!");
    System.out.println("\nThe rules are simple. You have to pick one of \"Rock\", \"Paper\" and \"Scissors\". ");
    System.out.println("\nPaper covers rock and wins.");
    System.out.println("\nScissors cuts paper and wins.");
    System.out.println("\nRock smashes scissors and wins.");
    System.out.println("Press \"quit\" to end the game.");
    // end of greetings

    // prompt for play

    String userPlay = "";

    System.out.println("GO!");
    while(!userPlay.equalsIgnoreCase("quit"))
    {
    System.out.println("\nRock, Paper, Scissors");
    userPlay = sc.next();

      // randomize computer play
    String[] arr = {"Rock", "Paper", "Scissors"};
    Random r = new Random();
    int randomNumber = r.nextInt(arr.length);
    String compPlay = arr[randomNumber];

    //System.out.println(compPlay);

    // just making actions.
    String action = "";

    if(compPlay.equalsIgnoreCase("rock"))
    {
      action = "smashes";
    }

    if(compPlay.equalsIgnoreCase("paper"))
    {
      action = "covers";
    }

    if(compPlay.equalsIgnoreCase("scissors"))
    {
      action = "cuts";
    }
    // end of actions above

    // begin checking for win
    boolean ese = false;
    // na here work start to ensure user input is in array arr.
    for(String s: arr)
    {
      if(s.equalsIgnoreCase(userPlay))
      {
        // using array as a container variable of sorts
        ese = true;
      }
    }

    if (ese == true)
    {
      System.out.println(compPlay);

      if ((userPlay.equalsIgnoreCase(compPlay)))
      {
        System.out.println("TIE!!!");
      }

      else if (userPlay.equalsIgnoreCase("rock") && compPlay.equalsIgnoreCase("scissors"))
      {
        System.out.println("You win! Rock smashes scissors.");
      }

      else if (userPlay.equalsIgnoreCase("scissors") && compPlay.equalsIgnoreCase("paper"))
      {
        System.out.println("You win! Scissors cuts paper");
      }

      else if (userPlay.equalsIgnoreCase("paper") && compPlay.equalsIgnoreCase("rock"))
      {
        System.out.println("You win! Paper covers rock");
      }

      else
      {
        System.out.println("I win! "+ compPlay +" " + action +" " + userPlay + "." );
      }

    }

    else
    {
      if(userPlay.equalsIgnoreCase("quit"))
      {
        System.out.println("Bye!");
      }

      else
      {
        System.out.println("Wrong input. Try again or press \"quit\" to exit");
      }
    }

    // end of while loop below
    }

  // end of main method below
  }

//end of public class below
}
