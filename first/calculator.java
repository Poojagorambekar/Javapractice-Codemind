package first;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		
	        Scanner scanner=new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        
	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        double quotient = num1 / num2;
	        
	        System.out.println("Sum is : " + sum);
	        System.out.println("Difference is: " + difference);
	        System.out.println("Product is: " + product);
	        System.out.println("division is: " + quotient);
	        
	        scanner.close();
	    }
}
