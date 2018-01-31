import java.util.*;
class ArLiFifteen 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp> aj = new ArrayList<Emp>();
		aj.add(new Emp(1476, "Bhanu"));
		aj.add(new Emp(4789, "Chendu"));
		aj.add(new Emp(8947, "Om"));
		aj.add(new Emp(3654, "Dinesh"));
		aj.add(new Emp(6981, "Rishikesh"));
		aj.add(new Emp(3547, "Sreeja"));
		aj.add(new Emp(2759, "Shourya"));
		aj.add(new Emp(2489, "Anvita"));
		
		Collections.sort(aj);

		for (Emp e : aj )
		{
			System.out.println(e.eid+"---"+e.ename);
		}

		System.out.println("Sorted emplayees by employee id");
	}
}
