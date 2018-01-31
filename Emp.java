class Emp implements Comparable
{
	int eid;
	String ename;
	
	Emp(int i, String n){
		this.eid = i;
		this.ename = n;
	}
	public int compareTo(Object o)
	{
		Emp e = (Emp)o;
		if (eid == e.eid)
		{
			return 0;
		}
			else if (eid > e.eid)
			{
				return 1;
			}
				else
					{return -1;
				}

	}
}
