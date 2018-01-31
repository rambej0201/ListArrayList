import java.util.*;
class ArLiThirteen 
{
	public static void main(String[] args) 
	{
		ArrayList<String> au = new ArrayList<String>();
		au.add("FiveFive");
		au.add("SixSix");
		au.add("SevenSeven");
		System.out.println("Actual Generic Collections data");
		for (String g : au )
		{
			System.out.println(g);
			
		} 

		String [] s = new String [au.size()];
		au.toArray(s);
		System.out.println("Array 's' Converted From Generics Collections 'au'");
		for ( String rs : s )
		{
			System.out.println(rs);
		}
		System.out.println("Another non-generic ArrayList to convert collection to Array");
		
		ArrayList av = new ArrayList();
		av.add(85);
		av.add("Ram");
		av.add(15.8);
		av.add(true);
		System.out.println("Actual Non-Generic Collections data");
		for (Object h : av )
		{
			System.out.println(h);
			
		}
		System.out.println("Array Converted From Non- Generics Collections 'av' with Object class");
		Object[] o = av.toArray();
		for ( Object oo : o )
		{
			System.out.println(oo);
		}

	}
}
