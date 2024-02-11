package ifstatements;
import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int Age=scan.nextInt();
		if(Age>=18)
		{
			System.out.println("Eligible for voting");
			
		}
		else
		{
			System.out.println("Not eligble for voting");
		}

	}

}
