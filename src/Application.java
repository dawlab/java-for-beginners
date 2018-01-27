import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int[] [] grid = {
				
				{1,2,3},
				{1,2,3},
				{6,7,8}
		};
		
		for (int row=0; row < grid.length; row++) {
			for (int col=0; col < grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}
			
			System.out.println();
		}
		
	}
	
	
}
