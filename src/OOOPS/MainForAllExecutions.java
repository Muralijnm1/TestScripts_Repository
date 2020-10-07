package OOOPS;

import OOOPS.ReferanceClasses.ChildClass1;
import OOOPS.ReferanceClasses.ChildClass2;
import OOOPS.ReferanceClasses.Chrome;
import OOOPS.ReferanceClasses.CustomerAccount;
import OOOPS.ReferanceClasses.FireFox;
import OOOPS.ReferanceClasses.InternetExplorer;
import OOOPS.ReferanceClasses.ParentClass1;
import OOOPS.ReferanceClasses.ParentClass2;
import OOOPS.ReferanceClasses.StaticClass;
import OOOPS.ReferanceClasses.WebDriver;
import OOOPS.ReferanceClasses.methodOverloading;

public class MainForAllExecutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//objects and classes
		/*ChildClass1 c11 = new ChildClass1();
		c11.m1();		
		c11.m2();
		*/
		/*ChildClass1 c12 = (ChildClass1) new ParentClass1();
		c12.m1();
		c12.m2();*/
		
		//ChildClass1 c13 = new ParentClass1();//Type mismatch --Cannot convert the parent class into child class object
		
		/*ParentClass1 p11= new ParentClass1();
		p11.m1();
		
		ParentClass1 p12= new ChildClass1();
		p12.m1();*/
	//Encapsulation 	
	/*	int accountNumber=1234567;
		String passWord="Password@1234";
		double balance;
		CustomerAccount ac1 = new CustomerAccount();
		balance=ac1.getBalance(accountNumber, passWord);
		if (balance!=-1){
			System.out.println("The balance in your account is "+balance);}
			else{
				System.out.println("Invalid credentials");
	}*/
			
		
	//Method overloading###############################
/*		int n1=10,n2=20,n3=30;
		methodOverloading ml = new methodOverloading();
		System.out.println("The result of addition 2 numbers is "+ml.add(n1, n2));
		System.out.println("The result of addition 3 numbers is "+ml.add(n1, n2, n3));*/
		
	
	//Method overriding############################
/*	ParentClass2 p1 = new ParentClass2();
	p1.m1();
	ChildClass2 c1 = new ChildClass2();
	c1.m1();
	c1.parentm1();*/
	
	//Static class###########################
	//StaticClass sc = new StaticClass();
	
/*	System.out.println("The addition of the static values is "+StaticClass.add());
	System.out.println("The value of the static variable c is "+StaticClass.c);
	System.out.println("Calling method from inner static class method is "+StaticClass.inner.addInnerClass());
	StaticClass.c=50;
	System.out.println("The value of the static variable c after change is "+StaticClass.c);*/
		
	//Interface###################
	InternetExplorer driverIE = new InternetExplorer(); 
	driverIE.click();
	driverIE.close();
	driverIE.quit();
	
	FireFox driverFF = new FireFox();
	driverFF.click();
	driverFF.close();
	driverFF.quit();
	
	Chrome driverChrome = new Chrome();
	driverChrome.click();
	driverChrome.close();
	driverChrome.quit();
	
	
/*	WebDriver driverChrome1 = (WebDriver) new Chrome();
	driverChrome1.click();
	driverChrome1.close();
	driverChrome1.quit();*/
	
	
	
	
		
	}
		
	}


