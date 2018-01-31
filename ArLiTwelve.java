import java.util.*;
class ArLiTwelve 
{
	public static void main(String[] args) 
	{
		String [] s = {"Sweety", "Anvitha", "Chitti"};
		ArrayList<String> ay = new ArrayList<String>(Arrays.asList(s));
		ay.add("TwoTwoTwoTwo");
		ay.add("ThreeThreeThree");
		for ( String x : ay )
		{
			System.out.println(x);
		}
		
	}
}
