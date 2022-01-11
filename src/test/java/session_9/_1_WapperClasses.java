package session_9;

public class _1_WapperClasses {
 
	public static void main(String[] args) {
		

	        String price ="$200";
			String price1 =price.replace('$','0');
			System.out.println("string after replacing $:"+price1);
			int Total = Integer.parseInt(price1);
			System.out.println("Integer addition of price1 and 50 :"+(Total + 50));
			

	}
}