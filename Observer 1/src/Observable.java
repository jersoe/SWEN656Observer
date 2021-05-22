import java.util.ArrayList;
import java.util.Scanner;

public class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o) {
		this.observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}
	
	public void alertObservers(String message) {
		for (Observer o : this.observers) 
		{ 
		    o.Update(message);
		}
	}
	
	 public void getUserInput() {
	        Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNextLine()) {
	        	alertObservers(scanner.nextLine());
	        }
	    }
}
