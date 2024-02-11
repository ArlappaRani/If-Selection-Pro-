package ifstatements;

public class Voting {
	public int Eligible(int a)
	{
		if(a>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Person not eligible for voting");
		}
		return a;
	}

}
