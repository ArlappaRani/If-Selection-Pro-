package ifstatements;
import java.util.Scanner;
public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the charter");
		char character=scan.next().charAt(0);
		if(character>='A' && character<='Z')
		{
			System.out.println("UpperCase");
		}
		else if(character>='a' && character<='z')
		{
			System.out.println("LowerCase");
		}
		else
		{
			System.out.println("Number");
		}

	}

}
