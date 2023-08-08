package String;

public class Count_character {
	public static void main(String[] args) {
		
		 String input = "java J2EE Java JSP J2EEE";
	        countCharacters(input);
	    }

	    public static void countCharacters(String input) {
	        int[] charCount = new int[256];

	        for (char c : input.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                char lowercaseC = Character.toLowerCase(c);
	                charCount[lowercaseC]++;
	            }
	        }

	        System.out.println("Character counts:");
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 0) {
	                System.out.println((char) i + ": " + charCount[i]);
	            }
	        }
		    }
}
