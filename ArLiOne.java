import java.util.*;
class ArLiOne 
{
	public static void main(String[] args) 
	{
		ArrayList la = new ArrayList();
		la.add(25); //Integer object //auto boxing
		la.add(78); //Integer object //auto boxing
		la.add("Renu");
		la.add("Puri");
		la.add(4.5); //Double object //auto boxing
		la.add('x');
		la.add(null);
		la.add(73); //Integer object //auto boxing
		System.out.println(la);
	}
}
