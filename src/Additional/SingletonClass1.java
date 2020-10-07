package Additional;

import Additional.Classes.Singleton;

public class SingletonClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.s=(x.s).toUpperCase();
		System.out.println("Singleton from x,y,z is "+x.s+" "+y.s+" "+z.s);
		z.s=(z.s).toLowerCase();
		System.out.println("Singleton from x,y,z is "+x.s+" "+y.s+" "+z.s);
	}

}
