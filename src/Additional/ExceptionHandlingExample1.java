package Additional;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data =100;
		try{
			int a=data/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		finally{
			System.out.println("The finally block");
		}
		System.out.println("Rest of the code ");

	}

}
