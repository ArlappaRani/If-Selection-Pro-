package ifstatements;

public class Character {
	public static char FindCase(char a)
	{
		if(a>='A' && a<='Z')
		{
			System.out.println("Upper Case");
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("Lower Case");
		}
		else
		{
			System.out.println("Number");
		}
		return a;
	}

}
