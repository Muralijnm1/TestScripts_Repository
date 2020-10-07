package Additional;

public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive to Wrapper
		int num = 100;
		Integer obj = Integer.valueOf(num);
		System.out.println("Primitive-->Wrapper "+num+" "+obj);
		
		//Wrapper to Primitive
		Integer obj1 = new Integer(100);
		int num1 = obj1.intValue();
		System.out.println("Wrapper-->Primitive "+num1+" "+obj1);
	}

}
