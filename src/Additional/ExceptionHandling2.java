package Additional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=1,k=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=8;
		try{
			System.out.println("Enter the number");
			j=Integer.parseInt(br.readLine());
			k=i+j;
			if (k<10)
			{
				throw new ArithmeticException();
			}
			System.out.println("Output is :"+k);
		}catch(IOException e){
			System.out.println("Some IO Exception error");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Minimum value for the output is 10");
		}
		catch(Exception e)
		{
			System.out.println("Unknown exception "+e);
		}
	}

}
