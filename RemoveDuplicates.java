import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        String result = removeDuplicates(input);
        System.out.println(result);  
    }

    public static String removeDuplicates(String str) {
        String result = "";

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is already in the result
            if (!containsChar(result, currentChar)) {
                result = result+currentChar;
            }
        }

        return result;
    }

    // Helper method to check if a character is in a string
    public static boolean containsChar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
