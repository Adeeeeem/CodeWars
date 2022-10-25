import java.util.ArrayList;
import java.util.List;

public class SmileFaces
{
	public static void main(String[] args)
	{
		List <String> arr =  new ArrayList <String>();
		arr.add(":)"); arr.add(":)"); arr.add("x-]"); arr.add(":ox");
		arr.add(";-("); arr.add(";-)"); arr.add(";~("); arr.add(":~D");
		
		System.out.println(countSmileys(arr));
	}
	
	public static int countSmileys(List <String> arr)
	{
		int c = 0;
		
		for (String i : arr)
			if (i.matches("[:;][-~]?[)D]"))
				c++;

		return c;
	}
}