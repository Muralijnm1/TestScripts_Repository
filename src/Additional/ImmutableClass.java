package Additional;

import Additional.Classes.Student;

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("ABC",100);
		System.out.println(s.getName()+" "+s.getRegNo());
		
		//s.getRegNo()=102;

	}

}
