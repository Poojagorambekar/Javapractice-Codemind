package array2;

import java.util.Scanner;

public class SumOfTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of the arrays: ");
        int size =sc.nextInt();

        
        int[] array1 = new int[size];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] =sc.nextInt();
        }

        
        int[] array2 = new int[size];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }

        
        int[] sumArray = new int[size];
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

       
        System.out.println("First Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("Second Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

       
        System.out.println("Sum of the Arrays:");
        for (int i = 0; i < size; i++) {
            System.out.print(sumArray[i] + " ");
        }
        System.out.println();

        
    }
	}


