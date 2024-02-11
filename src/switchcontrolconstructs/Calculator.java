package switchcontrolconstructs;
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=scan.nextDouble();
		System.out.println("Enter the second number");
		double  b=scan.nextDouble();
		System.out.println("enter the operation to be performed"); 
		char Operation=scan.next().charAt(0);
		switch(Operation)//it can't check all the conditions it will check only required conditions only 
		{	
		case '+' :System.out.println("Addition operation:"+(a+b));
		           break;//It will break  the condition
		case '-' :System.out.println("Subtraction  operation:"+(a-b));
                   break;          
		case '*' :System.out.println("Multiplication operation:"+(a*b));
                   break;          
		case '/' :System.out.println("Division operation:"+(a/b));
                   break;          
	    default:System.out.println("Invalid Input");
		}
	}
}



