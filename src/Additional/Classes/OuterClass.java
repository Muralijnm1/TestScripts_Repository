package Additional.Classes;

public class OuterClass {

	int n;
	private class Inner_class{
		public void print(){
			System.out.println("This is an inner class");
		}
	}
	
	//accessing the inner class from the method within
	
 public	void display_inner(){
		Inner_class inner = new Inner_class();
		inner.print();
	}
	
}
