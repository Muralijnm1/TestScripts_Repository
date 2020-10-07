package OOOPS.ReferanceClasses;

public class StaticClass {

	public static int a;
	static public int b;
	public static int c=40;
	static {
		
		a=10;
		b=20;
	}
	public static int add(){
		return (a+b);
		
	}
	public static class inner{
		public static int addInnerClass(){
			return (a+b);
			
		}
	}
}
