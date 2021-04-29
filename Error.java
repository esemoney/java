public class Match
{
	public static void main (String[] args)
	{
		String text = "esemoneyyyy91";
		String regex = "[a-z]{5,} \\d{2}";
		
		System.out.println(text.matches(regex));
	}
}
