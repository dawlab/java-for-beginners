import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double number;
		
		do {
			System.out.println("Enter a number: ");
			number = input.nextDouble();
		} while( number != 5);
		
		System.out.println("Mamy to, jest 5!!!!!!");
		
	}
}
