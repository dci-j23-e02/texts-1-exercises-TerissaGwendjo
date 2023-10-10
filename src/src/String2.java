import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content of the email:");
        String content = scanner.nextLine();
        System.out.println("Enter the word to be searched:");
        String wordToSearch = scanner.nextLine();

        System.out.println("You found the word: " + wordToSearch);

        int number = content.indexOf(wordToSearch);

        if (number == -1) {
            System.out.println("Error the words are not found.");
        } else {
            System.out.println("The word is found: " + number);
        }
        scanner.close();

    }
}
