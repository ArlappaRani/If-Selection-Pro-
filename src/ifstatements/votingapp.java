package ifstatements;
import java.util.Scanner;
public class votingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age of a person");
		int Age=scan.nextInt();
		Voting Va=new Voting();
		Va.Eligible(Age);

	}

}
