package String;

public class Reverse_string {
	public static void main(String[] args) {
		String str="MyJava";
        System.out.print("Input string: " + str);
        
        System.out.print("\nAfter reverse string is: ");
        for (int i = str.length(); i > 0; --i) {
            System.out.print(str.charAt(i - 1));
        }
		
	}

}
