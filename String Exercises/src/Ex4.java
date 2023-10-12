import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first String number ");
        String num1 = scanner.nextLine();
        System.out.println("Please enter the second String number ");
        String num2 = scanner.nextLine();

        String result = num1 + num2;
        System.out.println("The concatinated String number is : " + result);

    }
}
