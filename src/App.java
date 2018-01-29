import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Punkt2d {
	int a;
	int b; 
	
	Punkt2d(int a, int b) {
		this.a = a;
		this.b = b; 
	}
	
	Punkt2d() {
		
	}
	
	void showPunkt2d() {
		System.out.println(a + "," + b);
	}
}

class Punkt3d extends Punkt2d {
	
	int c; 
	
	Punkt3d(int a, int b, int c) {
		this.a = a;
		this.b = b; 
		this.c = c;
	}
	
	Punkt3d() {
		
	}
	
	void showPunkt3d() {
		System.out.println(a + "," + b + "," + c);
	}
}
 
public class App{
  public static void main(String[] args) throws FileNotFoundException{
	 
	  Punkt2d nowy = new Punkt2d(2,4);
	  Punkt3d nowy3d = new Punkt3d(16,14,12);
	  
	  nowy.showPunkt2d();
	  nowy3d.showPunkt3d();
	  nowy3d.showPunkt2d();
	  
  }
}