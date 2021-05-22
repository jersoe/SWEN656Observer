
public class Observer {
	
	private String name;
	
	public Observer(String name) {
		this.name=name;
	}
	
	public void Update(String message) {
		System.out.println("Hello from "+this.name+ "! The user entered: "+message);
	}
}
