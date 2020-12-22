import java.util.Arrays;

public class AreSame
{
	public static boolean comp(int[] a, int[] b)
	{
		if ((a == null) || (b == null) || (a.length != b.length))
			return false;

		a = Arrays.stream(a).map(i -> i * i).toArray();
		Arrays.sort(a);
		Arrays.sort(b);

		return (Arrays.equals(a, b));
	}
}