import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String word = scanner.nextLine();

        String reversedWord = reverseUsingLoop(word); 

        System.out.println("Reversed: " + reversedWord);
    }

    public static String reverseUsingLoop(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
