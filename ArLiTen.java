import java.util.*;
class ArLiTen 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111, "TYSON");
		Emp e2 = new Emp(222, "AKRAM");
		Emp e3 = new Emp(333, "Vamshi");
		Emp e4 = new Emp(444, "Ram");

		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);

		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);

		a2.removeAll(a1);
		a2.retainAll(a1);
		for ( Emp e : a2 )
		{
			System.out.println(e.eid+"---"+e.ename);
		}
	}
}
