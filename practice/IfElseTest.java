package practice;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		System.out.println("Enetr your age:");
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		boolean res =age>18;
		if(res)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		System.out.println("result:"+res);
	}

}
