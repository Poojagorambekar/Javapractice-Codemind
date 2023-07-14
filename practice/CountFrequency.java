package practice;

import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int[]array=new int[10];
		for(int i=0;i<array.length;i++) {
	  array[i]=sc.nextInt();
		
	}
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int frequency=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]== number)
			{
				frequency++;
			}
				
		}
		System.out.println("The frequency of " + number + " is " + frequency); 

}
}
