// rock paper scissors game
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RPS
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your name?  ");
    String name = sc.next();

    System.out.println("Hello "+ name + " welcome to Rock, Paper, Scissors!");
    System.out.println("\nThe rules are simple. You have to pick one of \"Rock\", \"Paper\" and \"Scissors\". ");
    System.out.println("\nPaper covers rock and wins.");
    System.out.println("\nScissors cuts paper and wins");
    System.out.println("\nRock smashes scissors and wins");
    System.out.println("Press \"quit\" to end the game.");

    // prompt for play
    // trying to make a sentinel controlled loop to allow the user play till they are tired

    String userPlay = "";
    System.out.println("GO!");

    for(String x : arr)
    {
	     if(x == userPlay)
       {
        boolean found = true;
       }
     }

    //while(!userPlay.equalsIgnoreCase("quit"))
    while(found == true)
    {
    System.out.println("\nRock, Paper, Scissors");
    userPlay = sc.next();

      // randomize computer play
    String[] arr = {"Rock", "Paper", "Scissors"};
    Random r = new Random();
    int randomNumber = r.nextInt(arr.length);
    String compPlay = arr[randomNumber];
    System.out.println(compPlay);

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

    // begin checking for win

      // winning sequences
      // na here work dey
    //if(!userPlay.equalsIgnoreCase("quit"))
    //if(check(arr, userPlay) == true)
    // my issue is asking the user for input and only allowing if
    boolean found = Arrays.stream(arr).anyMatch(t -> t.equals(userPlay));
    if (found == true)
    {
      if ((userPlay.equalsIgnoreCase(compPlay)))
      {
        System.out.println("TIE!!!");
      }

      else if (userPlay.equalsIgnoreCase("rock") && compPlay.equalsIgnoreCase("scissors")) {

        System.out.println("You win! Rock smashes scissors.");

      }

      else if (userPlay.equalsIgnoreCase("scissors") && compPlay.equalsIgnoreCase("paper")) {

        System.out.println("You win! Scissors cuts paper");
      }

      else if (userPlay.equalsIgnoreCase("paper") && compPlay.equalsIgnoreCase("rock")) {

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

  }

}
