package Programs;

import java.io.IOException;

public class Strings1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
/*		String s = new String("durga1");
		String s1="durga1";
		System.out.println(s);
		s= "duraga2";
		System.out.println(s);
		System.out.println(s1);*/
		//Runtime.getRuntime().exec("notepad");//will open a new notepad 
		//Runtime.getRuntime().exec("cmd /c start F://GitRepository//AllureReports22Apr2020//src//test//java//com//AllureReports//Resources//MavenTestRun.bat");
	
		String a = "hello";
		String c = "hello";
		String b = new String("hello");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
	}

}
