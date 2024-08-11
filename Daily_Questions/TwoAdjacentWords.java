public class Main {
    public static void main(String[] args) {
        String input = "ab cd aef gh"; // Example input
        String result = reverseAdjacentCharacters(input);
        System.out.println(result);
    }

    public static String reverseAdjacentCharacters(String str) {
        StringBuilder sb = new StringBuilder(str); // Use StringBuilder for mutable string
        for (int i = 0; i < sb.length() - 1; i++) {
            // Check if the current character and the next one are not spaces
            if (sb.charAt(i) != ' ' && sb.charAt(i + 1) != ' ') {
                // Swap the characters
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, temp);

                // Move the index forward by 2 to skip the next character
                i++;
            }
        }
        return sb.toString(); // Convert StringBuilder back to String
    }
}
