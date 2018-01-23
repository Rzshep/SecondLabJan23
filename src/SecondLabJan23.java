import java.util.Scanner;

public class SecondLabJan23 {

	public static void main(String[] args) {
		
		char userChar;
		
		userChar = 'y';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		String name = scan.nextLine();
		
		
		
		
		
		while (userChar == 'y' || userChar == 'Y') {
			
			System.out.println("Okay, " + name + "," + " enter an integer between 1 and 100.");
			
			int firstInt = scan.nextInt();
		
		if (firstInt >= 101 || firstInt <= 0) {
			System.out.println(name + "," + " what did I say?!? I told you to enter an integer between 1 and 100!"
					+ " Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
			
			
		}
		else if (firstInt % 2 != 0 && firstInt <= 60) {
			System.out.println(firstInt + " Odd");
			break;
	}	else if (firstInt % 2 == 0 && firstInt <= 25 && firstInt >= 2) {
			System.out.println("Even and less than 25.");
			System.out.println("Would you like to continue?");
			userChar = scan.next().charAt(0);
			
			
	}	else if (firstInt % 2 == 0 && firstInt <= 60 && firstInt >= 26) {
			System.out.println("Even");
	}	else if (firstInt % 2 == 0 && firstInt >= 60) {
			System.out.println(firstInt + " Even");
	}	else if (firstInt >= 61) {
			System.out.println(firstInt + "Odd and over 60.");
	}

}	 if (userChar == 'n' || userChar == 'N') {
		System.out.println("Goodbye!");}
		
	}
}

