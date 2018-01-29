import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class App{
  public static void main(String[] args) throws FileNotFoundException{
    
	  PrintWriter zapis = new PrintWriter("ala.txt.txt");
	  
	  zapis.println("zapis do pliku");
	  zapis.close();
	  
	  File plik = new File("ala.txt.txt");
	  Scanner odczyt = new Scanner(plik);
	  System.out.println(odczyt.nextLine());
	  
  }
}