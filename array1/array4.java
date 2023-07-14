package array1;

import java.util.Scanner;

public class array4 {
	
      
		public static void main(String[] args) {
	      Scanner scanner =new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int smallest = array[0];

	        for (int i = 1; i < size; i++) {
	            if (array[i] < smallest) {
	                smallest = array[i];
	            }
	        }
	        int gretest=array[0];
	        for (int i=1;i<size;i++)
	        {
	        	if (array[i]> gretest)
	        	{
	        		gretest=array[i];
	        	}
	        }

	        System.out.println("The smallest number in the array is: " + smallest);
	        System.out.println("The gretest number in the array is: " + gretest);
	        
    }

}
