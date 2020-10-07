package Additional.Classes;

public class Singleton {
	//Static variable of type singleton
	private static Singleton singleInstance=null;
	public String s;
	//private Constructor
	private Singleton(){
		s="I am a string in Singleton class";		
	}
	
	public static Singleton getInstance(){
		if (singleInstance==null){
			singleInstance = new Singleton();
			return singleInstance;
		}
		else{
		return singleInstance;			
	}
	}

}
