package ifstatements;
import java.util.Scanner;
public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		if(a>0)
		{
			System.out.println("positive Number");
		}
		else if(a<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
