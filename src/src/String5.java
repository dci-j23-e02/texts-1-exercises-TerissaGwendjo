import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        if (name.equals("Mike")) {
            System.out.println("Hello MIke! You are my favourite Student.");
        } else {
            System.out.println("Hello, " + name + "!" + " You are one of my Students.");
        }
    }
}
