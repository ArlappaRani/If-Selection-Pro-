package ifstatements;
import java.util.Scanner;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		//if the number is greater than a it print if statement else it print else statement
		if(a>0)
		{
			System.out.println("positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}

	}

}
