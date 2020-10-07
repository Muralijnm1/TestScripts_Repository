package OOOPS;

public class ClassExample {

	public class class2 {
		int i=2;
		public void print(){
			System.out.println("The value of i is "+i);
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExample c1 = new ClassExample();
		ClassExample.class2 c2 = c1.new class2();
		c2.print();
	}

}
