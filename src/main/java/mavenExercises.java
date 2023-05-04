import org.apache.commons.lang3.StringUtils;

import java.io.CharArrayWriter;
import java.util.Scanner;

public class mavenExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = sc.nextLine();
        System.out.println("You entered: \"" + input + "\"");
        System.out.println("Flipped Case: \"" + reverseCase(input) + "\"");
        System.out.println("Reversed: \"" + StringUtils.reverse(input) + "\"");

    }

    public static String reverseCase(String input) {
        char[] letters = input.toCharArray();
        String output = "";
        for(Character letter : letters) {
            if(Character.isUpperCase(letter)) {
                output += Character.toLowerCase(letter);
            } else if(Character.isLowerCase(letter)) {
                output += Character.toUpperCase(letter);
            } else {
                output += letter;
            }
        }
        return output;
    }
}
