public class NumberFun
{
	public static long findNextSquare(long sq)
	{
		return (Math.round(Math.sqrt(sq)) == Math.sqrt(sq)) ? (long) (Math.sqrt(sq) + 1) * (long) (Math.sqrt(sq) + 1) : -1;
	}
}