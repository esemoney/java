public class Regex
{
	public static void main (String[] args)
	{
		String text = "Tochukwu";
		String regex = "[A-Z]\\w{1,}";
		
		System.out.println(text.matches(regex));
	}
}
