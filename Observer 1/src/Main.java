
public class Main {

	public static void main(String[] args) {
		//Create subject
		Observable observable = new Observable();
		
		//Create two observers
		Observer observer1 = new Observer("Observer Hank");
		Observer observer2 = new Observer("Observer Bob");
		
		//Register the observers
		observable.addObserver(observer1);
		observable.addObserver(observer2);
	
		//Start listening for input
		observable.getUserInput();

	}

}
