package array1;

import java.util.Scanner;

public class SecondLargest {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size =sc.nextInt();

	        int[] arr = new int[size];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int largestNumber = arr[0];
	        int secondLargestNumber = arr[0];

	        for (int i = 1; i < size; i++) {
	            if (arr[i] > largestNumber) {
	                secondLargestNumber = largestNumber;
	                largestNumber = arr[i];
	            } else if (arr[i] > secondLargestNumber && arr[i] != largestNumber) {
	                secondLargestNumber = arr[i];
	            }
	        }

	        System.out.println("The second largest number in the array is: " + secondLargestNumber);
	    }

}
