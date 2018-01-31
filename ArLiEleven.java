import java.util.*;
class ArLiEleven 
{
	public static void main(String[] args) 
	{
		//normal version and non type safety
		ArrayList ap = new ArrayList();
		ap.add(new Emp(2435, "Akram"));
		ap.add(new Emp(3241, "Rao"));

		//first approach for non generic
		for (Object o : ap)
		{
			if (o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println(e.eid+"---"+e.ename);
			}
		}
		
		//second approach for non generic
		Emp ee = (Emp)ap.get(0);
		System.out.println(ee.eid+"---"+ee.ename);
		
		//generic version with type safety
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(658, "Ratna"));
		s.add(new Student(496, "Durga"));
		s.add(new Student(269, "Anu"));

		//first approach for generic
		for ( Student st : s )
		{
			System.out.println(st.sid+"---"+st.sname);
		}
		//second approach for generic
		Student stu = s.get(0);
		Student stu1 = s.get(1);
		Student stu2 = s.get(2);
		System.out.println(stu.sid+"---"+stu.sname);

	}
}
