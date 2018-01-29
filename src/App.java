

interface Infor {
	
	void showInfo();
}

class Pracownik implements Infor {
	@Override
	public void showInfo() {
		
		System.out.println(imie + ", " + nazwisko + ", " + wiek);
		
	}

	String imie;
	String nazwisko; 
	int wiek; 
	
	Pracownik(String imie, String nazwisko, int wiek) {
		this.imie = imie; 
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
}

class Programista extends Pracownik implements Infor {
	String jezykProgramowania; 
	
	Programista(String imie, String nazwisko, int wiek, String jezykProgramowania) {
		super(imie, nazwisko, wiek);
		this.jezykProgramowania = jezykProgramowania;
	}

	@Override
	public void showInfo() {
		
		System.out.println(imie + ", " +  nazwisko + ", " + wiek + ", " + jezykProgramowania);
	}
	
}
 
public class App{
  public static void main(String[] args) {
	 
	  Pracownik adam = new Pracownik("Adam", "Zagórski", 32);
	  Programista jarek = new Programista("Jarek", "Pypko", 26, "Java Core");
	  
	  adam.showInfo();
	  jarek.showInfo();
	 
  }
}