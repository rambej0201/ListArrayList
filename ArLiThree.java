import java.util.*;
class ArLiThree 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(584, "NTR");
		Emp e2 = new Emp(678, "ANR");
		Emp e3 = new Emp(125, "MGR");
		Emp e4 = new Emp(945, "SVR");
		
		Student s1 = new Student(247, "John");
		Student s2 = new Student(427, "Jeff");
		Student s3 = new Student(724, "Ricky");
		Student s4 = new Student(8247, "Vicky");

		ArrayList<Emp> lc = new ArrayList<Emp>();
		lc.add(e1);
		lc.add(e2);
		lc.add(e3);
		lc.add(e4);

		ArrayList<Student> ld = new ArrayList<Student>();
		ld.add(s1);
		ld.add(s2);
		ld.add(s3);
		ld.add(s4);

		for ( Emp ee : lc )
		{
			System.out.println(ee.eid+"---"+ee.ename);
		}
		for ( Student ss : ld )
		{
			System.out.println(ss.sid+"---"+ss.sname);
		}
	}
}
