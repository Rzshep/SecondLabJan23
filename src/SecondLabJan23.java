import java.util.Scanner;

public class SecondLabJan23 {

	public static void main(String[] args) {
		
		char userChar; // declare char userChar
		
		userChar = 'y'; // make 'y' userChar
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		String name = scan.nextLine();
		
		
		
		
		
		while (userChar == 'y' || userChar == 'Y') { // use while loop to begin
			
			System.out.println("Okay, " + name + "," + " enter an integer between 1 and 100.");
			
			int firstInt = scan.nextInt();
		
		if (firstInt >= 101 || firstInt <= 0) { // the conditional statements are a part of the while loop
			System.out.println(name + "," + " what did I say?!? I told you to enter an integer between 1 and 100! Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0); // user inputs userChar
			
			
		} else if (firstInt % 2 != 0 && firstInt <= 60) {
			System.out.println(firstInt + " Odd");
			System.out.println("Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
			
		} else if (firstInt % 2 == 0 && firstInt <= 25 && firstInt >= 2) {
			System.out.println("Even and less than 25.");
			System.out.println("Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
			
			
		} else if (firstInt % 2 == 0 && firstInt <= 60 && firstInt >= 26) {
			System.out.println("Even");
			System.out.println("Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
			
		} else if (firstInt % 2 == 0 && firstInt >= 60) {
			System.out.println(firstInt + " Even");
			System.out.println("Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
			
		} else if (firstInt >= 61) {
			System.out.println(firstInt + " Odd and over 60.");
			System.out.println("Would you like to continue? (y/n): ");
			userChar = scan.next().charAt(0);
		}

		} if (userChar == 'n' || userChar == 'N') { // this conditional statement is executed outside of the while loop and can only be executed once the while loop no longer runs
			System.out.println("Goodbye!");}		
		
		}
		}


