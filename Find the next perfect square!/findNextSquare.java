public class NumberFun
{
	public static long findNextSquare(long sq)
	{
		return (Math.round(Math.sqrt(sq)) == Math.sqrt(sq)) ? (long) Math.pow((Math.sqrt(sq) + 1), 2) : -1;
	}
}