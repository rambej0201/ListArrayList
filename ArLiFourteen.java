import java.util.*;
class ArLiFourteen 
{
	public static void main(String[] args) 
	{
		ArrayList<String> ay = new ArrayList<String>();
		ay.add("Raghuram");
		ay.add("Saraswathi");
		ay.add("Hanuman");
		ay.add("Bhagavan");
		ay.add("Swarupa");
		ay.add("SandyaRani");
		ay.add("Anuradha");
		ay.add("Santosh");
		ay.add("Anusuya");

		System.out.println("Before sorting data of collections ay ");
		System.out.println(ay);
		Collections.sort(ay);
		System.out.println("After sorting data of collections ay with Collections.sort() method ");
		System.out.println(ay);

	}
}
