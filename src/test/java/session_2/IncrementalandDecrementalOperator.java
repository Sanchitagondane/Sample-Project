package session_2;

public class IncrementalandDecrementalOperator {
	
	public static void main(String[] args) {
		
		int a= 1;
	    a = a+1;
	    
	    System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		
		// PRE INCREMENT
		
		System.out.println("pre increment value");
		int i = 1;
        int j = ++i;
		
        System.out.println(i);
        System .out.println(j);
		
        
        // POST INCREMENT
        
        System.out.println("post increment value");
        int p = 1;
        int q = p++;
        System.out.println(p);
		System.out.println(q);
		
		
		
		//PRE DECEREMENTAL
		
		System.out.println("pre decerement value");
		int m =2;
		int n = --m;
		System.out.println(m);
		System.out.println(n);
		
		
		System.out.println("post decerement value");
		int c = 0;
		int d = c--;
		System.out.println(c);
		System.out.println(d);
		
		int f = -1;
		int g = --f;
		System.out.println(f);
		System.out.println(g);
		
		
		
		System.out.println("some example of increment and decerement oprator");
		
		int x =-2;
		int y = --x;
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("Ex-1");
		
		int e = -5;
		int b = e--;
		
		System.out.println(e);
		System.out.println(b);
		
		
		System.out.println("Ex-2");
		
		int u =2;
		int v = ++u;
		
		System.out.println(u);
		System.out.println(v);
		
		System.out.println("Ex - 3");
		
		int k= 10;
		int l = k++;
		System.out.println(k);
		System.out.println(l);
		
		
				
	}

}
