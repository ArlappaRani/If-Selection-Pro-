package switchcontrolconstructs;
import java.util.Scanner;
public class NameAndPlace {

	public static void main(String[] args) {
		//In this program user enter name will print Name+city 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name of the person");
		String Name=scan.next();
		switch(Name) {
		case "Ajay" : System.out.println("Ajay leaves in Delhi");
		              break;
		case "Ankit" : System.out.println("Ankit leaves in Mumbai"); 
		               break;
		case "Arjun" :System.out.println("Arjun leaves in Hyderbad");
		               break;
		case "Akash" :System.out.println("Akash leaves in Bangalore");
		               break;
		default      :System.out.println(Name+" "+"Leaves in India");               
		}

	}

}
