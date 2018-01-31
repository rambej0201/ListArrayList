import java.util.*;
class ArLiTwo 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111, "Tyson");
		Emp e2 = new Emp(222, "Sri");
		Student s1 = new Student(101, "Bhanu");
		Student s2 = new Student(202, "Raja");
		ArrayList lb = new ArrayList();
		lb.add(e1);
		lb.add(e2);
		lb.add(s1);
		lb.add(s2);
		lb.add(20);
		lb.add("Raghu");
		
		for (Object o : lb )
		{
			if (o instanceof Emp)
			{
				Emp ee = (Emp)o;
				System.out.println(ee.eid+"---"+ee.ename);
			}
			if (o instanceof Student)
			{
				Student ss = (Student)o;
				System.out.println(ss.sid+"---"+ss.sname);
			}
			if (o instanceof Integer)
			{
				System.out.println(o);
			}
			if (o instanceof String)
			{
				System.out.println(o);
			}
		}
	}
}
