package ifstatements;
import java.util.Scanner;
public class CharacterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Character Value");
		char Value=scan.next().charAt(0);
		Character.FindCase(Value);

	}

}
