package session_2;

public class StringConcatination {
	
	public static void main (String [] args) {
		
		//String Concatination 
		
		String x ="Test";
		String y =" Selenium";
		String c ="100";
		String d ="200";
		int a = 100;
		int b = 200;
		
		 System.out.println (x);
		 
		 System.out.println (x+y);
		
		 System.out.println (x+c);
		
		 System.out.println(d+y);
		 
		 System.out.println(a+c);
		
		 System.out.println(b+a);
		
		 System.out.println(b+x+c);
		 
		 System.out.println(a+y+x+d);
		 
		 
		 // USE CASE 
		 
		 int bill = 520;
		 int tax = 30;
		 int total = bill + tax;
		 System .out.println("The total bill is:" + total);
		
		 System.out.println("The total bill is :" + bill+ tax);
		 
		 //output is 52030 bcz you added the string 
		 
		 System.out.println("The total bill is :"+(bill+tax));  // Now this will overcome by () java will overcome the first bracket left to 
		 
		 
		 
		 // CHARACTER CONCATINATION
		 
		 char c1 = '5';    int z1 ='5';
		 char c2 ='4';     int z2= '4';
		 char c3 ='A';     String q1 = "A";
		 char c4 ='B';     String q2 ="B";
		 
	 
		 System.out.println(c1+c2);
     	 System.out.println(z1+q1);
	     System.out.println(z1+c1);
		 System .out.println(q1+q2);
		 System.out.println(c3+c4);
		 System.out.println(c4+q2);
		 System.out.println(c4+z2);
		 
		 
		 
		 
		 
		 
		 
	}

}
