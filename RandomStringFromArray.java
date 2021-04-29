import java.util.Random;

public class RandomStringFromArray
{
  	public static void main(String[] args)
    {
      	String[] arr={"e", "ed", "3df", "yui", "ddddddb"};
      	Random r=new Random();
      	int randomNumber=r.nextInt(arr.length);
    //  	System.out.println(arr[randomNumber]);
        String compPlay = arr[randomNumber];
        System.out.println(compPlay);

    }
}
