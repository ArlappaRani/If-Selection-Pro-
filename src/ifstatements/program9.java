package ifstatements;
import java.util.Scanner;
public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=scan.nextDouble();
		System.out.println("Enter the second number");
		double b=scan.nextDouble();
		System.out.println("Enter the operation to be performed");
		char operation=scan.next().charAt(0);
		if(operation=='+')
		{
			System.out.println(a+b);
		}
		else if(operation=='-')
		{
			if(a>b)
			{
			System.out.println(a-b);//large value-small value=get positive value
	         }
			else
			{
			System.out.println(b-a);//small-large=get Negative value	
			}}
			
		else if(operation=='*')
		{
			System.out.println(a*b);
		}
		else if(operation=='/')
		{
			if(b==0)//if second number(denominator) is zero then output will not get infinity 
			{
				System.out.println("Denomnator can not be zero");
			}
			else
			{
			System.out.println(a/b);
			}
		}
		else	
		{
			System.out.println("Incorrect operation do perform +,-,*,/");
		}

	}

}
