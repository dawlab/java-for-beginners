import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		switch(number) {
		
		case 1: 
			System.out.println("wybra�e� 1");
			break;
		
		case 2: 
			System.out.println("wybra�e� 2");
			break;
		default: 
			System.out.println("Odpowiedz standardowa");
		}
		
	}
}
