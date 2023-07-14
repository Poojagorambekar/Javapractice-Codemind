package practice;

import java.util.Scanner;

public class conditional {
	
	void conditional(int num)
	{
		if(num%2==0)
		{
			System.out.println( +num+ " is even number ");
		}
		else
		{
			System.out.println(+num+ " is odd number");
		}
		
		
		
	}
	
	void pattern(int row)
	{
		for(int i=0;i<=row; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void sum(int number)
	{
		int result=0;
		for(int i=1;i<=number;i++)
			{	
			
			 result=result+i;
			}
		System.out.println("Sum of  natural number is:" +result);
	}
	
	void power(int base ,int exponent)
	{
		int result1 =1;
		
		 
		while(exponent !=0)
		{
			result1= result1 *base;
			exponent--;
		}
		System.out.println("Result is "+result1);
					
	}
	public static void main(String[] args) {
		conditional obj= new conditional();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		obj.conditional(num);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
		
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		obj.pattern(row);
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Enter the number");
		int number=sc.nextInt();
		obj.sum(number);
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Enetr the base");
		int base =sc.nextInt();
		System.out.println("Enter the exponent");
		int exponent=sc.nextInt();
		obj.power(base ,exponent);
		
		
	}

}
