import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Try
{
  public static void main(String[] args)
  {
    // create the array containing all the possible points

    int[] hat = new int[] { 1, 2, 4, 8, 16, 32, 64};

    int quota = 124;
    int sum = 0;
    int pick = 0;
    int a = 0;

    while(quota > sum)
    {
      // randomize play
      pick = hat[new Random().nextInt(hat.length)];

      System.out.println("The pick is " + pick);

      // assigning indexes
      if (pick == 1)
      {
        a = 0;
      }

      else if (pick == 2) {

        a = 1;
      }

      else if (pick == 4) {

        a = 2;
      }

      else if (pick == 8) {

        a  = 3;
      }

      else if (pick == 16) {

        a = 4;
      }

      else if (pick == 32) {

        a = 5;
      }

      else if (pick == 64) {

        a = 6;
      }
    //  a = Arrays.asList(hat).indexOf(64);
      System.out.println("THe index is " + a);

      // to remove the value of a from the array

    /* for (int e = a; e < hat.length - 1; e++)
      {
          hat[e] = hat[e + 1];
      }*/

      hat = removeTheElement(hat, a);

      sum += pick;

    }

    System.out.println("The sum is " + sum);

  }
}
