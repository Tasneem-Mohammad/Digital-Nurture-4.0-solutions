package mypackage;

public class Singleton {
	public static void main(String[] args) {
		Logger logger1 =  Logger.getInstance();
		logger1.log("LOG 1");
		Logger logger2 =  Logger.getInstance();
		logger2.log("LOG 2");
		
		System.out.println("Is logger1 is equal to logger2? " + (logger1 == logger2));
	}
}
