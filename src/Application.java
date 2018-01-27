import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int[] values = new int[4];
		
		Scanner input = new Scanner(System.in);
		int number;
		int i = 0;
		
		while (i < values.length) {
			
			System.out.println("Type a number: ");
			
			number = input.nextInt();
			
			values[i] = number;
			
			i += 1;
			
		}
		
		System.out.println(values[0] + " " + values[1] + " " + values[2] + " " + values[3]);
	}
}
