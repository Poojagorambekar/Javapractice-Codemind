package String;

public class Reverse_Each_word {
	public static void main(String[] args) {
        String input = "Java Concept Of The Day";
        String reversed = reverseWords(input);
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            result.append(reversedWord).append(" ");
        }

            return result.toString().trim();
    }

}
