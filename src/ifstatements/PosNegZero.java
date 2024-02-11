package ifstatements;

public class PosNegZero {
	public static int Number(int a)
	{
		if(a%2==0)
		{
			System.out.println("Postive Number");
		}
		else if(a%2!=0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
		return a;
	}

}
