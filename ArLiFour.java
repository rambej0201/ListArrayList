import java.util.*;
class ArLiFour 
{
	public static void main(String[] args) 
	{
		ArrayList le = new ArrayList();
		le.add(10);
		le.add("Raghu");
		le.add(20.5);
		le.add(null);

		System.out.println(le);
		System.out.println(le.size());

		le.add(1, "Ram");
		System.out.println(le);
		System.out.println(le.size());
		le.remove(0);
		System.out.println(le);
		System.out.println(le.size());
		le.remove("Raghu");
		System.out.println(le);
		System.out.println(le.size());
	}
}
