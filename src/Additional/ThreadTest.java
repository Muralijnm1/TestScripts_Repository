package Additional;

import Additional.Classes.Multi1;
import Additional.Classes.Multi2;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi1 t1 = new Multi1();
		t1.run();
		
		Multi2 m1 = new Multi2();
		m1.run();
	}

}
