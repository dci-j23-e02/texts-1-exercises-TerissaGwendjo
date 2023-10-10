import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in two numbers ");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        // Concatenate num1 and num2
        String result = num1 + num2;

        // Print the concatenated result
        System.out.println("Concatenated Result: " + result);
        scanner.close();


    }
}
