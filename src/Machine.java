
public class Machine implements Info {
	
	@Override
	public void showInfo() {
		System.out.println("Machnie id is: " + id);
	}

	private int id = 7;
	
	public void start() {
		System.out.println("Machine is started.");
	}
}
