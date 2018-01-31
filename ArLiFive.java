import java.util.*;
class ArLiFive 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(845, "Om");
		Emp e2 = new Emp(458, "Vamshi");
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		
		Emp e3 = new Emp(254, "Akram");
		Emp e4 = new Emp(542, "Chitty");
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
		for ( Emp e : a2 )
		{
			System.out.println(e.eid+"---"+e.ename);
		}
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a1));
		a2.remove(e1);
		for ( Emp e : a2 )
		{
			System.out.println(e.eid+"---"+e.ename);
		}
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a1));

	}
}
