package ifstatements;

public class Calculator {
	public static double FindCalculator(double a,double b,double  c)
	{
		if(c=='+')
		{
			System.out.println("perform addition"+(a+b));
		}
		else if(c=='-')
		{
			System.out.println("perform Subtraction"+(a-b));
		}
		else if(c=='*')
		{
			System.out.println("perform multiplication"+(a*b));
		}
		else if(c=='/')
		{
			System.out.println("perform division"+(a/b));
		}
		else
		{
			System.out.println("To enter only add,sub,mul,div operations else it will not perform other operations");
		}
		return c;
	}

}
