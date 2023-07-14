package first;

public class oprator {
	public static void main (String args[])
	{
	 System .out.println("Arithmetic operator");
	   int a=10;
	   int b=40;
	   System.out.println(" a="+a + " b="+b);
	   int res =a+b;
	   System.out.println("Addition is      :"+res);
	   int res1= a-b;
	   System.out.println("Substraction is  :"+res1);
	   
	   int res2= a*b;
	   System.out.println("Multiplication is:"+res2);
	   
	   int res3 =b/a;
	   System.out.println("Division  is     :"+res3);
	   
	   int res4 =b%a;
	   System.out.println("Mod is           :"+res4);
	   
	   
	 
	   
	   System.out.println("Logical  operator:");
	   boolean c= true;
	   boolean d= true;
	   boolean r =(c && d);
	   boolean r1= (c || d);
	   
	   System.out.println(" c && d:"+r);
	   System.out.println(" c || d:"+r1);
	   
	   
	   System.out.println("Comparison operator:");
	    int i=10;
		int j=20;
		
	    boolean eualres = (i==j);
	       System.out.println("i==j:" +eualres);
	   
	       boolean equal =(i>j);
		   System.out.println("i>j :"+equal);
		    
		   boolean equal1=(i<j);
		   System.out.println("i<j :"+equal1);
		   
		   boolean v =(i!=j);
		   System.out.println("i!=j:"+v);
		   
		   System .out.println("Increment and Decreament:");
		   int e=5;
		   System.out.println("e="+e);
		    e++;
		    System .out.println("e++:"+e);
		    e--;
			System.out.println ("e--:"+e);
			
			System.out.println("Bitwise opreator:");
			int f=2;
			int g=3;
			int v1= f & g;
			int v2=f  | g;
			
			System.out.println("f & g :"+v1);
			System.out.println("f | g :"+v2);
			
			
			System.out.println("Ternary operator:");
			
			int val4= (f>g)? 10: 30;
	        System.out.println("Ternary opreator is :"+val4);		
		   
		   
	   
	   
	}
}
