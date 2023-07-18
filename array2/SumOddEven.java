package array2;

import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter  the Numbers ");
        String input = scanner.nextLine();
        Scanner numberScanner = new Scanner(input);

        while (numberScanner.hasNext()) {
            int num = numberScanner.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

      
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        

	}

}
